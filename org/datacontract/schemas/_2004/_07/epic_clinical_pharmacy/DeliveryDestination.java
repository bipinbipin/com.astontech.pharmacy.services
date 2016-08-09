
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryDestination.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryDestination">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DefaultAddress"/>
 *     &lt;enumeration value="DeliveryComments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryDestination")
@XmlEnum
public enum DeliveryDestination {

    @XmlEnumValue("DefaultAddress")
    DEFAULT_ADDRESS("DefaultAddress"),
    @XmlEnumValue("DeliveryComments")
    DELIVERY_COMMENTS("DeliveryComments");
    private final String value;

    DeliveryDestination(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryDestination fromValue(String v) {
        for (DeliveryDestination c: DeliveryDestination.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
