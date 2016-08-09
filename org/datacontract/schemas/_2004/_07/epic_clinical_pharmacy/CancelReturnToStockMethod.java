
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelReturnToStockMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelReturnToStockMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Immediately"/>
 *     &lt;enumeration value="Later"/>
 *     &lt;enumeration value="Waste"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancelReturnToStockMethod")
@XmlEnum
public enum CancelReturnToStockMethod {

    @XmlEnumValue("Immediately")
    IMMEDIATELY("Immediately"),
    @XmlEnumValue("Later")
    LATER("Later"),
    @XmlEnumValue("Waste")
    WASTE("Waste");
    private final String value;

    CancelReturnToStockMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancelReturnToStockMethod fromValue(String v) {
        for (CancelReturnToStockMethod c: CancelReturnToStockMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
