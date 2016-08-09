
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.epic_clinical.RefillAuthorizationRequestToBeInitiatedBy;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.ArrayOfDeliveryMethod;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.CancelReturnToStockMethod;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.ContactMethodType;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.DEACode;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.DeliveryDestination;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.DeliveryMethod;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.PatientPaymentMethod;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.RARStatus;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.RefillAuthorizationRequestMode;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices2015.pharmacy.clinical.epic package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Prescription_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Prescription");
    private final static QName _CreditCard_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CreditCard");
    private final static QName _ArrayOfPrescription_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfPrescription");
    private final static QName _ArrayOfFYI_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfFYI");
    private final static QName _ArrayOfCreditCard_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfCreditCard");
    private final static QName _ContactMethod_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ContactMethod");
    private final static QName _FillRequest_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FillRequest");
    private final static QName _ArrayOfDocument_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfDocument");
    private final static QName _ArrayOfCreditCardPayment_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfCreditCardPayment");
    private final static QName _PrescriptionInfo_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PrescriptionInfo");
    private final static QName _ArrayOfAdvanceFillStatusRequest_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfAdvanceFillStatusRequest");
    private final static QName _Provider_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Provider");
    private final static QName _Pharmacy_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Pharmacy");
    private final static QName _DispenseFillRequest_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DispenseFillRequest");
    private final static QName _ArrayOfFlag_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfFlag");
    private final static QName _ArrayOfFillRequest_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfFillRequest");
    private final static QName _Fill_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Fill");
    private final static QName _ArrayOfUpdatePrescriptionResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfUpdatePrescriptionResult");
    private final static QName _ArrayOfCancelFillRequest_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfCancelFillRequest");
    private final static QName _CreditCardPayment_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CreditCardPayment");
    private final static QName _ArrayOfFill_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfFill");
    private final static QName _ArrayOfDispenseFillRequest_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfDispenseFillRequest");
    private final static QName _AdvanceFillStatusRequest_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "AdvanceFillStatusRequest");
    private final static QName _Flag_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Flag");
    private final static QName _Document_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Document");
    private final static QName _ArrayOfContactMethod_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfContactMethod");
    private final static QName _Patient_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Patient");
    private final static QName _FYI_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FYI");
    private final static QName _UpdateResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "UpdateResult");
    private final static QName _UpdatePrescriptionResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "UpdatePrescriptionResult");
    private final static QName _CancelFillRequest_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CancelFillRequest");
    private final static QName _CreditCardBillingStreet_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "BillingStreet");
    private final static QName _CreditCardId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Id");
    private final static QName _CreditCardCardholderName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CardholderName");
    private final static QName _CreditCardBrandName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "BrandName");
    private final static QName _CreditCardBrand_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Brand");
    private final static QName _CreditCardBillingZIP_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "BillingZIP");
    private final static QName _CreditCardBillingCity_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "BillingCity");
    private final static QName _CreditCardLastFourDigits_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "LastFourDigits");
    private final static QName _CreditCardBillingStateAbbr_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "BillingStateAbbr");
    private final static QName _FillRequestPrescriptionId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PrescriptionId");
    private final static QName _FillRequestFillQuantity_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FillQuantity");
    private final static QName _FillRequestTimestamp_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Timestamp");
    private final static QName _FillRequestFreeTextPrescription_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FreeTextPrescription");
    private final static QName _FillRequestCommentsURI_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CommentsURI");
    private final static QName _FillRequestRefillAuthorizationRequestToBeInitiatedBy_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "RefillAuthorizationRequestToBeInitiatedBy");
    private final static QName _FillRequestComments_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Comments");
    private final static QName _GetVersionResponseGetVersionResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "GetVersionResult");
    private final static QName _GetCreditCardsPatientMRN_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "patientMRN");
    private final static QName _GetCreditCardsPharmacyNCPDPId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "pharmacyNCPDPId");
    private final static QName _AdvanceFillStatusResponseAdvanceFillStatusResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "AdvanceFillStatusResult");
    private final static QName _GetPrescriptionInfoResponseGetPrescriptionInfoResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "GetPrescriptionInfoResult");
    private final static QName _AdvanceFillStatusRequestAdvancedDateTime_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "AdvancedDateTime");
    private final static QName _AdvanceFillStatusRequestFillId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FillId");
    private final static QName _AdvanceFillStatusRequestStatus_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Status");
    private final static QName _AdvanceFillStatusRequestFillIdentifierType_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FillIdentifierType");
    private final static QName _RequestFillsPickupDateTime_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "pickupDateTime");
    private final static QName _RequestFillsContactRequested_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "contactRequested");
    private final static QName _RequestFillsContactMethods_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "contactMethods");
    private final static QName _RequestFillsCommentsURI_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "commentsURI");
    private final static QName _RequestFillsUserIdType_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "userIdType");
    private final static QName _RequestFillsFreeTextPickupPharmacy_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "freeTextPickupPharmacy");
    private final static QName _RequestFillsCreditCardId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "creditCardId");
    private final static QName _RequestFillsDeliveryMethod_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "deliveryMethod");
    private final static QName _RequestFillsSystemId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "systemId");
    private final static QName _RequestFillsDeliveryComments_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "deliveryComments");
    private final static QName _RequestFillsWorkstationId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "workstationId");
    private final static QName _RequestFillsComments_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "comments");
    private final static QName _RequestFillsDeliveryDestination_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "deliveryDestination");
    private final static QName _RequestFillsPaymentMethod_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "paymentMethod");
    private final static QName _RequestFillsRequests_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "requests");
    private final static QName _RequestFillsPickupPharmacyNCPDPId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "pickupPharmacyNCPDPId");
    private final static QName _RequestFillsRequestedNotificationsWhenFilled_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "RequestedNotificationsWhenFilled");
    private final static QName _RequestFillsUserId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "userId");
    private final static QName _DocumentStatusName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "StatusName");
    private final static QName _DocumentTypeName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "TypeName");
    private final static QName _DocumentExpirationDate_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ExpirationDate");
    private final static QName _DocumentType_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Type");
    private final static QName _UpdateResultErrorMessage_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ErrorMessage");
    private final static QName _UpdateResultUpdatePrescriptionResults_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "UpdatePrescriptionResults");
    private final static QName _CreditCardPaymentChargeAmount_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ChargeAmount");
    private final static QName _ProviderStateAbbreviation_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "StateAbbreviation");
    private final static QName _ProviderPhoneNumber_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PhoneNumber");
    private final static QName _ProviderZIPCode_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ZIPCode");
    private final static QName _ProviderDisplayName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DisplayName");
    private final static QName _ProviderStreetAddress_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "StreetAddress");
    private final static QName _ProviderCity_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "City");
    private final static QName _ProviderState_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "State");
    private final static QName _ProviderFaxNumber_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FaxNumber");
    private final static QName _DispenseFillsResponseDispenseFillsResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DispenseFillsResult");
    private final static QName _UpdatePrescriptionResultUpdateTimestamp_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "UpdateTimestamp");
    private final static QName _PharmacyCountry_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Country");
    private final static QName _PharmacyCountryAbbreviation_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CountryAbbreviation");
    private final static QName _PharmacyEarliestAvailablePickupFromNow_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "EarliestAvailablePickupFromNow");
    private final static QName _PharmacyAvailableDeliveryMethods_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "AvailableDeliveryMethods");
    private final static QName _PharmacyNCPDPId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "NCPDPId");
    private final static QName _PharmacyCounty_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "County");
    private final static QName _GetPrescriptionInfoByIdPrescriptionId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "prescriptionId");
    private final static QName _GetPrescriptionInfoByIdFillId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "fillId");
    private final static QName _DispenseFillRequestCustomerIdType_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CustomerIdType");
    private final static QName _DispenseFillRequestCustomerIdNumber_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CustomerIdNumber");
    private final static QName _DispenseFillRequestDispensedDateTime_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DispensedDateTime");
    private final static QName _DispenseFillRequestCounselingPharmacistProviderIdType_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CounselingPharmacistProviderIdType");
    private final static QName _DispenseFillRequestCounselingPharmacistUserIdType_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CounselingPharmacistUserIdType");
    private final static QName _DispenseFillRequestCounselingPharmacistUserId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CounselingPharmacistUserId");
    private final static QName _DispenseFillRequestAmountCollected_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "AmountCollected");
    private final static QName _DispenseFillRequestCustomerIdIssuedBy_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CustomerIdIssuedBy");
    private final static QName _DispenseFillRequestCustomerIdExpirationDate_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CustomerIdExpirationDate");
    private final static QName _DispenseFillRequestCounselingPharmacistProviderId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CounselingPharmacistProviderId");
    private final static QName _FillSecondaryPaymentAmountCovered_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "SecondaryPaymentAmountCovered");
    private final static QName _FillPrescriptionNumber_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PrescriptionNumber");
    private final static QName _FillDaySupply_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DaySupply");
    private final static QName _FillTertiaryPayor_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "TertiaryPayor");
    private final static QName _FillPatientPayAmountTotal_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PatientPayAmountTotal");
    private final static QName _FillTertiaryPaymentAmountCovered_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "TertiaryPaymentAmountCovered");
    private final static QName _FillCreditCardPayments_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CreditCardPayments");
    private final static QName _FillPatientPayAmountDue_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PatientPayAmountDue");
    private final static QName _FillSecondaryPayor_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "SecondaryPayor");
    private final static QName _FillNdc_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Ndc");
    private final static QName _FillPrimaryPlan_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PrimaryPlan");
    private final static QName _FillFillingPharmacyNCPDPId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FillingPharmacyNCPDPId");
    private final static QName _FillTertiaryPlan_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "TertiaryPlan");
    private final static QName _FillSecondaryPlan_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "SecondaryPlan");
    private final static QName _FillPrimaryPaymentAmountCovered_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PrimaryPaymentAmountCovered");
    private final static QName _FillQuantity_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Quantity");
    private final static QName _FillTertiaryPaymentMethod_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "TertiaryPaymentMethod");
    private final static QName _FillDispensedOn_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DispensedOn");
    private final static QName _FillFlags_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Flags");
    private final static QName _FillDeliveryMethod_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DeliveryMethod");
    private final static QName _FillSecondaryPaymentMethod_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "SecondaryPaymentMethod");
    private final static QName _FillPickupPharmacyDisplayName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PickupPharmacyDisplayName");
    private final static QName _FillPrimaryPayor_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PrimaryPayor");
    private final static QName _FillPickupPharmacyNCPDPId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PickupPharmacyNCPDPId");
    private final static QName _FillPrimaryPaymentMethod_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PrimaryPaymentMethod");
    private final static QName _FillFillingPharmacyDisplayName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FillingPharmacyDisplayName");
    private final static QName _FillTrackingNumber_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "TrackingNumber");
    private final static QName _FlagAddedDateTime_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "AddedDateTime");
    private final static QName _FlagDescription_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Description");
    private final static QName _FlagAddedBy_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "AddedBy");
    private final static QName _CancelFillRequestCanceledDateTime_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CanceledDateTime");
    private final static QName _CancelFillRequestCancelReturnToStockMethod_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CancelReturnToStockMethod");
    private final static QName _CancelFillRequestRefundedAmount_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "RefundedAmount");
    private final static QName _CancelFillsReturnPharmacyNcpdpId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "returnPharmacyNcpdpId");
    private final static QName _CancelFillsCancelReason_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "cancelReason");
    private final static QName _CancelFillsCancelingPharmacyNcpdpId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "cancelingPharmacyNcpdpId");
    private final static QName _GetPrescriptionInfoPrescriptionNumber_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "prescriptionNumber");
    private final static QName _RequestFillsResponseRequestFillsResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "RequestFillsResult");
    private final static QName _PatientLastName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "LastName");
    private final static QName _PatientHomePhone_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "HomePhone");
    private final static QName _PatientWorkPhone_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "WorkPhone");
    private final static QName _PatientAcademic_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Academic");
    private final static QName _PatientFirstName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FirstName");
    private final static QName _PatientEmailAddress_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "EmailAddress");
    private final static QName _PatientMobilePhone_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "MobilePhone");
    private final static QName _PatientPreferredName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PreferredName");
    private final static QName _PatientAddressContactName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "AddressContactName");
    private final static QName _PatientPreferredNameType_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PreferredNameType");
    private final static QName _PatientCreditCards_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CreditCards");
    private final static QName _PatientFullName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FullName");
    private final static QName _PatientMedicalRecordNumber_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "MedicalRecordNumber");
    private final static QName _PatientZipCode_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ZipCode");
    private final static QName _PatientFYIs_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FYIs");
    private final static QName _PatientTitle_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Title");
    private final static QName _PatientSuffix_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Suffix");
    private final static QName _PatientPharmacyDocuments_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "PharmacyDocuments");
    private final static QName _PatientDateOfBirth_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DateOfBirth");
    private final static QName _PatientEnterpriseId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "EnterpriseId");
    private final static QName _PatientMiddleName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "MiddleName");
    private final static QName _ContactMethodData_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Data");
    private final static QName _GetCreditCardsResponseGetCreditCardsResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "GetCreditCardsResult");
    private final static QName _FYIComment_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Comment");
    private final static QName _FYITypeId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "TypeId");
    private final static QName _PrescriptionRARPrescriptionNumber_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "RARPrescriptionNumber");
    private final static QName _PrescriptionFrequency_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Frequency");
    private final static QName _PrescriptionRoute_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Route");
    private final static QName _PrescriptionOwningPharmacy_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "OwningPharmacy");
    private final static QName _PrescriptionMedication_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Medication");
    private final static QName _PrescriptionDEACode_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DEACode");
    private final static QName _PrescriptionStartDate_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "StartDate");
    private final static QName _PrescriptionAuthorizingProviderDisplayName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "AuthorizingProviderDisplayName");
    private final static QName _PrescriptionLastFilled_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "LastFilled");
    private final static QName _PrescriptionReasonNotFillable_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ReasonNotFillable");
    private final static QName _PrescriptionLastFilledDaysSupply_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "LastFilledDaysSupply");
    private final static QName _PrescriptionDose_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Dose");
    private final static QName _PrescriptionRARStatus_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "RARStatus");
    private final static QName _PrescriptionOrderingProviderDisplayName_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "OrderingProviderDisplayName");
    private final static QName _PrescriptionFills_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Fills");
    private final static QName _PrescriptionSig_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Sig");
    private final static QName _PrescriptionReasonNotRARable_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "ReasonNotRARable");
    private final static QName _PrescriptionRefillAuthorizationProvider_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "RefillAuthorizationProvider");
    private final static QName _PrescriptionRefillAuthorizationRequestMode_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "RefillAuthorizationRequestMode");
    private final static QName _PrescriptionDEACodeNumber_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DEACodeNumber");
    private final static QName _PrescriptionDEACodeTitle_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "DEACodeTitle");
    private final static QName _PrescriptionFirstFilled_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "FirstFilled");
    private final static QName _PrescriptionEndDate_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "EndDate");
    private final static QName _PrescriptionRARPrescriptionId_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "RARPrescriptionId");
    private final static QName _GetPrescriptionInfoByIdResponseGetPrescriptionInfoByIdResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "GetPrescriptionInfoByIdResult");
    private final static QName _CancelFillsResponseCancelFillsResult_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "CancelFillsResult");
    private final static QName _PrescriptionInfoPrescriptions_QNAME = new QName("Epic.Clinical.Pharmacy.WebServices2015", "Prescriptions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices2015.pharmacy.clinical.epic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link GetCreditCards }
     * 
     */
    public GetCreditCards createGetCreditCards() {
        return new GetCreditCards();
    }

    /**
     * Create an instance of {@link AdvanceFillStatusResponse }
     * 
     */
    public AdvanceFillStatusResponse createAdvanceFillStatusResponse() {
        return new AdvanceFillStatusResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCreditCardPayment }
     * 
     */
    public ArrayOfCreditCardPayment createArrayOfCreditCardPayment() {
        return new ArrayOfCreditCardPayment();
    }

    /**
     * Create an instance of {@link ArrayOfPrescription }
     * 
     */
    public ArrayOfPrescription createArrayOfPrescription() {
        return new ArrayOfPrescription();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link ArrayOfDocument }
     * 
     */
    public ArrayOfDocument createArrayOfDocument() {
        return new ArrayOfDocument();
    }

    /**
     * Create an instance of {@link DispenseFillsResponse }
     * 
     */
    public DispenseFillsResponse createDispenseFillsResponse() {
        return new DispenseFillsResponse();
    }

    /**
     * Create an instance of {@link UpdatePrescriptionResult }
     * 
     */
    public UpdatePrescriptionResult createUpdatePrescriptionResult() {
        return new UpdatePrescriptionResult();
    }

    /**
     * Create an instance of {@link ArrayOfAdvanceFillStatusRequest }
     * 
     */
    public ArrayOfAdvanceFillStatusRequest createArrayOfAdvanceFillStatusRequest() {
        return new ArrayOfAdvanceFillStatusRequest();
    }

    /**
     * Create an instance of {@link Pharmacy }
     * 
     */
    public Pharmacy createPharmacy() {
        return new Pharmacy();
    }

    /**
     * Create an instance of {@link DispenseFillRequest }
     * 
     */
    public DispenseFillRequest createDispenseFillRequest() {
        return new DispenseFillRequest();
    }

    /**
     * Create an instance of {@link CancelFillRequest }
     * 
     */
    public CancelFillRequest createCancelFillRequest() {
        return new CancelFillRequest();
    }

    /**
     * Create an instance of {@link DispenseFills }
     * 
     */
    public DispenseFills createDispenseFills() {
        return new DispenseFills();
    }

    /**
     * Create an instance of {@link GetPrescriptionInfo }
     * 
     */
    public GetPrescriptionInfo createGetPrescriptionInfo() {
        return new GetPrescriptionInfo();
    }

    /**
     * Create an instance of {@link RequestFillsResponse }
     * 
     */
    public RequestFillsResponse createRequestFillsResponse() {
        return new RequestFillsResponse();
    }

    /**
     * Create an instance of {@link GetVersion }
     * 
     */
    public GetVersion createGetVersion() {
        return new GetVersion();
    }

    /**
     * Create an instance of {@link GetCreditCardsResponse }
     * 
     */
    public GetCreditCardsResponse createGetCreditCardsResponse() {
        return new GetCreditCardsResponse();
    }

    /**
     * Create an instance of {@link FYI }
     * 
     */
    public FYI createFYI() {
        return new FYI();
    }

    /**
     * Create an instance of {@link Prescription }
     * 
     */
    public Prescription createPrescription() {
        return new Prescription();
    }

    /**
     * Create an instance of {@link ArrayOfFillRequest }
     * 
     */
    public ArrayOfFillRequest createArrayOfFillRequest() {
        return new ArrayOfFillRequest();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link FillRequest }
     * 
     */
    public FillRequest createFillRequest() {
        return new FillRequest();
    }

    /**
     * Create an instance of {@link GetPrescriptionInfoResponse }
     * 
     */
    public GetPrescriptionInfoResponse createGetPrescriptionInfoResponse() {
        return new GetPrescriptionInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFill }
     * 
     */
    public ArrayOfFill createArrayOfFill() {
        return new ArrayOfFill();
    }

    /**
     * Create an instance of {@link AdvanceFillStatusRequest }
     * 
     */
    public AdvanceFillStatusRequest createAdvanceFillStatusRequest() {
        return new AdvanceFillStatusRequest();
    }

    /**
     * Create an instance of {@link ArrayOfUpdatePrescriptionResult }
     * 
     */
    public ArrayOfUpdatePrescriptionResult createArrayOfUpdatePrescriptionResult() {
        return new ArrayOfUpdatePrescriptionResult();
    }

    /**
     * Create an instance of {@link RequestFills }
     * 
     */
    public RequestFills createRequestFills() {
        return new RequestFills();
    }

    /**
     * Create an instance of {@link ArrayOfDispenseFillRequest }
     * 
     */
    public ArrayOfDispenseFillRequest createArrayOfDispenseFillRequest() {
        return new ArrayOfDispenseFillRequest();
    }

    /**
     * Create an instance of {@link UpdateResult }
     * 
     */
    public UpdateResult createUpdateResult() {
        return new UpdateResult();
    }

    /**
     * Create an instance of {@link CreditCardPayment }
     * 
     */
    public CreditCardPayment createCreditCardPayment() {
        return new CreditCardPayment();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link AdvanceFillStatus }
     * 
     */
    public AdvanceFillStatus createAdvanceFillStatus() {
        return new AdvanceFillStatus();
    }

    /**
     * Create an instance of {@link GetPrescriptionInfoById }
     * 
     */
    public GetPrescriptionInfoById createGetPrescriptionInfoById() {
        return new GetPrescriptionInfoById();
    }

    /**
     * Create an instance of {@link ArrayOfFYI }
     * 
     */
    public ArrayOfFYI createArrayOfFYI() {
        return new ArrayOfFYI();
    }

    /**
     * Create an instance of {@link Fill }
     * 
     */
    public Fill createFill() {
        return new Fill();
    }

    /**
     * Create an instance of {@link Flag }
     * 
     */
    public Flag createFlag() {
        return new Flag();
    }

    /**
     * Create an instance of {@link CancelFills }
     * 
     */
    public CancelFills createCancelFills() {
        return new CancelFills();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link ContactMethod }
     * 
     */
    public ContactMethod createContactMethod() {
        return new ContactMethod();
    }

    /**
     * Create an instance of {@link ArrayOfFlag }
     * 
     */
    public ArrayOfFlag createArrayOfFlag() {
        return new ArrayOfFlag();
    }

    /**
     * Create an instance of {@link ArrayOfCancelFillRequest }
     * 
     */
    public ArrayOfCancelFillRequest createArrayOfCancelFillRequest() {
        return new ArrayOfCancelFillRequest();
    }

    /**
     * Create an instance of {@link GetPrescriptionInfoByIdResponse }
     * 
     */
    public GetPrescriptionInfoByIdResponse createGetPrescriptionInfoByIdResponse() {
        return new GetPrescriptionInfoByIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCreditCard }
     * 
     */
    public ArrayOfCreditCard createArrayOfCreditCard() {
        return new ArrayOfCreditCard();
    }

    /**
     * Create an instance of {@link CancelFillsResponse }
     * 
     */
    public CancelFillsResponse createCancelFillsResponse() {
        return new CancelFillsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfContactMethod }
     * 
     */
    public ArrayOfContactMethod createArrayOfContactMethod() {
        return new ArrayOfContactMethod();
    }

    /**
     * Create an instance of {@link PrescriptionInfo }
     * 
     */
    public PrescriptionInfo createPrescriptionInfo() {
        return new PrescriptionInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Prescription")
    public JAXBElement<Prescription> createPrescription(Prescription value) {
        return new JAXBElement<Prescription>(_Prescription_QNAME, Prescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CreditCard")
    public JAXBElement<CreditCard> createCreditCard(CreditCard value) {
        return new JAXBElement<CreditCard>(_CreditCard_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfPrescription")
    public JAXBElement<ArrayOfPrescription> createArrayOfPrescription(ArrayOfPrescription value) {
        return new JAXBElement<ArrayOfPrescription>(_ArrayOfPrescription_QNAME, ArrayOfPrescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFYI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfFYI")
    public JAXBElement<ArrayOfFYI> createArrayOfFYI(ArrayOfFYI value) {
        return new JAXBElement<ArrayOfFYI>(_ArrayOfFYI_QNAME, ArrayOfFYI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfCreditCard")
    public JAXBElement<ArrayOfCreditCard> createArrayOfCreditCard(ArrayOfCreditCard value) {
        return new JAXBElement<ArrayOfCreditCard>(_ArrayOfCreditCard_QNAME, ArrayOfCreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ContactMethod")
    public JAXBElement<ContactMethod> createContactMethod(ContactMethod value) {
        return new JAXBElement<ContactMethod>(_ContactMethod_QNAME, ContactMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FillRequest")
    public JAXBElement<FillRequest> createFillRequest(FillRequest value) {
        return new JAXBElement<FillRequest>(_FillRequest_QNAME, FillRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfDocument")
    public JAXBElement<ArrayOfDocument> createArrayOfDocument(ArrayOfDocument value) {
        return new JAXBElement<ArrayOfDocument>(_ArrayOfDocument_QNAME, ArrayOfDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreditCardPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfCreditCardPayment")
    public JAXBElement<ArrayOfCreditCardPayment> createArrayOfCreditCardPayment(ArrayOfCreditCardPayment value) {
        return new JAXBElement<ArrayOfCreditCardPayment>(_ArrayOfCreditCardPayment_QNAME, ArrayOfCreditCardPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrescriptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrescriptionInfo")
    public JAXBElement<PrescriptionInfo> createPrescriptionInfo(PrescriptionInfo value) {
        return new JAXBElement<PrescriptionInfo>(_PrescriptionInfo_QNAME, PrescriptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdvanceFillStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfAdvanceFillStatusRequest")
    public JAXBElement<ArrayOfAdvanceFillStatusRequest> createArrayOfAdvanceFillStatusRequest(ArrayOfAdvanceFillStatusRequest value) {
        return new JAXBElement<ArrayOfAdvanceFillStatusRequest>(_ArrayOfAdvanceFillStatusRequest_QNAME, ArrayOfAdvanceFillStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Provider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Provider")
    public JAXBElement<Provider> createProvider(Provider value) {
        return new JAXBElement<Provider>(_Provider_QNAME, Provider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pharmacy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Pharmacy")
    public JAXBElement<Pharmacy> createPharmacy(Pharmacy value) {
        return new JAXBElement<Pharmacy>(_Pharmacy_QNAME, Pharmacy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DispenseFillRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DispenseFillRequest")
    public JAXBElement<DispenseFillRequest> createDispenseFillRequest(DispenseFillRequest value) {
        return new JAXBElement<DispenseFillRequest>(_DispenseFillRequest_QNAME, DispenseFillRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfFlag")
    public JAXBElement<ArrayOfFlag> createArrayOfFlag(ArrayOfFlag value) {
        return new JAXBElement<ArrayOfFlag>(_ArrayOfFlag_QNAME, ArrayOfFlag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFillRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfFillRequest")
    public JAXBElement<ArrayOfFillRequest> createArrayOfFillRequest(ArrayOfFillRequest value) {
        return new JAXBElement<ArrayOfFillRequest>(_ArrayOfFillRequest_QNAME, ArrayOfFillRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Fill")
    public JAXBElement<Fill> createFill(Fill value) {
        return new JAXBElement<Fill>(_Fill_QNAME, Fill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdatePrescriptionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfUpdatePrescriptionResult")
    public JAXBElement<ArrayOfUpdatePrescriptionResult> createArrayOfUpdatePrescriptionResult(ArrayOfUpdatePrescriptionResult value) {
        return new JAXBElement<ArrayOfUpdatePrescriptionResult>(_ArrayOfUpdatePrescriptionResult_QNAME, ArrayOfUpdatePrescriptionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCancelFillRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfCancelFillRequest")
    public JAXBElement<ArrayOfCancelFillRequest> createArrayOfCancelFillRequest(ArrayOfCancelFillRequest value) {
        return new JAXBElement<ArrayOfCancelFillRequest>(_ArrayOfCancelFillRequest_QNAME, ArrayOfCancelFillRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CreditCardPayment")
    public JAXBElement<CreditCardPayment> createCreditCardPayment(CreditCardPayment value) {
        return new JAXBElement<CreditCardPayment>(_CreditCardPayment_QNAME, CreditCardPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfFill")
    public JAXBElement<ArrayOfFill> createArrayOfFill(ArrayOfFill value) {
        return new JAXBElement<ArrayOfFill>(_ArrayOfFill_QNAME, ArrayOfFill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDispenseFillRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfDispenseFillRequest")
    public JAXBElement<ArrayOfDispenseFillRequest> createArrayOfDispenseFillRequest(ArrayOfDispenseFillRequest value) {
        return new JAXBElement<ArrayOfDispenseFillRequest>(_ArrayOfDispenseFillRequest_QNAME, ArrayOfDispenseFillRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvanceFillStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "AdvanceFillStatusRequest")
    public JAXBElement<AdvanceFillStatusRequest> createAdvanceFillStatusRequest(AdvanceFillStatusRequest value) {
        return new JAXBElement<AdvanceFillStatusRequest>(_AdvanceFillStatusRequest_QNAME, AdvanceFillStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Flag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Flag")
    public JAXBElement<Flag> createFlag(Flag value) {
        return new JAXBElement<Flag>(_Flag_QNAME, Flag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContactMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfContactMethod")
    public JAXBElement<ArrayOfContactMethod> createArrayOfContactMethod(ArrayOfContactMethod value) {
        return new JAXBElement<ArrayOfContactMethod>(_ArrayOfContactMethod_QNAME, ArrayOfContactMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Patient")
    public JAXBElement<Patient> createPatient(Patient value) {
        return new JAXBElement<Patient>(_Patient_QNAME, Patient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FYI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FYI")
    public JAXBElement<FYI> createFYI(FYI value) {
        return new JAXBElement<FYI>(_FYI_QNAME, FYI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "UpdateResult")
    public JAXBElement<UpdateResult> createUpdateResult(UpdateResult value) {
        return new JAXBElement<UpdateResult>(_UpdateResult_QNAME, UpdateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePrescriptionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "UpdatePrescriptionResult")
    public JAXBElement<UpdatePrescriptionResult> createUpdatePrescriptionResult(UpdatePrescriptionResult value) {
        return new JAXBElement<UpdatePrescriptionResult>(_UpdatePrescriptionResult_QNAME, UpdatePrescriptionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelFillRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CancelFillRequest")
    public JAXBElement<CancelFillRequest> createCancelFillRequest(CancelFillRequest value) {
        return new JAXBElement<CancelFillRequest>(_CancelFillRequest_QNAME, CancelFillRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "BillingStreet", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBillingStreet(String value) {
        return new JAXBElement<String>(_CreditCardBillingStreet_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Id", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardId(String value) {
        return new JAXBElement<String>(_CreditCardId_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CardholderName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardCardholderName(String value) {
        return new JAXBElement<String>(_CreditCardCardholderName_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "BrandName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBrandName(String value) {
        return new JAXBElement<String>(_CreditCardBrandName_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Brand", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBrand(String value) {
        return new JAXBElement<String>(_CreditCardBrand_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "BillingZIP", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBillingZIP(String value) {
        return new JAXBElement<String>(_CreditCardBillingZIP_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "BillingCity", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBillingCity(String value) {
        return new JAXBElement<String>(_CreditCardBillingCity_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "LastFourDigits", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardLastFourDigits(String value) {
        return new JAXBElement<String>(_CreditCardLastFourDigits_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "BillingStateAbbr", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardBillingStateAbbr(String value) {
        return new JAXBElement<String>(_CreditCardBillingStateAbbr_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrescriptionId", scope = FillRequest.class)
    public JAXBElement<String> createFillRequestPrescriptionId(String value) {
        return new JAXBElement<String>(_FillRequestPrescriptionId_QNAME, String.class, FillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FillQuantity", scope = FillRequest.class)
    public JAXBElement<Integer> createFillRequestFillQuantity(Integer value) {
        return new JAXBElement<Integer>(_FillRequestFillQuantity_QNAME, Integer.class, FillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Timestamp", scope = FillRequest.class)
    public JAXBElement<XMLGregorianCalendar> createFillRequestTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FillRequestTimestamp_QNAME, XMLGregorianCalendar.class, FillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FreeTextPrescription", scope = FillRequest.class)
    public JAXBElement<String> createFillRequestFreeTextPrescription(String value) {
        return new JAXBElement<String>(_FillRequestFreeTextPrescription_QNAME, String.class, FillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CommentsURI", scope = FillRequest.class)
    public JAXBElement<String> createFillRequestCommentsURI(String value) {
        return new JAXBElement<String>(_FillRequestCommentsURI_QNAME, String.class, FillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillAuthorizationRequestToBeInitiatedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "RefillAuthorizationRequestToBeInitiatedBy", scope = FillRequest.class)
    public JAXBElement<RefillAuthorizationRequestToBeInitiatedBy> createFillRequestRefillAuthorizationRequestToBeInitiatedBy(RefillAuthorizationRequestToBeInitiatedBy value) {
        return new JAXBElement<RefillAuthorizationRequestToBeInitiatedBy>(_FillRequestRefillAuthorizationRequestToBeInitiatedBy_QNAME, RefillAuthorizationRequestToBeInitiatedBy.class, FillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Comments", scope = FillRequest.class)
    public JAXBElement<String> createFillRequestComments(String value) {
        return new JAXBElement<String>(_FillRequestComments_QNAME, String.class, FillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "GetVersionResult", scope = GetVersionResponse.class)
    public JAXBElement<String> createGetVersionResponseGetVersionResult(String value) {
        return new JAXBElement<String>(_GetVersionResponseGetVersionResult_QNAME, String.class, GetVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "patientMRN", scope = GetCreditCards.class)
    public JAXBElement<String> createGetCreditCardsPatientMRN(String value) {
        return new JAXBElement<String>(_GetCreditCardsPatientMRN_QNAME, String.class, GetCreditCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "pharmacyNCPDPId", scope = GetCreditCards.class)
    public JAXBElement<String> createGetCreditCardsPharmacyNCPDPId(String value) {
        return new JAXBElement<String>(_GetCreditCardsPharmacyNCPDPId_QNAME, String.class, GetCreditCards.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "AdvanceFillStatusResult", scope = AdvanceFillStatusResponse.class)
    public JAXBElement<UpdateResult> createAdvanceFillStatusResponseAdvanceFillStatusResult(UpdateResult value) {
        return new JAXBElement<UpdateResult>(_AdvanceFillStatusResponseAdvanceFillStatusResult_QNAME, UpdateResult.class, AdvanceFillStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrescriptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "GetPrescriptionInfoResult", scope = GetPrescriptionInfoResponse.class)
    public JAXBElement<PrescriptionInfo> createGetPrescriptionInfoResponseGetPrescriptionInfoResult(PrescriptionInfo value) {
        return new JAXBElement<PrescriptionInfo>(_GetPrescriptionInfoResponseGetPrescriptionInfoResult_QNAME, PrescriptionInfo.class, GetPrescriptionInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrescriptionId", scope = AdvanceFillStatusRequest.class)
    public JAXBElement<String> createAdvanceFillStatusRequestPrescriptionId(String value) {
        return new JAXBElement<String>(_FillRequestPrescriptionId_QNAME, String.class, AdvanceFillStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "AdvancedDateTime", scope = AdvanceFillStatusRequest.class)
    public JAXBElement<XMLGregorianCalendar> createAdvanceFillStatusRequestAdvancedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdvanceFillStatusRequestAdvancedDateTime_QNAME, XMLGregorianCalendar.class, AdvanceFillStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FillId", scope = AdvanceFillStatusRequest.class)
    public JAXBElement<String> createAdvanceFillStatusRequestFillId(String value) {
        return new JAXBElement<String>(_AdvanceFillStatusRequestFillId_QNAME, String.class, AdvanceFillStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Status", scope = AdvanceFillStatusRequest.class)
    public JAXBElement<String> createAdvanceFillStatusRequestStatus(String value) {
        return new JAXBElement<String>(_AdvanceFillStatusRequestStatus_QNAME, String.class, AdvanceFillStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FillIdentifierType", scope = AdvanceFillStatusRequest.class)
    public JAXBElement<String> createAdvanceFillStatusRequestFillIdentifierType(String value) {
        return new JAXBElement<String>(_AdvanceFillStatusRequestFillIdentifierType_QNAME, String.class, AdvanceFillStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "pickupDateTime", scope = RequestFills.class)
    public JAXBElement<XMLGregorianCalendar> createRequestFillsPickupDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RequestFillsPickupDateTime_QNAME, XMLGregorianCalendar.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "contactRequested", scope = RequestFills.class)
    public JAXBElement<Boolean> createRequestFillsContactRequested(Boolean value) {
        return new JAXBElement<Boolean>(_RequestFillsContactRequested_QNAME, Boolean.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContactMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "contactMethods", scope = RequestFills.class)
    public JAXBElement<ArrayOfContactMethod> createRequestFillsContactMethods(ArrayOfContactMethod value) {
        return new JAXBElement<ArrayOfContactMethod>(_RequestFillsContactMethods_QNAME, ArrayOfContactMethod.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "commentsURI", scope = RequestFills.class)
    public JAXBElement<String> createRequestFillsCommentsURI(String value) {
        return new JAXBElement<String>(_RequestFillsCommentsURI_QNAME, String.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "userIdType", scope = RequestFills.class)
    public JAXBElement<String> createRequestFillsUserIdType(String value) {
        return new JAXBElement<String>(_RequestFillsUserIdType_QNAME, String.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "freeTextPickupPharmacy", scope = RequestFills.class)
    public JAXBElement<String> createRequestFillsFreeTextPickupPharmacy(String value) {
        return new JAXBElement<String>(_RequestFillsFreeTextPickupPharmacy_QNAME, String.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "creditCardId", scope = RequestFills.class)
    public JAXBElement<String> createRequestFillsCreditCardId(String value) {
        return new JAXBElement<String>(_RequestFillsCreditCardId_QNAME, String.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "deliveryMethod", scope = RequestFills.class)
    public JAXBElement<DeliveryMethod> createRequestFillsDeliveryMethod(DeliveryMethod value) {
        return new JAXBElement<DeliveryMethod>(_RequestFillsDeliveryMethod_QNAME, DeliveryMethod.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "systemId", scope = RequestFills.class)
    public JAXBElement<String> createRequestFillsSystemId(String value) {
        return new JAXBElement<String>(_RequestFillsSystemId_QNAME, String.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "deliveryComments", scope = RequestFills.class)
    public JAXBElement<String> createRequestFillsDeliveryComments(String value) {
        return new JAXBElement<String>(_RequestFillsDeliveryComments_QNAME, String.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "workstationId", scope = RequestFills.class)
    public JAXBElement<String> createRequestFillsWorkstationId(String value) {
        return new JAXBElement<String>(_RequestFillsWorkstationId_QNAME, String.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "comments", scope = RequestFills.class)
    public JAXBElement<String> createRequestFillsComments(String value) {
        return new JAXBElement<String>(_RequestFillsComments_QNAME, String.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "deliveryDestination", scope = RequestFills.class)
    public JAXBElement<DeliveryDestination> createRequestFillsDeliveryDestination(DeliveryDestination value) {
        return new JAXBElement<DeliveryDestination>(_RequestFillsDeliveryDestination_QNAME, DeliveryDestination.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatientPaymentMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "paymentMethod", scope = RequestFills.class)
    public JAXBElement<PatientPaymentMethod> createRequestFillsPaymentMethod(PatientPaymentMethod value) {
        return new JAXBElement<PatientPaymentMethod>(_RequestFillsPaymentMethod_QNAME, PatientPaymentMethod.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFillRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "requests", scope = RequestFills.class)
    public JAXBElement<ArrayOfFillRequest> createRequestFillsRequests(ArrayOfFillRequest value) {
        return new JAXBElement<ArrayOfFillRequest>(_RequestFillsRequests_QNAME, ArrayOfFillRequest.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "pickupPharmacyNCPDPId", scope = RequestFills.class)
    public JAXBElement<String> createRequestFillsPickupPharmacyNCPDPId(String value) {
        return new JAXBElement<String>(_RequestFillsPickupPharmacyNCPDPId_QNAME, String.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContactMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "RequestedNotificationsWhenFilled", scope = RequestFills.class)
    public JAXBElement<ArrayOfContactMethod> createRequestFillsRequestedNotificationsWhenFilled(ArrayOfContactMethod value) {
        return new JAXBElement<ArrayOfContactMethod>(_RequestFillsRequestedNotificationsWhenFilled_QNAME, ArrayOfContactMethod.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "userId", scope = RequestFills.class)
    public JAXBElement<String> createRequestFillsUserId(String value) {
        return new JAXBElement<String>(_RequestFillsUserId_QNAME, String.class, RequestFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "StatusName", scope = Document.class)
    public JAXBElement<String> createDocumentStatusName(String value) {
        return new JAXBElement<String>(_DocumentStatusName_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "TypeName", scope = Document.class)
    public JAXBElement<String> createDocumentTypeName(String value) {
        return new JAXBElement<String>(_DocumentTypeName_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Id", scope = Document.class)
    public JAXBElement<String> createDocumentId(String value) {
        return new JAXBElement<String>(_CreditCardId_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ExpirationDate", scope = Document.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentExpirationDate_QNAME, XMLGregorianCalendar.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Status", scope = Document.class)
    public JAXBElement<String> createDocumentStatus(String value) {
        return new JAXBElement<String>(_AdvanceFillStatusRequestStatus_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Type", scope = Document.class)
    public JAXBElement<String> createDocumentType(String value) {
        return new JAXBElement<String>(_DocumentType_QNAME, String.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ErrorMessage", scope = UpdateResult.class)
    public JAXBElement<String> createUpdateResultErrorMessage(String value) {
        return new JAXBElement<String>(_UpdateResultErrorMessage_QNAME, String.class, UpdateResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdatePrescriptionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "UpdatePrescriptionResults", scope = UpdateResult.class)
    public JAXBElement<ArrayOfUpdatePrescriptionResult> createUpdateResultUpdatePrescriptionResults(ArrayOfUpdatePrescriptionResult value) {
        return new JAXBElement<ArrayOfUpdatePrescriptionResult>(_UpdateResultUpdatePrescriptionResults_QNAME, ArrayOfUpdatePrescriptionResult.class, UpdateResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CreditCard", scope = CreditCardPayment.class)
    public JAXBElement<CreditCard> createCreditCardPaymentCreditCard(CreditCard value) {
        return new JAXBElement<CreditCard>(_CreditCard_QNAME, CreditCard.class, CreditCardPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ChargeAmount", scope = CreditCardPayment.class)
    public JAXBElement<Double> createCreditCardPaymentChargeAmount(Double value) {
        return new JAXBElement<Double>(_CreditCardPaymentChargeAmount_QNAME, Double.class, CreditCardPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "StateAbbreviation", scope = Provider.class)
    public JAXBElement<String> createProviderStateAbbreviation(String value) {
        return new JAXBElement<String>(_ProviderStateAbbreviation_QNAME, String.class, Provider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PhoneNumber", scope = Provider.class)
    public JAXBElement<String> createProviderPhoneNumber(String value) {
        return new JAXBElement<String>(_ProviderPhoneNumber_QNAME, String.class, Provider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Id", scope = Provider.class)
    public JAXBElement<String> createProviderId(String value) {
        return new JAXBElement<String>(_CreditCardId_QNAME, String.class, Provider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ZIPCode", scope = Provider.class)
    public JAXBElement<String> createProviderZIPCode(String value) {
        return new JAXBElement<String>(_ProviderZIPCode_QNAME, String.class, Provider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DisplayName", scope = Provider.class)
    public JAXBElement<String> createProviderDisplayName(String value) {
        return new JAXBElement<String>(_ProviderDisplayName_QNAME, String.class, Provider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "StreetAddress", scope = Provider.class)
    public JAXBElement<String> createProviderStreetAddress(String value) {
        return new JAXBElement<String>(_ProviderStreetAddress_QNAME, String.class, Provider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "City", scope = Provider.class)
    public JAXBElement<String> createProviderCity(String value) {
        return new JAXBElement<String>(_ProviderCity_QNAME, String.class, Provider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "State", scope = Provider.class)
    public JAXBElement<String> createProviderState(String value) {
        return new JAXBElement<String>(_ProviderState_QNAME, String.class, Provider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FaxNumber", scope = Provider.class)
    public JAXBElement<String> createProviderFaxNumber(String value) {
        return new JAXBElement<String>(_ProviderFaxNumber_QNAME, String.class, Provider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DispenseFillsResult", scope = DispenseFillsResponse.class)
    public JAXBElement<UpdateResult> createDispenseFillsResponseDispenseFillsResult(UpdateResult value) {
        return new JAXBElement<UpdateResult>(_DispenseFillsResponseDispenseFillsResult_QNAME, UpdateResult.class, DispenseFillsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "systemId", scope = AdvanceFillStatus.class)
    public JAXBElement<String> createAdvanceFillStatusSystemId(String value) {
        return new JAXBElement<String>(_RequestFillsSystemId_QNAME, String.class, AdvanceFillStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "userIdType", scope = AdvanceFillStatus.class)
    public JAXBElement<String> createAdvanceFillStatusUserIdType(String value) {
        return new JAXBElement<String>(_RequestFillsUserIdType_QNAME, String.class, AdvanceFillStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "workstationId", scope = AdvanceFillStatus.class)
    public JAXBElement<String> createAdvanceFillStatusWorkstationId(String value) {
        return new JAXBElement<String>(_RequestFillsWorkstationId_QNAME, String.class, AdvanceFillStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdvanceFillStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "requests", scope = AdvanceFillStatus.class)
    public JAXBElement<ArrayOfAdvanceFillStatusRequest> createAdvanceFillStatusRequests(ArrayOfAdvanceFillStatusRequest value) {
        return new JAXBElement<ArrayOfAdvanceFillStatusRequest>(_RequestFillsRequests_QNAME, ArrayOfAdvanceFillStatusRequest.class, AdvanceFillStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "userId", scope = AdvanceFillStatus.class)
    public JAXBElement<String> createAdvanceFillStatusUserId(String value) {
        return new JAXBElement<String>(_RequestFillsUserId_QNAME, String.class, AdvanceFillStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "pharmacyNCPDPId", scope = AdvanceFillStatus.class)
    public JAXBElement<String> createAdvanceFillStatusPharmacyNCPDPId(String value) {
        return new JAXBElement<String>(_GetCreditCardsPharmacyNCPDPId_QNAME, String.class, AdvanceFillStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrescriptionId", scope = UpdatePrescriptionResult.class)
    public JAXBElement<String> createUpdatePrescriptionResultPrescriptionId(String value) {
        return new JAXBElement<String>(_FillRequestPrescriptionId_QNAME, String.class, UpdatePrescriptionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FillId", scope = UpdatePrescriptionResult.class)
    public JAXBElement<String> createUpdatePrescriptionResultFillId(String value) {
        return new JAXBElement<String>(_AdvanceFillStatusRequestFillId_QNAME, String.class, UpdatePrescriptionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ErrorMessage", scope = UpdatePrescriptionResult.class)
    public JAXBElement<String> createUpdatePrescriptionResultErrorMessage(String value) {
        return new JAXBElement<String>(_UpdateResultErrorMessage_QNAME, String.class, UpdatePrescriptionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "UpdateTimestamp", scope = UpdatePrescriptionResult.class)
    public JAXBElement<XMLGregorianCalendar> createUpdatePrescriptionResultUpdateTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdatePrescriptionResultUpdateTimestamp_QNAME, XMLGregorianCalendar.class, UpdatePrescriptionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PhoneNumber", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyPhoneNumber(String value) {
        return new JAXBElement<String>(_ProviderPhoneNumber_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Country", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyCountry(String value) {
        return new JAXBElement<String>(_PharmacyCountry_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DisplayName", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyDisplayName(String value) {
        return new JAXBElement<String>(_ProviderDisplayName_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "City", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyCity(String value) {
        return new JAXBElement<String>(_ProviderCity_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CountryAbbreviation", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyCountryAbbreviation(String value) {
        return new JAXBElement<String>(_PharmacyCountryAbbreviation_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "EarliestAvailablePickupFromNow", scope = Pharmacy.class)
    public JAXBElement<XMLGregorianCalendar> createPharmacyEarliestAvailablePickupFromNow(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PharmacyEarliestAvailablePickupFromNow_QNAME, XMLGregorianCalendar.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "StateAbbreviation", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyStateAbbreviation(String value) {
        return new JAXBElement<String>(_ProviderStateAbbreviation_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Id", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyId(String value) {
        return new JAXBElement<String>(_CreditCardId_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ZIPCode", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyZIPCode(String value) {
        return new JAXBElement<String>(_ProviderZIPCode_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeliveryMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "AvailableDeliveryMethods", scope = Pharmacy.class)
    public JAXBElement<ArrayOfDeliveryMethod> createPharmacyAvailableDeliveryMethods(ArrayOfDeliveryMethod value) {
        return new JAXBElement<ArrayOfDeliveryMethod>(_PharmacyAvailableDeliveryMethods_QNAME, ArrayOfDeliveryMethod.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "StreetAddress", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyStreetAddress(String value) {
        return new JAXBElement<String>(_ProviderStreetAddress_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "NCPDPId", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyNCPDPId(String value) {
        return new JAXBElement<String>(_PharmacyNCPDPId_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "County", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyCounty(String value) {
        return new JAXBElement<String>(_PharmacyCounty_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "State", scope = Pharmacy.class)
    public JAXBElement<String> createPharmacyState(String value) {
        return new JAXBElement<String>(_ProviderState_QNAME, String.class, Pharmacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "systemId", scope = GetPrescriptionInfoById.class)
    public JAXBElement<String> createGetPrescriptionInfoByIdSystemId(String value) {
        return new JAXBElement<String>(_RequestFillsSystemId_QNAME, String.class, GetPrescriptionInfoById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "prescriptionId", scope = GetPrescriptionInfoById.class)
    public JAXBElement<String> createGetPrescriptionInfoByIdPrescriptionId(String value) {
        return new JAXBElement<String>(_GetPrescriptionInfoByIdPrescriptionId_QNAME, String.class, GetPrescriptionInfoById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "fillId", scope = GetPrescriptionInfoById.class)
    public JAXBElement<String> createGetPrescriptionInfoByIdFillId(String value) {
        return new JAXBElement<String>(_GetPrescriptionInfoByIdFillId_QNAME, String.class, GetPrescriptionInfoById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "pharmacyNCPDPId", scope = GetPrescriptionInfoById.class)
    public JAXBElement<String> createGetPrescriptionInfoByIdPharmacyNCPDPId(String value) {
        return new JAXBElement<String>(_GetCreditCardsPharmacyNCPDPId_QNAME, String.class, GetPrescriptionInfoById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CustomerIdType", scope = DispenseFillRequest.class)
    public JAXBElement<String> createDispenseFillRequestCustomerIdType(String value) {
        return new JAXBElement<String>(_DispenseFillRequestCustomerIdType_QNAME, String.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CustomerIdNumber", scope = DispenseFillRequest.class)
    public JAXBElement<String> createDispenseFillRequestCustomerIdNumber(String value) {
        return new JAXBElement<String>(_DispenseFillRequestCustomerIdNumber_QNAME, String.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrescriptionId", scope = DispenseFillRequest.class)
    public JAXBElement<String> createDispenseFillRequestPrescriptionId(String value) {
        return new JAXBElement<String>(_FillRequestPrescriptionId_QNAME, String.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DispensedDateTime", scope = DispenseFillRequest.class)
    public JAXBElement<XMLGregorianCalendar> createDispenseFillRequestDispensedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DispenseFillRequestDispensedDateTime_QNAME, XMLGregorianCalendar.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CounselingPharmacistProviderIdType", scope = DispenseFillRequest.class)
    public JAXBElement<String> createDispenseFillRequestCounselingPharmacistProviderIdType(String value) {
        return new JAXBElement<String>(_DispenseFillRequestCounselingPharmacistProviderIdType_QNAME, String.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CounselingPharmacistUserIdType", scope = DispenseFillRequest.class)
    public JAXBElement<String> createDispenseFillRequestCounselingPharmacistUserIdType(String value) {
        return new JAXBElement<String>(_DispenseFillRequestCounselingPharmacistUserIdType_QNAME, String.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CounselingPharmacistUserId", scope = DispenseFillRequest.class)
    public JAXBElement<String> createDispenseFillRequestCounselingPharmacistUserId(String value) {
        return new JAXBElement<String>(_DispenseFillRequestCounselingPharmacistUserId_QNAME, String.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FillId", scope = DispenseFillRequest.class)
    public JAXBElement<String> createDispenseFillRequestFillId(String value) {
        return new JAXBElement<String>(_AdvanceFillStatusRequestFillId_QNAME, String.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "AmountCollected", scope = DispenseFillRequest.class)
    public JAXBElement<Double> createDispenseFillRequestAmountCollected(Double value) {
        return new JAXBElement<Double>(_DispenseFillRequestAmountCollected_QNAME, Double.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CustomerIdIssuedBy", scope = DispenseFillRequest.class)
    public JAXBElement<String> createDispenseFillRequestCustomerIdIssuedBy(String value) {
        return new JAXBElement<String>(_DispenseFillRequestCustomerIdIssuedBy_QNAME, String.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CustomerIdExpirationDate", scope = DispenseFillRequest.class)
    public JAXBElement<XMLGregorianCalendar> createDispenseFillRequestCustomerIdExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DispenseFillRequestCustomerIdExpirationDate_QNAME, XMLGregorianCalendar.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CounselingPharmacistProviderId", scope = DispenseFillRequest.class)
    public JAXBElement<String> createDispenseFillRequestCounselingPharmacistProviderId(String value) {
        return new JAXBElement<String>(_DispenseFillRequestCounselingPharmacistProviderId_QNAME, String.class, DispenseFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "SecondaryPaymentAmountCovered", scope = Fill.class)
    public JAXBElement<Double> createFillSecondaryPaymentAmountCovered(Double value) {
        return new JAXBElement<Double>(_FillSecondaryPaymentAmountCovered_QNAME, Double.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrescriptionNumber", scope = Fill.class)
    public JAXBElement<String> createFillPrescriptionNumber(String value) {
        return new JAXBElement<String>(_FillPrescriptionNumber_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DaySupply", scope = Fill.class)
    public JAXBElement<Integer> createFillDaySupply(Integer value) {
        return new JAXBElement<Integer>(_FillDaySupply_QNAME, Integer.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "TertiaryPayor", scope = Fill.class)
    public JAXBElement<String> createFillTertiaryPayor(String value) {
        return new JAXBElement<String>(_FillTertiaryPayor_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PatientPayAmountTotal", scope = Fill.class)
    public JAXBElement<Double> createFillPatientPayAmountTotal(Double value) {
        return new JAXBElement<Double>(_FillPatientPayAmountTotal_QNAME, Double.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "TertiaryPaymentAmountCovered", scope = Fill.class)
    public JAXBElement<Double> createFillTertiaryPaymentAmountCovered(Double value) {
        return new JAXBElement<Double>(_FillTertiaryPaymentAmountCovered_QNAME, Double.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreditCardPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CreditCardPayments", scope = Fill.class)
    public JAXBElement<ArrayOfCreditCardPayment> createFillCreditCardPayments(ArrayOfCreditCardPayment value) {
        return new JAXBElement<ArrayOfCreditCardPayment>(_FillCreditCardPayments_QNAME, ArrayOfCreditCardPayment.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrescriptionId", scope = Fill.class)
    public JAXBElement<String> createFillPrescriptionId(String value) {
        return new JAXBElement<String>(_FillRequestPrescriptionId_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PatientPayAmountDue", scope = Fill.class)
    public JAXBElement<Double> createFillPatientPayAmountDue(Double value) {
        return new JAXBElement<Double>(_FillPatientPayAmountDue_QNAME, Double.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "SecondaryPayor", scope = Fill.class)
    public JAXBElement<String> createFillSecondaryPayor(String value) {
        return new JAXBElement<String>(_FillSecondaryPayor_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Ndc", scope = Fill.class)
    public JAXBElement<String> createFillNdc(String value) {
        return new JAXBElement<String>(_FillNdc_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrimaryPlan", scope = Fill.class)
    public JAXBElement<String> createFillPrimaryPlan(String value) {
        return new JAXBElement<String>(_FillPrimaryPlan_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FillingPharmacyNCPDPId", scope = Fill.class)
    public JAXBElement<String> createFillFillingPharmacyNCPDPId(String value) {
        return new JAXBElement<String>(_FillFillingPharmacyNCPDPId_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DisplayName", scope = Fill.class)
    public JAXBElement<String> createFillDisplayName(String value) {
        return new JAXBElement<String>(_ProviderDisplayName_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "TertiaryPlan", scope = Fill.class)
    public JAXBElement<String> createFillTertiaryPlan(String value) {
        return new JAXBElement<String>(_FillTertiaryPlan_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "SecondaryPlan", scope = Fill.class)
    public JAXBElement<String> createFillSecondaryPlan(String value) {
        return new JAXBElement<String>(_FillSecondaryPlan_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrimaryPaymentAmountCovered", scope = Fill.class)
    public JAXBElement<Double> createFillPrimaryPaymentAmountCovered(Double value) {
        return new JAXBElement<Double>(_FillPrimaryPaymentAmountCovered_QNAME, Double.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Quantity", scope = Fill.class)
    public JAXBElement<String> createFillQuantity(String value) {
        return new JAXBElement<String>(_FillQuantity_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "TertiaryPaymentMethod", scope = Fill.class)
    public JAXBElement<String> createFillTertiaryPaymentMethod(String value) {
        return new JAXBElement<String>(_FillTertiaryPaymentMethod_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DispensedOn", scope = Fill.class)
    public JAXBElement<XMLGregorianCalendar> createFillDispensedOn(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FillDispensedOn_QNAME, XMLGregorianCalendar.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Flags", scope = Fill.class)
    public JAXBElement<ArrayOfFlag> createFillFlags(ArrayOfFlag value) {
        return new JAXBElement<ArrayOfFlag>(_FillFlags_QNAME, ArrayOfFlag.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Id", scope = Fill.class)
    public JAXBElement<String> createFillId(String value) {
        return new JAXBElement<String>(_CreditCardId_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DeliveryMethod", scope = Fill.class)
    public JAXBElement<DeliveryMethod> createFillDeliveryMethod(DeliveryMethod value) {
        return new JAXBElement<DeliveryMethod>(_FillDeliveryMethod_QNAME, DeliveryMethod.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "SecondaryPaymentMethod", scope = Fill.class)
    public JAXBElement<String> createFillSecondaryPaymentMethod(String value) {
        return new JAXBElement<String>(_FillSecondaryPaymentMethod_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PickupPharmacyDisplayName", scope = Fill.class)
    public JAXBElement<String> createFillPickupPharmacyDisplayName(String value) {
        return new JAXBElement<String>(_FillPickupPharmacyDisplayName_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrimaryPayor", scope = Fill.class)
    public JAXBElement<String> createFillPrimaryPayor(String value) {
        return new JAXBElement<String>(_FillPrimaryPayor_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PickupPharmacyNCPDPId", scope = Fill.class)
    public JAXBElement<String> createFillPickupPharmacyNCPDPId(String value) {
        return new JAXBElement<String>(_FillPickupPharmacyNCPDPId_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrimaryPaymentMethod", scope = Fill.class)
    public JAXBElement<String> createFillPrimaryPaymentMethod(String value) {
        return new JAXBElement<String>(_FillPrimaryPaymentMethod_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FillingPharmacyDisplayName", scope = Fill.class)
    public JAXBElement<String> createFillFillingPharmacyDisplayName(String value) {
        return new JAXBElement<String>(_FillFillingPharmacyDisplayName_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "TrackingNumber", scope = Fill.class)
    public JAXBElement<String> createFillTrackingNumber(String value) {
        return new JAXBElement<String>(_FillTrackingNumber_QNAME, String.class, Fill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "AddedDateTime", scope = Flag.class)
    public JAXBElement<XMLGregorianCalendar> createFlagAddedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FlagAddedDateTime_QNAME, XMLGregorianCalendar.class, Flag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Id", scope = Flag.class)
    public JAXBElement<String> createFlagId(String value) {
        return new JAXBElement<String>(_CreditCardId_QNAME, String.class, Flag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DisplayName", scope = Flag.class)
    public JAXBElement<String> createFlagDisplayName(String value) {
        return new JAXBElement<String>(_ProviderDisplayName_QNAME, String.class, Flag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Description", scope = Flag.class)
    public JAXBElement<String> createFlagDescription(String value) {
        return new JAXBElement<String>(_FlagDescription_QNAME, String.class, Flag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Comments", scope = Flag.class)
    public JAXBElement<String> createFlagComments(String value) {
        return new JAXBElement<String>(_FillRequestComments_QNAME, String.class, Flag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Type", scope = Flag.class)
    public JAXBElement<String> createFlagType(String value) {
        return new JAXBElement<String>(_DocumentType_QNAME, String.class, Flag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "AddedBy", scope = Flag.class)
    public JAXBElement<String> createFlagAddedBy(String value) {
        return new JAXBElement<String>(_FlagAddedBy_QNAME, String.class, Flag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrescriptionId", scope = CancelFillRequest.class)
    public JAXBElement<String> createCancelFillRequestPrescriptionId(String value) {
        return new JAXBElement<String>(_FillRequestPrescriptionId_QNAME, String.class, CancelFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CanceledDateTime", scope = CancelFillRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCancelFillRequestCanceledDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CancelFillRequestCanceledDateTime_QNAME, XMLGregorianCalendar.class, CancelFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReturnToStockMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CancelReturnToStockMethod", scope = CancelFillRequest.class)
    public JAXBElement<CancelReturnToStockMethod> createCancelFillRequestCancelReturnToStockMethod(CancelReturnToStockMethod value) {
        return new JAXBElement<CancelReturnToStockMethod>(_CancelFillRequestCancelReturnToStockMethod_QNAME, CancelReturnToStockMethod.class, CancelFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FillId", scope = CancelFillRequest.class)
    public JAXBElement<String> createCancelFillRequestFillId(String value) {
        return new JAXBElement<String>(_AdvanceFillStatusRequestFillId_QNAME, String.class, CancelFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "RefundedAmount", scope = CancelFillRequest.class)
    public JAXBElement<Double> createCancelFillRequestRefundedAmount(Double value) {
        return new JAXBElement<Double>(_CancelFillRequestRefundedAmount_QNAME, Double.class, CancelFillRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "returnPharmacyNcpdpId", scope = CancelFills.class)
    public JAXBElement<String> createCancelFillsReturnPharmacyNcpdpId(String value) {
        return new JAXBElement<String>(_CancelFillsReturnPharmacyNcpdpId_QNAME, String.class, CancelFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "systemId", scope = CancelFills.class)
    public JAXBElement<String> createCancelFillsSystemId(String value) {
        return new JAXBElement<String>(_RequestFillsSystemId_QNAME, String.class, CancelFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "userIdType", scope = CancelFills.class)
    public JAXBElement<String> createCancelFillsUserIdType(String value) {
        return new JAXBElement<String>(_RequestFillsUserIdType_QNAME, String.class, CancelFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "cancelReason", scope = CancelFills.class)
    public JAXBElement<String> createCancelFillsCancelReason(String value) {
        return new JAXBElement<String>(_CancelFillsCancelReason_QNAME, String.class, CancelFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "workstationId", scope = CancelFills.class)
    public JAXBElement<String> createCancelFillsWorkstationId(String value) {
        return new JAXBElement<String>(_RequestFillsWorkstationId_QNAME, String.class, CancelFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCancelFillRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "requests", scope = CancelFills.class)
    public JAXBElement<ArrayOfCancelFillRequest> createCancelFillsRequests(ArrayOfCancelFillRequest value) {
        return new JAXBElement<ArrayOfCancelFillRequest>(_RequestFillsRequests_QNAME, ArrayOfCancelFillRequest.class, CancelFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "cancelingPharmacyNcpdpId", scope = CancelFills.class)
    public JAXBElement<String> createCancelFillsCancelingPharmacyNcpdpId(String value) {
        return new JAXBElement<String>(_CancelFillsCancelingPharmacyNcpdpId_QNAME, String.class, CancelFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "userId", scope = CancelFills.class)
    public JAXBElement<String> createCancelFillsUserId(String value) {
        return new JAXBElement<String>(_RequestFillsUserId_QNAME, String.class, CancelFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "systemId", scope = GetPrescriptionInfo.class)
    public JAXBElement<String> createGetPrescriptionInfoSystemId(String value) {
        return new JAXBElement<String>(_RequestFillsSystemId_QNAME, String.class, GetPrescriptionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "patientMRN", scope = GetPrescriptionInfo.class)
    public JAXBElement<String> createGetPrescriptionInfoPatientMRN(String value) {
        return new JAXBElement<String>(_GetCreditCardsPatientMRN_QNAME, String.class, GetPrescriptionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "fillId", scope = GetPrescriptionInfo.class)
    public JAXBElement<String> createGetPrescriptionInfoFillId(String value) {
        return new JAXBElement<String>(_GetPrescriptionInfoByIdFillId_QNAME, String.class, GetPrescriptionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "prescriptionNumber", scope = GetPrescriptionInfo.class)
    public JAXBElement<String> createGetPrescriptionInfoPrescriptionNumber(String value) {
        return new JAXBElement<String>(_GetPrescriptionInfoPrescriptionNumber_QNAME, String.class, GetPrescriptionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "pharmacyNCPDPId", scope = GetPrescriptionInfo.class)
    public JAXBElement<String> createGetPrescriptionInfoPharmacyNCPDPId(String value) {
        return new JAXBElement<String>(_GetCreditCardsPharmacyNCPDPId_QNAME, String.class, GetPrescriptionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "systemId", scope = DispenseFills.class)
    public JAXBElement<String> createDispenseFillsSystemId(String value) {
        return new JAXBElement<String>(_RequestFillsSystemId_QNAME, String.class, DispenseFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "userIdType", scope = DispenseFills.class)
    public JAXBElement<String> createDispenseFillsUserIdType(String value) {
        return new JAXBElement<String>(_RequestFillsUserIdType_QNAME, String.class, DispenseFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "workstationId", scope = DispenseFills.class)
    public JAXBElement<String> createDispenseFillsWorkstationId(String value) {
        return new JAXBElement<String>(_RequestFillsWorkstationId_QNAME, String.class, DispenseFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDispenseFillRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "requests", scope = DispenseFills.class)
    public JAXBElement<ArrayOfDispenseFillRequest> createDispenseFillsRequests(ArrayOfDispenseFillRequest value) {
        return new JAXBElement<ArrayOfDispenseFillRequest>(_RequestFillsRequests_QNAME, ArrayOfDispenseFillRequest.class, DispenseFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "userId", scope = DispenseFills.class)
    public JAXBElement<String> createDispenseFillsUserId(String value) {
        return new JAXBElement<String>(_RequestFillsUserId_QNAME, String.class, DispenseFills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "RequestFillsResult", scope = RequestFillsResponse.class)
    public JAXBElement<UpdateResult> createRequestFillsResponseRequestFillsResult(UpdateResult value) {
        return new JAXBElement<UpdateResult>(_RequestFillsResponseRequestFillsResult_QNAME, UpdateResult.class, RequestFillsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "LastName", scope = Patient.class)
    public JAXBElement<String> createPatientLastName(String value) {
        return new JAXBElement<String>(_PatientLastName_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "HomePhone", scope = Patient.class)
    public JAXBElement<String> createPatientHomePhone(String value) {
        return new JAXBElement<String>(_PatientHomePhone_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "WorkPhone", scope = Patient.class)
    public JAXBElement<String> createPatientWorkPhone(String value) {
        return new JAXBElement<String>(_PatientWorkPhone_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Academic", scope = Patient.class)
    public JAXBElement<String> createPatientAcademic(String value) {
        return new JAXBElement<String>(_PatientAcademic_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FirstName", scope = Patient.class)
    public JAXBElement<String> createPatientFirstName(String value) {
        return new JAXBElement<String>(_PatientFirstName_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "StateAbbreviation", scope = Patient.class)
    public JAXBElement<String> createPatientStateAbbreviation(String value) {
        return new JAXBElement<String>(_ProviderStateAbbreviation_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "EmailAddress", scope = Patient.class)
    public JAXBElement<String> createPatientEmailAddress(String value) {
        return new JAXBElement<String>(_PatientEmailAddress_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "MobilePhone", scope = Patient.class)
    public JAXBElement<String> createPatientMobilePhone(String value) {
        return new JAXBElement<String>(_PatientMobilePhone_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PreferredName", scope = Patient.class)
    public JAXBElement<String> createPatientPreferredName(String value) {
        return new JAXBElement<String>(_PatientPreferredName_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "AddressContactName", scope = Patient.class)
    public JAXBElement<String> createPatientAddressContactName(String value) {
        return new JAXBElement<String>(_PatientAddressContactName_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PreferredNameType", scope = Patient.class)
    public JAXBElement<String> createPatientPreferredNameType(String value) {
        return new JAXBElement<String>(_PatientPreferredNameType_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CreditCards", scope = Patient.class)
    public JAXBElement<ArrayOfCreditCard> createPatientCreditCards(ArrayOfCreditCard value) {
        return new JAXBElement<ArrayOfCreditCard>(_PatientCreditCards_QNAME, ArrayOfCreditCard.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FullName", scope = Patient.class)
    public JAXBElement<String> createPatientFullName(String value) {
        return new JAXBElement<String>(_PatientFullName_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "MedicalRecordNumber", scope = Patient.class)
    public JAXBElement<String> createPatientMedicalRecordNumber(String value) {
        return new JAXBElement<String>(_PatientMedicalRecordNumber_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ZipCode", scope = Patient.class)
    public JAXBElement<String> createPatientZipCode(String value) {
        return new JAXBElement<String>(_PatientZipCode_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DisplayName", scope = Patient.class)
    public JAXBElement<String> createPatientDisplayName(String value) {
        return new JAXBElement<String>(_ProviderDisplayName_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Country", scope = Patient.class)
    public JAXBElement<String> createPatientCountry(String value) {
        return new JAXBElement<String>(_PharmacyCountry_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFYI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FYIs", scope = Patient.class)
    public JAXBElement<ArrayOfFYI> createPatientFYIs(ArrayOfFYI value) {
        return new JAXBElement<ArrayOfFYI>(_PatientFYIs_QNAME, ArrayOfFYI.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Title", scope = Patient.class)
    public JAXBElement<String> createPatientTitle(String value) {
        return new JAXBElement<String>(_PatientTitle_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "City", scope = Patient.class)
    public JAXBElement<String> createPatientCity(String value) {
        return new JAXBElement<String>(_ProviderCity_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Suffix", scope = Patient.class)
    public JAXBElement<String> createPatientSuffix(String value) {
        return new JAXBElement<String>(_PatientSuffix_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PharmacyDocuments", scope = Patient.class)
    public JAXBElement<ArrayOfDocument> createPatientPharmacyDocuments(ArrayOfDocument value) {
        return new JAXBElement<ArrayOfDocument>(_PatientPharmacyDocuments_QNAME, ArrayOfDocument.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "StreetAddress", scope = Patient.class)
    public JAXBElement<String> createPatientStreetAddress(String value) {
        return new JAXBElement<String>(_ProviderStreetAddress_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DateOfBirth", scope = Patient.class)
    public JAXBElement<XMLGregorianCalendar> createPatientDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PatientDateOfBirth_QNAME, XMLGregorianCalendar.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "EnterpriseId", scope = Patient.class)
    public JAXBElement<String> createPatientEnterpriseId(String value) {
        return new JAXBElement<String>(_PatientEnterpriseId_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "County", scope = Patient.class)
    public JAXBElement<String> createPatientCounty(String value) {
        return new JAXBElement<String>(_PharmacyCounty_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "MiddleName", scope = Patient.class)
    public JAXBElement<String> createPatientMiddleName(String value) {
        return new JAXBElement<String>(_PatientMiddleName_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "State", scope = Patient.class)
    public JAXBElement<String> createPatientState(String value) {
        return new JAXBElement<String>(_ProviderState_QNAME, String.class, Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "systemId", scope = GetVersion.class)
    public JAXBElement<String> createGetVersionSystemId(String value) {
        return new JAXBElement<String>(_RequestFillsSystemId_QNAME, String.class, GetVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Data", scope = ContactMethod.class)
    public JAXBElement<String> createContactMethodData(String value) {
        return new JAXBElement<String>(_ContactMethodData_QNAME, String.class, ContactMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Type", scope = ContactMethod.class)
    public JAXBElement<ContactMethodType> createContactMethodType(ContactMethodType value) {
        return new JAXBElement<ContactMethodType>(_DocumentType_QNAME, ContactMethodType.class, ContactMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "GetCreditCardsResult", scope = GetCreditCardsResponse.class)
    public JAXBElement<ArrayOfCreditCard> createGetCreditCardsResponseGetCreditCardsResult(ArrayOfCreditCard value) {
        return new JAXBElement<ArrayOfCreditCard>(_GetCreditCardsResponseGetCreditCardsResult_QNAME, ArrayOfCreditCard.class, GetCreditCardsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Comment", scope = FYI.class)
    public JAXBElement<String> createFYIComment(String value) {
        return new JAXBElement<String>(_FYIComment_QNAME, String.class, FYI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "TypeName", scope = FYI.class)
    public JAXBElement<String> createFYITypeName(String value) {
        return new JAXBElement<String>(_DocumentTypeName_QNAME, String.class, FYI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Id", scope = FYI.class)
    public JAXBElement<String> createFYIId(String value) {
        return new JAXBElement<String>(_CreditCardId_QNAME, String.class, FYI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "TypeId", scope = FYI.class)
    public JAXBElement<String> createFYITypeId(String value) {
        return new JAXBElement<String>(_FYITypeId_QNAME, String.class, FYI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "PrescriptionNumber", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionPrescriptionNumber(String value) {
        return new JAXBElement<String>(_FillPrescriptionNumber_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "RARPrescriptionNumber", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionRARPrescriptionNumber(String value) {
        return new JAXBElement<String>(_PrescriptionRARPrescriptionNumber_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Frequency", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionFrequency(String value) {
        return new JAXBElement<String>(_PrescriptionFrequency_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Route", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionRoute(String value) {
        return new JAXBElement<String>(_PrescriptionRoute_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pharmacy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "OwningPharmacy", scope = Prescription.class)
    public JAXBElement<Pharmacy> createPrescriptionOwningPharmacy(Pharmacy value) {
        return new JAXBElement<Pharmacy>(_PrescriptionOwningPharmacy_QNAME, Pharmacy.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Medication", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionMedication(String value) {
        return new JAXBElement<String>(_PrescriptionMedication_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DEACode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DEACode", scope = Prescription.class)
    public JAXBElement<DEACode> createPrescriptionDEACode(DEACode value) {
        return new JAXBElement<DEACode>(_PrescriptionDEACode_QNAME, DEACode.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "StartDate", scope = Prescription.class)
    public JAXBElement<XMLGregorianCalendar> createPrescriptionStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrescriptionStartDate_QNAME, XMLGregorianCalendar.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "AuthorizingProviderDisplayName", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionAuthorizingProviderDisplayName(String value) {
        return new JAXBElement<String>(_PrescriptionAuthorizingProviderDisplayName_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "LastFilled", scope = Prescription.class)
    public JAXBElement<XMLGregorianCalendar> createPrescriptionLastFilled(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrescriptionLastFilled_QNAME, XMLGregorianCalendar.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ReasonNotFillable", scope = Prescription.class)
    public JAXBElement<Integer> createPrescriptionReasonNotFillable(Integer value) {
        return new JAXBElement<Integer>(_PrescriptionReasonNotFillable_QNAME, Integer.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "LastFilledDaysSupply", scope = Prescription.class)
    public JAXBElement<Integer> createPrescriptionLastFilledDaysSupply(Integer value) {
        return new JAXBElement<Integer>(_PrescriptionLastFilledDaysSupply_QNAME, Integer.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Timestamp", scope = Prescription.class)
    public JAXBElement<XMLGregorianCalendar> createPrescriptionTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FillRequestTimestamp_QNAME, XMLGregorianCalendar.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Dose", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionDose(String value) {
        return new JAXBElement<String>(_PrescriptionDose_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RARStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "RARStatus", scope = Prescription.class)
    public JAXBElement<RARStatus> createPrescriptionRARStatus(RARStatus value) {
        return new JAXBElement<RARStatus>(_PrescriptionRARStatus_QNAME, RARStatus.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "OrderingProviderDisplayName", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionOrderingProviderDisplayName(String value) {
        return new JAXBElement<String>(_PrescriptionOrderingProviderDisplayName_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Fills", scope = Prescription.class)
    public JAXBElement<ArrayOfFill> createPrescriptionFills(ArrayOfFill value) {
        return new JAXBElement<ArrayOfFill>(_PrescriptionFills_QNAME, ArrayOfFill.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Sig", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionSig(String value) {
        return new JAXBElement<String>(_PrescriptionSig_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "ReasonNotRARable", scope = Prescription.class)
    public JAXBElement<Integer> createPrescriptionReasonNotRARable(Integer value) {
        return new JAXBElement<Integer>(_PrescriptionReasonNotRARable_QNAME, Integer.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Provider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "RefillAuthorizationProvider", scope = Prescription.class)
    public JAXBElement<Provider> createPrescriptionRefillAuthorizationProvider(Provider value) {
        return new JAXBElement<Provider>(_PrescriptionRefillAuthorizationProvider_QNAME, Provider.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillAuthorizationRequestMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "RefillAuthorizationRequestMode", scope = Prescription.class)
    public JAXBElement<RefillAuthorizationRequestMode> createPrescriptionRefillAuthorizationRequestMode(RefillAuthorizationRequestMode value) {
        return new JAXBElement<RefillAuthorizationRequestMode>(_PrescriptionRefillAuthorizationRequestMode_QNAME, RefillAuthorizationRequestMode.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Flags", scope = Prescription.class)
    public JAXBElement<ArrayOfFlag> createPrescriptionFlags(ArrayOfFlag value) {
        return new JAXBElement<ArrayOfFlag>(_FillFlags_QNAME, ArrayOfFlag.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Id", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionId(String value) {
        return new JAXBElement<String>(_CreditCardId_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DEACodeNumber", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionDEACodeNumber(String value) {
        return new JAXBElement<String>(_PrescriptionDEACodeNumber_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "DEACodeTitle", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionDEACodeTitle(String value) {
        return new JAXBElement<String>(_PrescriptionDEACodeTitle_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "FirstFilled", scope = Prescription.class)
    public JAXBElement<XMLGregorianCalendar> createPrescriptionFirstFilled(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrescriptionFirstFilled_QNAME, XMLGregorianCalendar.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "EndDate", scope = Prescription.class)
    public JAXBElement<XMLGregorianCalendar> createPrescriptionEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrescriptionEndDate_QNAME, XMLGregorianCalendar.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "RARPrescriptionId", scope = Prescription.class)
    public JAXBElement<String> createPrescriptionRARPrescriptionId(String value) {
        return new JAXBElement<String>(_PrescriptionRARPrescriptionId_QNAME, String.class, Prescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrescriptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "GetPrescriptionInfoByIdResult", scope = GetPrescriptionInfoByIdResponse.class)
    public JAXBElement<PrescriptionInfo> createGetPrescriptionInfoByIdResponseGetPrescriptionInfoByIdResult(PrescriptionInfo value) {
        return new JAXBElement<PrescriptionInfo>(_GetPrescriptionInfoByIdResponseGetPrescriptionInfoByIdResult_QNAME, PrescriptionInfo.class, GetPrescriptionInfoByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "CancelFillsResult", scope = CancelFillsResponse.class)
    public JAXBElement<UpdateResult> createCancelFillsResponseCancelFillsResult(UpdateResult value) {
        return new JAXBElement<UpdateResult>(_CancelFillsResponseCancelFillsResult_QNAME, UpdateResult.class, CancelFillsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Patient", scope = PrescriptionInfo.class)
    public JAXBElement<Patient> createPrescriptionInfoPatient(Patient value) {
        return new JAXBElement<Patient>(_Patient_QNAME, Patient.class, PrescriptionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Epic.Clinical.Pharmacy.WebServices2015", name = "Prescriptions", scope = PrescriptionInfo.class)
    public JAXBElement<ArrayOfPrescription> createPrescriptionInfoPrescriptions(ArrayOfPrescription value) {
        return new JAXBElement<ArrayOfPrescription>(_PrescriptionInfoPrescriptions_QNAME, ArrayOfPrescription.class, PrescriptionInfo.class, value);
    }

}
