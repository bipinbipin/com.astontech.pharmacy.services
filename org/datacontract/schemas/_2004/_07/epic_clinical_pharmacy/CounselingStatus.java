
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounselingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CounselingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Counseled"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="NotOffered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CounselingStatus")
@XmlEnum
public enum CounselingStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Counseled")
    COUNSELED("Counseled"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("NotOffered")
    NOT_OFFERED("NotOffered");
    private final String value;

    CounselingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CounselingStatus fromValue(String v) {
        for (CounselingStatus c: CounselingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
