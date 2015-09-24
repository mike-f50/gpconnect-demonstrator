/*
 * Copyright 2015 Ripple OSI
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.rippleosi.patient.mdtreports.search;

import java.util.List;
import java.util.Map;

import org.rippleosi.common.exception.DataNotFoundException;
import org.rippleosi.common.service.AbstractQueryStrategy;
import org.rippleosi.patient.mdtreports.model.MDTReportDetails;

/**
 */
public class MDTReportDetailsQueryStrategy extends AbstractQueryStrategy<MDTReportDetails> {

    private final String reportId;

    MDTReportDetailsQueryStrategy(String patientId, String reportId) {
        super(patientId);
        this.reportId = reportId;
    }

    @Override
    public String getQuery(String ehrId) {
        return "select a/uid/value as uid, " +
                "a/context/start_time/value as date_created, " +
                "b_a/items/protocol/items[at0011]/value/value as service_team, " +
                "b_a/items/activities[at0001]/timing/value as meeting_date, " +
                "b_b/items/data[at0001]/items[at0004]/value/value as question, " +
                "b_c/items/data[at0001]/items[at0002]/value/value as notes " +
                "from EHR e[ehr_id/value='" + ehrId + "'] " +
                "contains COMPOSITION a[openEHR-EHR-COMPOSITION.report.v1] " +
                "contains ( " +
                "    SECTION b_a[openEHR-EHR-SECTION.referral_details_rcp.v1] and " +
                "    SECTION b_b[openEHR-EHR-SECTION.history_rcp.v1] and " +
                "    SECTION b_c[openEHR-EHR-SECTION.plan_requested_actions_rcp.v1]) " +
                "where a/name/value='MDT Output Report' " +
                "and a/uid/value='" + reportId + "' ";
    }

    @Override
    public MDTReportDetails transform(List<Map<String, Object>> resultSet) {

        if (resultSet.isEmpty()) {
            throw new DataNotFoundException("No results found");
        }

        Map<String, Object> data = resultSet.get(0);

        return new MDTReportDetailsTransformer().transform(data);
    }
}