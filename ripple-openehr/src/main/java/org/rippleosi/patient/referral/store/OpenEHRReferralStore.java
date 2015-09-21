package org.rippleosi.patient.referral.store;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Consume;
import org.rippleosi.common.service.AbstractOpenEhrService;
import org.rippleosi.common.service.CreateStrategy;
import org.rippleosi.common.service.DefaultStoreStrategy;
import org.rippleosi.common.service.UpdateStrategy;
import org.rippleosi.common.util.DateFormatter;
import org.rippleosi.patient.referral.model.ReferralDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 */
@Service
public class OpenEHRReferralStore extends AbstractOpenEhrService implements ReferralStore {

    @Value("${openehr.referralsTemplate}")
    private String referralsTemplate;

    private static final String REFERRALS_PREFIX = "referral/referral_details:0/";
    private static final String REFERRALS_REQUEST = REFERRALS_PREFIX + "referral_request/";
    private static final String ORDER_REFERRAL = REFERRALS_PREFIX + "order_referral/";

    @Override
    @Consume(uri = "activemq:Consumer.OpenEHR.VirtualTopic.Ripple.Referrals.Create")
    public void create(String patientId, ReferralDetails referral) {

        Map<String,Object> content = createFlatJsonContent(referral);

        CreateStrategy createStrategy = new DefaultStoreStrategy(patientId, referralsTemplate, content);

        createData(createStrategy);
    }

    @Override
    @Consume(uri = "activemq:Consumer.OpenEHR.VirtualTopic.Ripple.Referrals.Update")
    public void update(String patientId, ReferralDetails referral) {

        Map<String,Object> content = createFlatJsonContent(referral);

        UpdateStrategy updateStrategy = new DefaultStoreStrategy(referral.getSourceId(), patientId, referralsTemplate, content);

        updateData(updateStrategy);
    }

    private Map<String,Object> createFlatJsonContent(ReferralDetails referral) {

        Map<String, Object> content = new HashMap<>();

        content.put("ctx/language", "en");
        content.put("ctx/territory", "GB");

        String dateOfReferral = DateFormatter.toString(referral.getDateOfReferral());

        content.put(REFERRALS_REQUEST + "request/referral_to", referral.getReferralTo());
        content.put(REFERRALS_REQUEST + "request/reason_for_referral", referral.getReason());
        content.put(REFERRALS_REQUEST + "request/clinical_summary", referral.getClinicalSummary());
        content.put(REFERRALS_REQUEST + "request/timing", dateOfReferral);
        content.put(REFERRALS_REQUEST + "referral_from/unstructured_name", referral.getReferralFrom());
        content.put(REFERRALS_REQUEST + "narrative", referral.getReason());

        content.put(ORDER_REFERRAL + "ism_transition/current_state|code", "526");
        content.put(ORDER_REFERRAL + "ism_transition/current_state|value", "planned");
        content.put(ORDER_REFERRAL + "ism_transition/careflow_step|code", "at0002");
        content.put(ORDER_REFERRAL + "ism_transition/careflow_step|value", "Referral planned");
        content.put(ORDER_REFERRAL + "referral_to", referral.getReason());
        content.put(ORDER_REFERRAL + "receiver/address:0/address_type|code", "at0013");
        content.put(ORDER_REFERRAL + "receiver/address:0/location", "Leeds Royal Infirmary");
        content.put(ORDER_REFERRAL + "time", dateOfReferral);

        return content;
    }
}
