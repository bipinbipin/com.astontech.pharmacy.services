
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FillSubset.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FillSubset">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SpecifiedFillOnly"/>
 *     &lt;enumeration value="FillsBackToMostRecentDispense"/>
 *     &lt;enumeration value="OnlyFillsInProgress"/>
 *     &lt;enumeration value="AllFills"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FillSubset")
@XmlEnum
public enum FillSubset {

    @XmlEnumValue("SpecifiedFillOnly")
    SPECIFIED_FILL_ONLY("SpecifiedFillOnly"),
    @XmlEnumValue("FillsBackToMostRecentDispense")
    FILLS_BACK_TO_MOST_RECENT_DISPENSE("FillsBackToMostRecentDispense"),
    @XmlEnumValue("OnlyFillsInProgress")
    ONLY_FILLS_IN_PROGRESS("OnlyFillsInProgress"),
    @XmlEnumValue("AllFills")
    ALL_FILLS("AllFills");
    private final String value;

    FillSubset(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FillSubset fromValue(String v) {
        for (FillSubset c: FillSubset.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
