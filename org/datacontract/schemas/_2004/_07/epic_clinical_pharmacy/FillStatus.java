
package org.datacontract.schemas._2004._07.epic_clinical_pharmacy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FillStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FillStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PendingPrescriptionEntry"/>
 *     &lt;enumeration value="PendingFill"/>
 *     &lt;enumeration value="Sent"/>
 *     &lt;enumeration value="ReadyToFill"/>
 *     &lt;enumeration value="FillInitiated"/>
 *     &lt;enumeration value="Filled"/>
 *     &lt;enumeration value="ReadyToVerify"/>
 *     &lt;enumeration value="FillRejected"/>
 *     &lt;enumeration value="Verified"/>
 *     &lt;enumeration value="ReadyToPackage"/>
 *     &lt;enumeration value="ReadyToTransport"/>
 *     &lt;enumeration value="InTransit"/>
 *     &lt;enumeration value="Received"/>
 *     &lt;enumeration value="WaitingForFillingPharmacies"/>
 *     &lt;enumeration value="ReadyToDispense"/>
 *     &lt;enumeration value="ForceDispenseApproved"/>
 *     &lt;enumeration value="Dispensed"/>
 *     &lt;enumeration value="Shipped"/>
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="ApprovedRefillRequest"/>
 *     &lt;enumeration value="DeniedRefillRequest"/>
 *     &lt;enumeration value="Profiled"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="Bagged"/>
 *     &lt;enumeration value="Toted"/>
 *     &lt;enumeration value="Trucked"/>
 *     &lt;enumeration value="Boxed"/>
 *     &lt;enumeration value="Packaged"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FillStatus")
@XmlEnum
public enum FillStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("PendingPrescriptionEntry")
    PENDING_PRESCRIPTION_ENTRY("PendingPrescriptionEntry"),
    @XmlEnumValue("PendingFill")
    PENDING_FILL("PendingFill"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("ReadyToFill")
    READY_TO_FILL("ReadyToFill"),
    @XmlEnumValue("FillInitiated")
    FILL_INITIATED("FillInitiated"),
    @XmlEnumValue("Filled")
    FILLED("Filled"),
    @XmlEnumValue("ReadyToVerify")
    READY_TO_VERIFY("ReadyToVerify"),
    @XmlEnumValue("FillRejected")
    FILL_REJECTED("FillRejected"),
    @XmlEnumValue("Verified")
    VERIFIED("Verified"),
    @XmlEnumValue("ReadyToPackage")
    READY_TO_PACKAGE("ReadyToPackage"),
    @XmlEnumValue("ReadyToTransport")
    READY_TO_TRANSPORT("ReadyToTransport"),
    @XmlEnumValue("InTransit")
    IN_TRANSIT("InTransit"),
    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("WaitingForFillingPharmacies")
    WAITING_FOR_FILLING_PHARMACIES("WaitingForFillingPharmacies"),
    @XmlEnumValue("ReadyToDispense")
    READY_TO_DISPENSE("ReadyToDispense"),
    @XmlEnumValue("ForceDispenseApproved")
    FORCE_DISPENSE_APPROVED("ForceDispenseApproved"),
    @XmlEnumValue("Dispensed")
    DISPENSED("Dispensed"),
    @XmlEnumValue("Shipped")
    SHIPPED("Shipped"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("ApprovedRefillRequest")
    APPROVED_REFILL_REQUEST("ApprovedRefillRequest"),
    @XmlEnumValue("DeniedRefillRequest")
    DENIED_REFILL_REQUEST("DeniedRefillRequest"),
    @XmlEnumValue("Profiled")
    PROFILED("Profiled"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Bagged")
    BAGGED("Bagged"),
    @XmlEnumValue("Toted")
    TOTED("Toted"),
    @XmlEnumValue("Trucked")
    TRUCKED("Trucked"),
    @XmlEnumValue("Boxed")
    BOXED("Boxed"),
    @XmlEnumValue("Packaged")
    PACKAGED("Packaged");
    private final String value;

    FillStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FillStatus fromValue(String v) {
        for (FillStatus c: FillStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
