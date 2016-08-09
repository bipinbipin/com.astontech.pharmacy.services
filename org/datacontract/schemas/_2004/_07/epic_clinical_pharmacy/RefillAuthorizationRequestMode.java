
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefillAuthorizationRequestMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefillAuthorizationRequestMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="External"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefillAuthorizationRequestMode")
@XmlEnum
public enum RefillAuthorizationRequestMode {

    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("External")
    EXTERNAL("External");
    private final String value;

    RefillAuthorizationRequestMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefillAuthorizationRequestMode fromValue(String v) {
        for (RefillAuthorizationRequestMode c: RefillAuthorizationRequestMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
