package uk.gov.hscic.model.medication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.utilities.ucum.Decimal;

public class MedicationRequestDetail {
	
	private Long id;
	private List<MedicationBasedOnReference> basedOnReferences;
	private String groupIdentifier;
	private String statusCode;
	private String statusDisplay;
	private String intentCode;
	private String intentDisplay;
	private Long medicationId;
	private Long patientId;
	private Long encounterId;
	private Date authoredOn;
	private String requesterUrl;
	private Long requesterId;
	private Long authorisingPractitionerId;
	private List<MedicationReasonCode> reasonCodes;
	private List<MedicationReasonReference> reasonReferences;
	private List<MedicationNote> notes;
	private String dosageText;
	private String dosageInstructions;
    private Date dispenseRequestStartDate;
    private Date dispenseRequestEndDate;
    private Decimal dispenseQuantityValue;
    private String dispenseQuantityUnit;
    private String dispenseQuantityText;
    private Decimal expectedSupplyDuration;
    private Long dispenseRequestOrganizationId;
    private Long priorMedicationRequestId;
    private Integer numberOfRepeatPrescriptionsAllowed;
    private Integer numberOfRepeatPrescriptionsIssued;
    private Date authorisationExpiryDate;
    private String prescriptionTypeCode;
    private String prescriptionTypeDisplay;    
    private Date statusReasonDate;	
    private String statusReasonCode;
    private String statusReasonValue;
	
    public Long getId() {
		return id;
	}
	
    public void setId(Long id) {
		this.id = id;
	}
	
    public List<MedicationBasedOnReference> getBasedOnReferences() {
		return basedOnReferences;
	}
	
    public void setBasedOnReferences(List<MedicationBasedOnReference> basedOnReferences) {
		this.basedOnReferences = basedOnReferences;
	}
    
    public void addBasedOnReference(MedicationBasedOnReference basedOnReference) {
    	if(this.basedOnReferences == null) {
    		this.basedOnReferences = new ArrayList<>();
    	}
    	
    	this.basedOnReferences.add(basedOnReference);
    }
	
    public String getGroupIdentifier() {
		return groupIdentifier;
	}
	
    public void setGroupIdentifier(String groupIdentifier) {
		this.groupIdentifier = groupIdentifier;
	}
	
    public String getStatusCode() {
		return statusCode;
	}
	
    public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
    public String getStatusDisplay() {
		return statusDisplay;
	}
	
    public void setStatusDisplay(String statusDisplay) {
		this.statusDisplay = statusDisplay;
	}
	
    public String getIntentCode() {
		return intentCode;
	}
	
    public void setIntentCode(String intentCode) {
		this.intentCode = intentCode;
	}
	
    public String getIntentDisplay() {
		return intentDisplay;
	}
	
    public void setIntentDisplay(String intentDisplay) {
		this.intentDisplay = intentDisplay;
	}
	
    public Long getMedicationId() {
		return medicationId;
	}
	
    public void setMedicationId(Long medicationId) {
		this.medicationId = medicationId;
	}
	
    public Long getPatientId() {
		return patientId;
	}
	
    public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	
    public Long getEncounterId() {
		return encounterId;
	}
	
    public void setEncounterId(Long encounterId) {
		this.encounterId = encounterId;
	}
	
    public Date getAuthoredOn() {
		return authoredOn;
	}
	
    public void setAuthoredOn(Date authoredOn) {
		this.authoredOn = authoredOn;
	}
	
    public String getRequesterUrl() {
		return requesterUrl;
	}
	
    public void setRequesterUrl(String requesterUrl) {
		this.requesterUrl = requesterUrl;
	}
	
    public Long getRequesterId() {
		return requesterId;
	}
	
    public void setRequesterId(Long requesterId) {
		this.requesterId = requesterId;
	}
	
    public Long getAuthorisingPractitionerId() {
		return authorisingPractitionerId;
	}
	
    public void setAuthorisingPractitionerId(Long authorisingPractitionerId) {
		this.authorisingPractitionerId = authorisingPractitionerId;
	}
	
    public List<MedicationReasonCode> getReasonCodes() {
		return reasonCodes;
	}
	
    public void setReasonCodes(List<MedicationReasonCode> reasonCodes) {
		this.reasonCodes = reasonCodes;
	}
    
    public void addReasonCode(MedicationReasonCode reasonCode) {
    	if(this.reasonCodes == null) {
    		this.reasonCodes = new ArrayList<>();
    	}
    	this.reasonCodes.add(reasonCode);
    }
	
    public List<MedicationReasonReference> getReasonReferences() {
		return reasonReferences;
	}
	
    public void setReasonReferences(List<MedicationReasonReference> reasonReferences) {
		this.reasonReferences = reasonReferences;
	}
    
    public void addReasonReference(MedicationReasonReference reasonReference) {
    	if(this.reasonReferences == null) {
    		this.reasonReferences = new ArrayList<>();
    	}
    	this.reasonReferences.add(reasonReference);
    }
	
