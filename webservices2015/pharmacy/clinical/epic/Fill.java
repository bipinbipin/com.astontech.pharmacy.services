
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.DeliveryMethod;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.FillStatus;


/**
 * <p>Java class for Fill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditCardPayments" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfCreditCardPayment" minOccurs="0"/>
 *         &lt;element name="DaySupply" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeliveryMethod" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}DeliveryMethod" minOccurs="0"/>
 *         &lt;element name="DispensedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FillingPharmacyDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FillingPharmacyNCPDPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flags" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfFlag" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCompletionFill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDispensable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFillInProgress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPartialFill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Ndc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatientPayAmountDue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PatientPayAmountTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PickupPharmacyDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupPharmacyNCPDPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrescriptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrescriptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPaymentAmountCovered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PrimaryPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPayor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryPaymentAmountCovered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SecondaryPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryPayor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}FillStatus" minOccurs="0"/>
 *         &lt;element name="TertiaryPaymentAmountCovered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TertiaryPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TertiaryPayor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TertiaryPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fill", propOrder = {
    "creditCardPayments",
    "daySupply",
    "deliveryMethod",
    "dispensedOn",
    "displayName",
    "fillingPharmacyDisplayName",
    "fillingPharmacyNCPDPId",
    "flags",
    "id",
    "isCompletionFill",
    "isDispensable",
    "isFillInProgress",
    "isPartialFill",
    "ndc",
    "patientPayAmountDue",
    "patientPayAmountTotal",
    "pickupPharmacyDisplayName",
    "pickupPharmacyNCPDPId",
    "prescriptionId",
    "prescriptionNumber",
    "primaryPaymentAmountCovered",
    "primaryPaymentMethod",
    "primaryPayor",
    "primaryPlan",
    "quantity",
    "secondaryPaymentAmountCovered",
    "secondaryPaymentMethod",
    "secondaryPayor",
    "secondaryPlan",
    "status",
    "tertiaryPaymentAmountCovered",
    "tertiaryPaymentMethod",
    "tertiaryPayor",
    "tertiaryPlan",
    "trackingNumber"
})
public class Fill {

    @XmlElementRef(name = "CreditCardPayments", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCreditCardPayment> creditCardPayments;
    @XmlElementRef(name = "DaySupply", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Integer> daySupply;
    @XmlElementRef(name = "DeliveryMethod", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<DeliveryMethod> deliveryMethod;
    @XmlElementRef(name = "DispensedOn", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dispensedOn;
    @XmlElementRef(name = "DisplayName", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "FillingPharmacyDisplayName", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> fillingPharmacyDisplayName;
    @XmlElementRef(name = "FillingPharmacyNCPDPId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> fillingPharmacyNCPDPId;
    @XmlElementRef(name = "Flags", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFlag> flags;
    @XmlElementRef(name = "Id", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> id;
    @XmlElement(name = "IsCompletionFill")
    protected Boolean isCompletionFill;
    @XmlElement(name = "IsDispensable")
    protected Boolean isDispensable;
    @XmlElement(name = "IsFillInProgress")
    protected Boolean isFillInProgress;
    @XmlElement(name = "IsPartialFill")
    protected Boolean isPartialFill;
    @XmlElementRef(name = "Ndc", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> ndc;
    @XmlElementRef(name = "PatientPayAmountDue", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Double> patientPayAmountDue;
    @XmlElementRef(name = "PatientPayAmountTotal", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Double> patientPayAmountTotal;
    @XmlElementRef(name = "PickupPharmacyDisplayName", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> pickupPharmacyDisplayName;
    @XmlElementRef(name = "PickupPharmacyNCPDPId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> pickupPharmacyNCPDPId;
    @XmlElementRef(name = "PrescriptionId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> prescriptionId;
    @XmlElementRef(name = "PrescriptionNumber", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> prescriptionNumber;
    @XmlElementRef(name = "PrimaryPaymentAmountCovered", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Double> primaryPaymentAmountCovered;
    @XmlElementRef(name = "PrimaryPaymentMethod", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> primaryPaymentMethod;
    @XmlElementRef(name = "PrimaryPayor", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> primaryPayor;
    @XmlElementRef(name = "PrimaryPlan", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> primaryPlan;
    @XmlElementRef(name = "Quantity", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> quantity;
    @XmlElementRef(name = "SecondaryPaymentAmountCovered", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Double> secondaryPaymentAmountCovered;
    @XmlElementRef(name = "SecondaryPaymentMethod", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> secondaryPaymentMethod;
    @XmlElementRef(name = "SecondaryPayor", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> secondaryPayor;
    @XmlElementRef(name = "SecondaryPlan", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> secondaryPlan;
    @XmlElement(name = "Status")
    protected FillStatus status;
    @XmlElementRef(name = "TertiaryPaymentAmountCovered", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Double> tertiaryPaymentAmountCovered;
    @XmlElementRef(name = "TertiaryPaymentMethod", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> tertiaryPaymentMethod;
    @XmlElementRef(name = "TertiaryPayor", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> tertiaryPayor;
    @XmlElementRef(name = "TertiaryPlan", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> tertiaryPlan;
    @XmlElementRef(name = "TrackingNumber", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> trackingNumber;

    /**
     * Gets the value of the creditCardPayments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreditCardPayment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCreditCardPayment> getCreditCardPayments() {
        return creditCardPayments;
    }

    /**
     * Sets the value of the creditCardPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreditCardPayment }{@code >}
     *     
     */
    public void setCreditCardPayments(JAXBElement<ArrayOfCreditCardPayment> value) {
        this.creditCardPayments = ((JAXBElement<ArrayOfCreditCardPayment> ) value);
    }

    /**
     * Gets the value of the daySupply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDaySupply() {
        return daySupply;
    }

    /**
     * Sets the value of the daySupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDaySupply(JAXBElement<Integer> value) {
        this.daySupply = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeliveryMethod }{@code >}
     *     
     */
    public JAXBElement<DeliveryMethod> getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeliveryMethod }{@code >}
     *     
     */
    public void setDeliveryMethod(JAXBElement<DeliveryMethod> value) {
        this.deliveryMethod = ((JAXBElement<DeliveryMethod> ) value);
    }

    /**
     * Gets the value of the dispensedOn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDispensedOn() {
        return dispensedOn;
    }

    /**
     * Sets the value of the dispensedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDispensedOn(JAXBElement<XMLGregorianCalendar> value) {
        this.dispensedOn = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fillingPharmacyDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFillingPharmacyDisplayName() {
        return fillingPharmacyDisplayName;
    }

    /**
     * Sets the value of the fillingPharmacyDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFillingPharmacyDisplayName(JAXBElement<String> value) {
        this.fillingPharmacyDisplayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fillingPharmacyNCPDPId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFillingPharmacyNCPDPId() {
        return fillingPharmacyNCPDPId;
    }

    /**
     * Sets the value of the fillingPharmacyNCPDPId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFillingPharmacyNCPDPId(JAXBElement<String> value) {
        this.fillingPharmacyNCPDPId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlag }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlag> getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlag }{@code >}
     *     
     */
    public void setFlags(JAXBElement<ArrayOfFlag> value) {
        this.flags = ((JAXBElement<ArrayOfFlag> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the isCompletionFill property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompletionFill() {
        return isCompletionFill;
    }

    /**
     * Sets the value of the isCompletionFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompletionFill(Boolean value) {
        this.isCompletionFill = value;
    }

    /**
     * Gets the value of the isDispensable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDispensable() {
        return isDispensable;
    }

    /**
     * Sets the value of the isDispensable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDispensable(Boolean value) {
        this.isDispensable = value;
    }

    /**
     * Gets the value of the isFillInProgress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFillInProgress() {
        return isFillInProgress;
    }

    /**
     * Sets the value of the isFillInProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFillInProgress(Boolean value) {
        this.isFillInProgress = value;
    }

    /**
     * Gets the value of the isPartialFill property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartialFill() {
        return isPartialFill;
    }

    /**
     * Sets the value of the isPartialFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartialFill(Boolean value) {
        this.isPartialFill = value;
    }

    /**
     * Gets the value of the ndc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNdc() {
        return ndc;
    }

    /**
     * Sets the value of the ndc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNdc(JAXBElement<String> value) {
        this.ndc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the patientPayAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPatientPayAmountDue() {
        return patientPayAmountDue;
    }

    /**
     * Sets the value of the patientPayAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPatientPayAmountDue(JAXBElement<Double> value) {
        this.patientPayAmountDue = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the patientPayAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPatientPayAmountTotal() {
        return patientPayAmountTotal;
    }

    /**
     * Sets the value of the patientPayAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPatientPayAmountTotal(JAXBElement<Double> value) {
        this.patientPayAmountTotal = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the pickupPharmacyDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPickupPharmacyDisplayName() {
        return pickupPharmacyDisplayName;
    }

    /**
     * Sets the value of the pickupPharmacyDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPickupPharmacyDisplayName(JAXBElement<String> value) {
        this.pickupPharmacyDisplayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pickupPharmacyNCPDPId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPickupPharmacyNCPDPId() {
        return pickupPharmacyNCPDPId;
    }

    /**
     * Sets the value of the pickupPharmacyNCPDPId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPickupPharmacyNCPDPId(JAXBElement<String> value) {
        this.pickupPharmacyNCPDPId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prescriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrescriptionId() {
        return prescriptionId;
    }

    /**
     * Sets the value of the prescriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrescriptionId(JAXBElement<String> value) {
        this.prescriptionId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prescriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrescriptionNumber() {
        return prescriptionNumber;
    }

    /**
     * Sets the value of the prescriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrescriptionNumber(JAXBElement<String> value) {
        this.prescriptionNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryPaymentAmountCovered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPrimaryPaymentAmountCovered() {
        return primaryPaymentAmountCovered;
    }

    /**
     * Sets the value of the primaryPaymentAmountCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPrimaryPaymentAmountCovered(JAXBElement<Double> value) {
        this.primaryPaymentAmountCovered = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the primaryPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPaymentMethod() {
        return primaryPaymentMethod;
    }

    /**
     * Sets the value of the primaryPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPaymentMethod(JAXBElement<String> value) {
        this.primaryPaymentMethod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryPayor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPayor() {
        return primaryPayor;
    }

    /**
     * Sets the value of the primaryPayor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPayor(JAXBElement<String> value) {
        this.primaryPayor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primaryPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPlan() {
        return primaryPlan;
    }

    /**
     * Sets the value of the primaryPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPlan(JAXBElement<String> value) {
        this.primaryPlan = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantity(JAXBElement<String> value) {
        this.quantity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the secondaryPaymentAmountCovered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSecondaryPaymentAmountCovered() {
        return secondaryPaymentAmountCovered;
    }

    /**
     * Sets the value of the secondaryPaymentAmountCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSecondaryPaymentAmountCovered(JAXBElement<Double> value) {
        this.secondaryPaymentAmountCovered = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the secondaryPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondaryPaymentMethod() {
        return secondaryPaymentMethod;
    }

    /**
     * Sets the value of the secondaryPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondaryPaymentMethod(JAXBElement<String> value) {
        this.secondaryPaymentMethod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the secondaryPayor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondaryPayor() {
        return secondaryPayor;
    }

    /**
     * Sets the value of the secondaryPayor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondaryPayor(JAXBElement<String> value) {
        this.secondaryPayor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the secondaryPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondaryPlan() {
        return secondaryPlan;
    }

    /**
     * Sets the value of the secondaryPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondaryPlan(JAXBElement<String> value) {
        this.secondaryPlan = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FillStatus }
     *     
     */
    public FillStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FillStatus }
     *     
     */
    public void setStatus(FillStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the tertiaryPaymentAmountCovered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTertiaryPaymentAmountCovered() {
        return tertiaryPaymentAmountCovered;
    }

    /**
     * Sets the value of the tertiaryPaymentAmountCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTertiaryPaymentAmountCovered(JAXBElement<Double> value) {
        this.tertiaryPaymentAmountCovered = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the tertiaryPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTertiaryPaymentMethod() {
        return tertiaryPaymentMethod;
    }

    /**
     * Sets the value of the tertiaryPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTertiaryPaymentMethod(JAXBElement<String> value) {
        this.tertiaryPaymentMethod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tertiaryPayor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTertiaryPayor() {
        return tertiaryPayor;
    }

    /**
     * Sets the value of the tertiaryPayor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTertiaryPayor(JAXBElement<String> value) {
        this.tertiaryPayor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tertiaryPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTertiaryPlan() {
        return tertiaryPlan;
    }

    /**
     * Sets the value of the tertiaryPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTertiaryPlan(JAXBElement<String> value) {
        this.tertiaryPlan = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackingNumber(JAXBElement<String> value) {
        this.trackingNumber = ((JAXBElement<String> ) value);
    }

}
