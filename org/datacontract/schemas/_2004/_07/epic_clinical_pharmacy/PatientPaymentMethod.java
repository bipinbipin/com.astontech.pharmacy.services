
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatientPaymentMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PatientPaymentMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="CreditCard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PatientPaymentMethod")
@XmlEnum
public enum PatientPaymentMethod {

    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard");
    private final String value;

    PatientPaymentMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatientPaymentMethod fromValue(String v) {
        for (PatientPaymentMethod c: PatientPaymentMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