    public List<MedicationNote> getNotes() {
		return notes;
	}
	
    public void setNotes(List<MedicationNote> notes) {
		this.notes = notes;
	}
    
    public void addNote(MedicationNote note) {
    	if(this.notes == null) {
    		this.notes = new ArrayList<>();
    	}
    	this.notes.add(note);
    }
	
    public String getDosageText() {
		return dosageText;
	}
	
    public void setDosageText(String dosageText) {
		this.dosageText = dosageText;
	}
	
    public String getDosageInstructions() {
		return dosageInstructions;
	}
	
    public void setDosageInstructions(String dosageInstructions) {
		this.dosageInstructions = dosageInstructions;
	}
	
    public Date getDispenseRequestStartDate() {
		return dispenseRequestStartDate;
	}
	
    public void setDispenseRequestStartDate(Date dispenseRequestStartDate) {
		this.dispenseRequestStartDate = dispenseRequestStartDate;
	}
	
    public Date getDispenseRequestEndDate() {
		return dispenseRequestEndDate;
	}
	
    public void setDispenseRequestEndDate(Date dispenseRequestEndDate) {
		this.dispenseRequestEndDate = dispenseRequestEndDate;
	}
	
    public Decimal getDispenseQuantityValue() {
		return dispenseQuantityValue;
	}
	
    public void setDispenseQuantityValue(Decimal dispenseQuantityValue) {
		this.dispenseQuantityValue = dispenseQuantityValue;
	}
	
    public String getDispenseQuantityUnit() {
		return dispenseQuantityUnit;
	}
	
    public void setDispenseQuantityUnit(String dispenseQuantityUnit) {
		this.dispenseQuantityUnit = dispenseQuantityUnit;
	}
	
    public String getDispenseQuantityText() {
		return dispenseQuantityText;
	}
	
    public void setDispenseQuantityText(String dispenseQuantityText) {
		this.dispenseQuantityText = dispenseQuantityText;
	}
	
    public Decimal getExpectedSupplyDuration() {
		return expectedSupplyDuration;
	}
	
    public void setExpectedSupplyDuration(Decimal expectedSupplyDuration) {
		this.expectedSupplyDuration = expectedSupplyDuration;
	}
	
    public Long getDispenseRequestOrganizationId() {
		return dispenseRequestOrganizationId;
	}
	
    public void setDispenseRequestOrganizationId(Long dispenseRequestOrganizationId) {
		this.dispenseRequestOrganizationId = dispenseRequestOrganizationId;
	}
	
    public Long getPriorMedicationRequestId() {
		return priorMedicationRequestId;
	}
	
    public void setPriorMedicationRequestId(Long priorMedicationRequestId) {
		this.priorMedicationRequestId = priorMedicationRequestId;
	}
	
    public Integer getNumberOfRepeatPrescriptionsAllowed() {
		return numberOfRepeatPrescriptionsAllowed;
	}
	
    public void setNumberOfRepeatPrescriptionsAllowed(Integer numberOfRepeatPrescriptionsAllowed) {
		this.numberOfRepeatPrescriptionsAllowed = numberOfRepeatPrescriptionsAllowed;
	}
	
    public Integer getNumberOfRepeatPrescriptionsIssued() {
		return numberOfRepeatPrescriptionsIssued;
	}
	
    public void setNumberOfRepeatPrescriptionsIssued(Integer numberOfRepeatPrescriptionsIssued) {
		this.numberOfRepeatPrescriptionsIssued = numberOfRepeatPrescriptionsIssued;
	}
	
    public Date getAuthorisationExpiryDate() {
		return authorisationExpiryDate;
	}
	
    public void setAuthorisationExpiryDate(Date authorisationExpiryDate) {
		this.authorisationExpiryDate = authorisationExpiryDate;
	}
	
    public String getPrescriptionTypeCode() {
		return prescriptionTypeCode;
	}
	
    public void setPrescriptionTypeCode(String prescriptionTypeCode) {
		this.prescriptionTypeCode = prescriptionTypeCode;
	}
	
    public String getPrescriptionTypeDisplay() {
		return prescriptionTypeDisplay;
	}
	
    public void setPrescriptionTypeDisplay(String prescriptionTypeDisplay) {
		this.prescriptionTypeDisplay = prescriptionTypeDisplay;
	}
	
    public Date getStatusReasonDate() {
		return statusReasonDate;
	}
	
    public void setStatusReasonDate(Date statusReasonDate) {
		this.statusReasonDate = statusReasonDate;
	}
	
    public String getStatusReasonCode() {
		return statusReasonCode;
	}
	
    public void setStatusReasonCode(String statusReasonCode) {
		this.statusReasonCode = statusReasonCode;
	}
	
    public String getStatusReasonValue() {
		return statusReasonValue;
	}
	
    public void setStatusReasonValue(String statusReasonValue) {
		this.statusReasonValue = statusReasonValue;
	}
    
}