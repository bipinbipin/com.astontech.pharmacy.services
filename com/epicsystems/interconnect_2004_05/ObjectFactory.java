
package com.epicsystems.interconnect_2004_05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epicsystems.interconnect_2004_05 package. 
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

    private final static QName _ApplicationFault_QNAME = new QName("urn:epicsystems.com:Interconnect.2004-05.Faults", "ApplicationFault");
    private final static QName _FaultType_QNAME = new QName("urn:epicsystems.com:Interconnect.2004-05.Faults", "FaultType");
    private final static QName _InternalFault_QNAME = new QName("urn:epicsystems.com:Interconnect.2004-05.Faults", "InternalFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epicsystems.interconnect_2004_05
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epicsystems.com:Interconnect.2004-05.Faults", name = "ApplicationFault")
    public JAXBElement<FaultType> createApplicationFault(FaultType value) {
        return new JAXBElement<FaultType>(_ApplicationFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epicsystems.com:Interconnect.2004-05.Faults", name = "FaultType")
    public JAXBElement<FaultType> createFaultType(FaultType value) {
        return new JAXBElement<FaultType>(_FaultType_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:epicsystems.com:Interconnect.2004-05.Faults", name = "InternalFault")
    public JAXBElement<FaultType> createInternalFault(FaultType value) {
        return new JAXBElement<FaultType>(_InternalFault_QNAME, FaultType.class, null, value);
    }

}
