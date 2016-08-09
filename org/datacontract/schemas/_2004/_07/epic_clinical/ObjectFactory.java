
package org.datacontract.schemas._2004._07.epic_clinical;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.epic_clinical package. 
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

    private final static QName _RefillAuthorizationRequestToBeInitiatedBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Orders", "RefillAuthorizationRequestToBeInitiatedBy");
    private final static QName _MedicationOrderMedicationOrderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Epic.Clinical.Orders", "MedicationOrder.MedicationOrderStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.epic_clinical
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillAuthorizationRequestToBeInitiatedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Orders", name = "RefillAuthorizationRequestToBeInitiatedBy")
    public JAXBElement<RefillAuthorizationRequestToBeInitiatedBy> createRefillAuthorizationRequestToBeInitiatedBy(RefillAuthorizationRequestToBeInitiatedBy value) {
        return new JAXBElement<RefillAuthorizationRequestToBeInitiatedBy>(_RefillAuthorizationRequestToBeInitiatedBy_QNAME, RefillAuthorizationRequestToBeInitiatedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicationOrderMedicationOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Orders", name = "MedicationOrder.MedicationOrderStatus")
    public JAXBElement<MedicationOrderMedicationOrderStatus> createMedicationOrderMedicationOrderStatus(MedicationOrderMedicationOrderStatus value) {
        return new JAXBElement<MedicationOrderMedicationOrderStatus>(_MedicationOrderMedicationOrderStatus_QNAME, MedicationOrderMedicationOrderStatus.class, null, value);
    }

}
