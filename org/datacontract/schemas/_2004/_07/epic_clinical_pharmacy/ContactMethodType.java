
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Pager"/>
 *     &lt;enumeration value="Email"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactMethodType")
@XmlEnum
public enum ContactMethodType {

    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Pager")
    PAGER("Pager"),
    @XmlEnumValue("Email")
    EMAIL("Email");
    private final String value;

    ContactMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactMethodType fromValue(String v) {
        for (ContactMethodType c: ContactMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
