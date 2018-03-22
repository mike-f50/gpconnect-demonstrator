INSERT INTO gpconnect.medications_html
  (nhsNumber,currentRepeatPast,startDate,medicationItem,scheduledEnd,daysDuration,details,lastIssued,reviewDate,numberIssued,maxIssues,typeMed)
VALUES
  (9476719966,"Past","01-07-2016","Metformin 500mg tablets","19-11-2019","Day Duration 4","3","Issue more","Issue more","Issue more","Issue more","4");

INSERT INTO gpconnect.encounters
  (id,nhsNumber,sectionDate,encounterDate,title,details)
VALUES
  (13,9476718897,'2016-07-01 12:17:00','2016-07-01 12:17:00',"Miss Tanya Turnpike (Practice Nurse) - Dr Johnson and Partners (J12345)","Result : Full blood count - FBC - Normal - No Action.");
  
INSERT INTO gpconnect.medication_statements
 (id,lastIssueDate,encounterId,statusCode,statusDisplay,medicationId,startDate,endDate,dateAsserted,
    patientId,takenCode,takenDisplay,dosageText,dosageInstruction)
VALUES
 (3,'2018-03-14',13,'active','Active',5,'2018-01-12','2018-07-12','2018-01-12',5,'unk','Unknown','Dosage text','Dosage instructions');

INSERT INTO gpconnect.medication_reason_codes
 (id,reasonCode,reasonDisplay)
VALUES
 (4,'409002','Food allergy diet');

INSERT INTO gpconnect.medication_notes
 (id,dateWritten,authorReferenceUrl,authorId,noteText)
VALUES
 (3,'2018-01-12','https://fhir.nhs.uk/STU3/StructureDefinition/CareConnect-GPC-Practitioner-1',2,'Patient 5 medication note 1'),
 (4,'2018-02-14','https://fhir.nhs.uk/STU3/StructureDefinition/CareConnect-GPC-Practitioner-1',1,'Patient 5 medication note 2');
 
INSERT INTO gpconnect.medication_statement_reason_codes
 (medicationStatementId,reasonCodeId)
VALUES
 (3,4);
 
INSERT INTO gpconnect.medication_statement_notes
 (medicationStatementId,noteId)
VALUES
 (3,3),
 (3,4);
 
INSERT INTO gpconnect.medication_reason_references
 (id,referenceUrl,referenceId)
VALUES
 (2,'https://fhir.nhs.uk/STU3/StructureDefinition/CareConnect-GPC-Observation-1',1);
 
INSERT INTO gpconnect.medication_statement_reason_references
 (medicationStatementId,reasonReferenceId)
VALUES
 (3,2);

INSERT INTO gpconnect.medication_requests
 (id,groupIdentifier,statusCode,statusDisplay,intentCode,intentDisplay,medicationId,patientId,encounterId,authoredOn,
 requesterUrl,requesterId,authorisingPractitionerId,dosageText,dosageInstruction,dispenseRequestStartDate,dispenseRequestEndDate,
 dispenseQuantityValue,dispenseQuantityUnit,dispenseQuantityText,expectedSupplyDuration,
 dispenseRequestOrganizationId,priorMedicationRequestId,numberOfRepeatPrescriptionsAllowed,numberOfRepeatPrescriptionsIssued,
 authorisationExpiryDate,prescriptionTypeCode,prescriptionTypeDisplay,statusReasonDate,statusReason)
VALUES
 (4,'group3','active','Active','plan','Plan',5,5,13,'2018-01-12',
 'https://fhir.nhs.uk/STU3/StructureDefinition/CareConnect-GPC-Practitioner-1',1,1,'Dosage Text','Dosage Instructions',
 '2018-01-18','2018-07-04',null,null,'28 tablets','28',2,null,6,3,'2018-07-16','repeat','Repeat',null,null),
 (5,'group3','active','Active','order','Order',5,5,13,'2018-01-12',
 'https://fhir.nhs.uk/STU3/StructureDefinition/CareConnect-GPC-Practitioner-1',1,1,'Dosage Text','Dosage Instructions',
 '2018-01-18','2018-02-15',null,null,'28 tablets','28',2,null,6,1,'2018-07-16','repeat','Repeat',null,null),
 (6,'group3','active','Active','order','Order',5,5,13,'2018-02-12',
 'https://fhir.nhs.uk/STU3/StructureDefinition/CareConnect-GPC-Practitioner-1',1,1,'Dosage Text','Dosage Instructions',
 '2018-02-12','2018-03-12',null,null,'28 tablets','28',2,5,6,2,'2018-07-16','repeat','Repeat',null,null),
 (7,'group3','active','Active','order','Order',5,5,13,'2018-03-12',
 'https://fhir.nhs.uk/STU3/StructureDefinition/CareConnect-GPC-Practitioner-1',1,1,'Dosage Text','Dosage Instructions',
 '2018-03-12','2018-04-09',null,null,'28 tablets','28',2,6,6,3,'2018-07-16','repeat','Repeat',null,null);

UPDATE gpconnect.medication_statements SET medicationRequestId = 4 WHERE id = 3;

INSERT INTO gpconnect.medication_request_based_on
 (id,referenceUrl,referenceId)
VALUES
 (3,'https://fhir.nhs.uk/STU3/StructureDefinition/CareConnect-GPC-MedicationRequest-1',4);

INSERT INTO gpconnect.medication_request_based_on_references
 (medicationRequestId,basedOnReferenceId)
VALUES
 (5,3),
 (6,3),
 (7,3);
 
INSERT INTO gpconnect.medication_request_reason_codes
 (medicationRequestId,reasonCodeId)
VALUES
 (4,4),
 (5,4),
 (6,4),
 (7,4);
 
INSERT INTO gpconnect.medication_request_notes
 (medicationRequestId,noteId)
VALUES
 (4,3),
 (5,3),
 (6,3),
 (7,3),
 (4,4),
 (5,4),
 (6,4),
 (7,4);