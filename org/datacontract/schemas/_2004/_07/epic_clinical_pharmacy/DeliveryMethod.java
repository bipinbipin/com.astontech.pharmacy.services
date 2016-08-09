
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pickup"/>
 *     &lt;enumeration value="Mail"/>
 *     &lt;enumeration value="Courier"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryMethod")
@XmlEnum
public enum DeliveryMethod {

    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("Mail")
    MAIL("Mail"),
    @XmlEnumValue("Courier")
    COURIER("Courier");
    private final String value;

    DeliveryMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryMethod fromValue(String v) {
        for (DeliveryMethod c: DeliveryMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
