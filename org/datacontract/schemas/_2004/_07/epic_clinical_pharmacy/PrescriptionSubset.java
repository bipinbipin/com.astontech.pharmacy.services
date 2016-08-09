
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrescriptionSubset.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrescriptionSubset">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SpecifiedPrescriptionOnly"/>
 *     &lt;enumeration value="PharmacyPrescriptions"/>
 *     &lt;enumeration value="CurrentPrescriptions"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrescriptionSubset")
@XmlEnum
public enum PrescriptionSubset {

    @XmlEnumValue("SpecifiedPrescriptionOnly")
    SPECIFIED_PRESCRIPTION_ONLY("SpecifiedPrescriptionOnly"),
    @XmlEnumValue("PharmacyPrescriptions")
    PHARMACY_PRESCRIPTIONS("PharmacyPrescriptions"),
    @XmlEnumValue("CurrentPrescriptions")
    CURRENT_PRESCRIPTIONS("CurrentPrescriptions");
    private final String value;

    PrescriptionSubset(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrescriptionSubset fromValue(String v) {
        for (PrescriptionSubset c: PrescriptionSubset.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
