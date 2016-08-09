
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.epic_clinical_pharmacy package. 
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

    private final static QName _ArrayOfDeliveryMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "ArrayOfDeliveryMethod");
    private final static QName _PatientPaymentMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "PatientPaymentMethod");
    private final static QName _DEACode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "DEACode");
    private final static QName _RARStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "RARStatus");
    private final static QName _DeliveryDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "DeliveryDestination");
    private final static QName _ContactMethodType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "ContactMethodType");
    private final static QName _DeliveryMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "DeliveryMethod");
    private final static QName _CancelReturnToStockMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "CancelReturnToStockMethod");
    private final static QName _FillSubset_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "FillSubset");
    private final static QName _PrescriptionSubset_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "PrescriptionSubset");
    private final static QName _FillStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "FillStatus");
    private final static QName _CounselingStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "CounselingStatus");
    private final static QName _RefillAuthorizationRequestMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", "RefillAuthorizationRequestMode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.epic_clinical_pharmacy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDeliveryMethod }
     * 
     */
    public ArrayOfDeliveryMethod createArrayOfDeliveryMethod() {
        return new ArrayOfDeliveryMethod();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeliveryMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "ArrayOfDeliveryMethod")
    public JAXBElement<ArrayOfDeliveryMethod> createArrayOfDeliveryMethod(ArrayOfDeliveryMethod value) {
        return new JAXBElement<ArrayOfDeliveryMethod>(_ArrayOfDeliveryMethod_QNAME, ArrayOfDeliveryMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatientPaymentMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "PatientPaymentMethod")
    public JAXBElement<PatientPaymentMethod> createPatientPaymentMethod(PatientPaymentMethod value) {
        return new JAXBElement<PatientPaymentMethod>(_PatientPaymentMethod_QNAME, PatientPaymentMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DEACode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "DEACode")
    public JAXBElement<DEACode> createDEACode(DEACode value) {
        return new JAXBElement<DEACode>(_DEACode_QNAME, DEACode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RARStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "RARStatus")
    public JAXBElement<RARStatus> createRARStatus(RARStatus value) {
        return new JAXBElement<RARStatus>(_RARStatus_QNAME, RARStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "DeliveryDestination")
    public JAXBElement<DeliveryDestination> createDeliveryDestination(DeliveryDestination value) {
        return new JAXBElement<DeliveryDestination>(_DeliveryDestination_QNAME, DeliveryDestination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "ContactMethodType")
    public JAXBElement<ContactMethodType> createContactMethodType(ContactMethodType value) {
        return new JAXBElement<ContactMethodType>(_ContactMethodType_QNAME, ContactMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "DeliveryMethod")
    public JAXBElement<DeliveryMethod> createDeliveryMethod(DeliveryMethod value) {
        return new JAXBElement<DeliveryMethod>(_DeliveryMethod_QNAME, DeliveryMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReturnToStockMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "CancelReturnToStockMethod")
    public JAXBElement<CancelReturnToStockMethod> createCancelReturnToStockMethod(CancelReturnToStockMethod value) {
        return new JAXBElement<CancelReturnToStockMethod>(_CancelReturnToStockMethod_QNAME, CancelReturnToStockMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillSubset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "FillSubset")
    public JAXBElement<FillSubset> createFillSubset(FillSubset value) {
        return new JAXBElement<FillSubset>(_FillSubset_QNAME, FillSubset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrescriptionSubset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "PrescriptionSubset")
    public JAXBElement<PrescriptionSubset> createPrescriptionSubset(PrescriptionSubset value) {
        return new JAXBElement<PrescriptionSubset>(_PrescriptionSubset_QNAME, PrescriptionSubset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "FillStatus")
    public JAXBElement<FillStatus> createFillStatus(FillStatus value) {
        return new JAXBElement<FillStatus>(_FillStatus_QNAME, FillStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CounselingStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "CounselingStatus")
    public JAXBElement<CounselingStatus> createCounselingStatus(CounselingStatus value) {
        return new JAXBElement<CounselingStatus>(_CounselingStatus_QNAME, CounselingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillAuthorizationRequestMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015", name = "RefillAuthorizationRequestMode")
    public JAXBElement<RefillAuthorizationRequestMode> createRefillAuthorizationRequestMode(RefillAuthorizationRequestMode value) {
        return new JAXBElement<RefillAuthorizationRequestMode>(_RefillAuthorizationRequestMode_QNAME, RefillAuthorizationRequestMode.class, null, value);
    }

}
