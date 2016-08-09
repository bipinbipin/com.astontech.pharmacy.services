
package org.datacontract.schemas._2004._07.epic_clinical;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefillAuthorizationRequestToBeInitiatedBy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillAuthorizationRequestToBeInitiatedBy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pharmacy"/>
 *     &lt;enumeration value="ExternalSystem"/>
 *     &lt;enumeration value="Patient"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefillAuthorizationRequestToBeInitiatedBy", namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Orders")
@XmlEnum
public enum RefillAuthorizationRequestToBeInitiatedBy {

    @XmlEnumValue("Pharmacy")
    PHARMACY("Pharmacy"),
    @XmlEnumValue("ExternalSystem")
    EXTERNAL_SYSTEM("ExternalSystem"),
    @XmlEnumValue("Patient")
    PATIENT("Patient");
    private final String value;

    RefillAuthorizationRequestToBeInitiatedBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefillAuthorizationRequestToBeInitiatedBy fromValue(String v) {
        for (RefillAuthorizationRequestToBeInitiatedBy c: RefillAuthorizationRequestToBeInitiatedBy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
