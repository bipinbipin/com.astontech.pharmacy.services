
package org.datacontract.schemas._2004._07.epic_clinical;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicationOrder.MedicationOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationOrder.MedicationOrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Discontinued"/>
 *     &lt;enumeration value="Ended"/>
 *     &lt;enumeration value="Expired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicationOrder.MedicationOrderStatus", namespace = "http://schemas.datacontract.org/2004/07/Epic.Clinical.Orders")
@XmlEnum
public enum MedicationOrderMedicationOrderStatus {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Discontinued")
    DISCONTINUED("Discontinued"),
    @XmlEnumValue("Ended")
    ENDED("Ended"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired");
    private final String value;

    MedicationOrderMedicationOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicationOrderMedicationOrderStatus fromValue(String v) {
        for (MedicationOrderMedicationOrderStatus c: MedicationOrderMedicationOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
