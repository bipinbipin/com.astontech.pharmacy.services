
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DEACode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DEACode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undeterminable"/>
 *     &lt;enumeration value="C0"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="CII"/>
 *     &lt;enumeration value="CIII"/>
 *     &lt;enumeration value="CIV"/>
 *     &lt;enumeration value="CV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DEACode")
@XmlEnum
public enum DEACode {

    @XmlEnumValue("Undeterminable")
    UNDETERMINABLE("Undeterminable"),
    @XmlEnumValue("C0")
    C_0("C0"),
    CI("CI"),
    CII("CII"),
    CIII("CIII"),
    CIV("CIV"),
    CV("CV");
    private final String value;

    DEACode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DEACode fromValue(String v) {
        for (DEACode c: DEACode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
