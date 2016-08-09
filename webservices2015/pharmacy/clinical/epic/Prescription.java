
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.epic_clinical.MedicationOrderMedicationOrderStatus;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.DEACode;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.RARStatus;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.RefillAuthorizationRequestMode;


/**
 * <p>Java class for Prescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthorizingProviderDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEACode" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}DEACode" minOccurs="0"/>
 *         &lt;element name="DEACodeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEACodeTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Fills" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfFill" minOccurs="0"/>
 *         &lt;element name="FillsRemaining" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FirstFilled" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Flags" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfFlag" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasFillInProgress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasFillReadyForPickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEnrolledInAutoFill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFillable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPartialFillRemaining" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRARable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastFilled" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastFilledDaysSupply" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Medication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderingProviderDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwningPharmacy" type="{Epic.Clinical.Pharmacy.WebServices2015}Pharmacy" minOccurs="0"/>
 *         &lt;element name="PrescriptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RARPrescriptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RARPrescriptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RARStatus" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}RARStatus" minOccurs="0"/>
 *         &lt;element name="ReasonNotFillable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReasonNotRARable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RefillAuthorizationProvider" type="{Epic.Clinical.Pharmacy.WebServices2015}Provider" minOccurs="0"/>
 *         &lt;element name="RefillAuthorizationRequestMode" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}RefillAuthorizationRequestMode" minOccurs="0"/>
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Orders}MedicationOrder.MedicationOrderStatus" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prescription", propOrder = {
    "authorizingProviderDisplayName",
    "deaCode",
    "deaCodeNumber",
    "deaCodeTitle",
    "dose",
    "endDate",
    "fills",
    "fillsRemaining",
    "firstFilled",
    "flags",
    "frequency",
    "hasFillInProgress",
    "hasFillReadyForPickup",
    "id",
    "isEnrolledInAutoFill",
    "isFillable",
    "isPartialFillRemaining",
    "isRARable",
    "lastFilled",
    "lastFilledDaysSupply",
    "medication",
    "orderingProviderDisplayName",
    "owningPharmacy",
    "prescriptionNumber",
    "rarPrescriptionId",
    "rarPrescriptionNumber",
    "rarStatus",
    "reasonNotFillable",
    "reasonNotRARable",
    "refillAuthorizationProvider",
    "refillAuthorizationRequestMode",
    "route",
    "sig",
    "startDate",
    "status",
    "timestamp"
})
public class Prescription {

    @XmlElementRef(name = "AuthorizingProviderDisplayName", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> authorizingProviderDisplayName;
    @XmlElementRef(name = "DEACode", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<DEACode> deaCode;
    @XmlElementRef(name = "DEACodeNumber", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> deaCodeNumber;
    @XmlElementRef(name = "DEACodeTitle", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> deaCodeTitle;
    @XmlElementRef(name = "Dose", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> dose;
    @XmlElementRef(name = "EndDate", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "Fills", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFill> fills;
    @XmlElement(name = "FillsRemaining")
    protected Integer fillsRemaining;
    @XmlElementRef(name = "FirstFilled", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> firstFilled;
    @XmlElementRef(name = "Flags", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFlag> flags;
    @XmlElementRef(name = "Frequency", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> frequency;
    @XmlElement(name = "HasFillInProgress")
    protected Boolean hasFillInProgress;
    @XmlElement(name = "HasFillReadyForPickup")
    protected Boolean hasFillReadyForPickup;
    @XmlElementRef(name = "Id", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> id;
    @XmlElement(name = "IsEnrolledInAutoFill")
    protected Boolean isEnrolledInAutoFill;
    @XmlElement(name = "IsFillable")
    protected Boolean isFillable;
    @XmlElement(name = "IsPartialFillRemaining")
    protected Boolean isPartialFillRemaining;
    @XmlElement(name = "IsRARable")
    protected Boolean isRARable;
    @XmlElementRef(name = "LastFilled", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastFilled;
    @XmlElementRef(name = "LastFilledDaysSupply", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Integer> lastFilledDaysSupply;
    @XmlElementRef(name = "Medication", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> medication;
    @XmlElementRef(name = "OrderingProviderDisplayName", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> orderingProviderDisplayName;
    @XmlElementRef(name = "OwningPharmacy", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Pharmacy> owningPharmacy;
    @XmlElementRef(name = "PrescriptionNumber", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> prescriptionNumber;
    @XmlElementRef(name = "RARPrescriptionId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> rarPrescriptionId;
    @XmlElementRef(name = "RARPrescriptionNumber", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> rarPrescriptionNumber;
    @XmlElementRef(name = "RARStatus", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<RARStatus> rarStatus;
    @XmlElementRef(name = "ReasonNotFillable", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Integer> reasonNotFillable;
    @XmlElementRef(name = "ReasonNotRARable", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Integer> reasonNotRARable;
    @XmlElementRef(name = "RefillAuthorizationProvider", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Provider> refillAuthorizationProvider;
    @XmlElementRef(name = "RefillAuthorizationRequestMode", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<RefillAuthorizationRequestMode> refillAuthorizationRequestMode;
    @XmlElementRef(name = "Route", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> route;
    @XmlElementRef(name = "Sig", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> sig;
    @XmlElementRef(name = "StartDate", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElement(name = "Status")
    protected MedicationOrderMedicationOrderStatus status;
    @XmlElementRef(name = "Timestamp", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> timestamp;

    /**
     * Gets the value of the authorizingProviderDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorizingProviderDisplayName() {
        return authorizingProviderDisplayName;
    }

    /**
     * Sets the value of the authorizingProviderDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorizingProviderDisplayName(JAXBElement<String> value) {
        this.authorizingProviderDisplayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the deaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DEACode }{@code >}
     *     
     */
    public JAXBElement<DEACode> getDEACode() {
        return deaCode;
    }

    /**
     * Sets the value of the deaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DEACode }{@code >}
     *     
     */
    public void setDEACode(JAXBElement<DEACode> value) {
        this.deaCode = ((JAXBElement<DEACode> ) value);
    }

    /**
     * Gets the value of the deaCodeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEACodeNumber() {
        return deaCodeNumber;
    }

    /**
     * Sets the value of the deaCodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEACodeNumber(JAXBElement<String> value) {
        this.deaCodeNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the deaCodeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEACodeTitle() {
        return deaCodeTitle;
    }

    /**
     * Sets the value of the deaCodeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEACodeTitle(JAXBElement<String> value) {
        this.deaCodeTitle = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDose() {
        return dose;
    }

    /**
     * Sets the value of the dose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDose(JAXBElement<String> value) {
        this.dose = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the fills property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFill }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFill> getFills() {
        return fills;
    }

    /**
     * Sets the value of the fills property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFill }{@code >}
     *     
     */
    public void setFills(JAXBElement<ArrayOfFill> value) {
        this.fills = ((JAXBElement<ArrayOfFill> ) value);
    }

    /**
     * Gets the value of the fillsRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFillsRemaining() {
        return fillsRemaining;
    }

    /**
     * Sets the value of the fillsRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFillsRemaining(Integer value) {
        this.fillsRemaining = value;
    }

    /**
     * Gets the value of the firstFilled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirstFilled() {
        return firstFilled;
    }

    /**
     * Sets the value of the firstFilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirstFilled(JAXBElement<XMLGregorianCalendar> value) {
        this.firstFilled = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequency(JAXBElement<String> value) {
        this.frequency = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hasFillInProgress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFillInProgress() {
        return hasFillInProgress;
    }

    /**
     * Sets the value of the hasFillInProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFillInProgress(Boolean value) {
        this.hasFillInProgress = value;
    }

    /**
     * Gets the value of the hasFillReadyForPickup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFillReadyForPickup() {
        return hasFillReadyForPickup;
    }

    /**
     * Sets the value of the hasFillReadyForPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFillReadyForPickup(Boolean value) {
        this.hasFillReadyForPickup = value;
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
     * Gets the value of the isEnrolledInAutoFill property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnrolledInAutoFill() {
        return isEnrolledInAutoFill;
    }

    /**
     * Sets the value of the isEnrolledInAutoFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnrolledInAutoFill(Boolean value) {
        this.isEnrolledInAutoFill = value;
    }

    /**
     * Gets the value of the isFillable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFillable() {
        return isFillable;
    }

    /**
     * Sets the value of the isFillable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFillable(Boolean value) {
        this.isFillable = value;
    }

    /**
     * Gets the value of the isPartialFillRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartialFillRemaining() {
        return isPartialFillRemaining;
    }

    /**
     * Sets the value of the isPartialFillRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartialFillRemaining(Boolean value) {
        this.isPartialFillRemaining = value;
    }

    /**
     * Gets the value of the isRARable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRARable() {
        return isRARable;
    }

    /**
     * Sets the value of the isRARable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRARable(Boolean value) {
        this.isRARable = value;
    }

    /**
     * Gets the value of the lastFilled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastFilled() {
        return lastFilled;
    }

    /**
     * Sets the value of the lastFilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastFilled(JAXBElement<XMLGregorianCalendar> value) {
        this.lastFilled = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the lastFilledDaysSupply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLastFilledDaysSupply() {
        return lastFilledDaysSupply;
    }

    /**
     * Sets the value of the lastFilledDaysSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLastFilledDaysSupply(JAXBElement<Integer> value) {
        this.lastFilledDaysSupply = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the medication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMedication() {
        return medication;
    }

    /**
     * Sets the value of the medication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMedication(JAXBElement<String> value) {
        this.medication = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orderingProviderDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderingProviderDisplayName() {
        return orderingProviderDisplayName;
    }

    /**
     * Sets the value of the orderingProviderDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderingProviderDisplayName(JAXBElement<String> value) {
        this.orderingProviderDisplayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the owningPharmacy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Pharmacy }{@code >}
     *     
     */
    public JAXBElement<Pharmacy> getOwningPharmacy() {
        return owningPharmacy;
    }

    /**
     * Sets the value of the owningPharmacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Pharmacy }{@code >}
     *     
     */
    public void setOwningPharmacy(JAXBElement<Pharmacy> value) {
        this.owningPharmacy = ((JAXBElement<Pharmacy> ) value);
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
     * Gets the value of the rarPrescriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRARPrescriptionId() {
        return rarPrescriptionId;
    }

    /**
     * Sets the value of the rarPrescriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRARPrescriptionId(JAXBElement<String> value) {
        this.rarPrescriptionId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rarPrescriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRARPrescriptionNumber() {
        return rarPrescriptionNumber;
    }

    /**
     * Sets the value of the rarPrescriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRARPrescriptionNumber(JAXBElement<String> value) {
        this.rarPrescriptionNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rarStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RARStatus }{@code >}
     *     
     */
    public JAXBElement<RARStatus> getRARStatus() {
        return rarStatus;
    }

    /**
     * Sets the value of the rarStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RARStatus }{@code >}
     *     
     */
    public void setRARStatus(JAXBElement<RARStatus> value) {
        this.rarStatus = ((JAXBElement<RARStatus> ) value);
    }

    /**
     * Gets the value of the reasonNotFillable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReasonNotFillable() {
        return reasonNotFillable;
    }

    /**
     * Sets the value of the reasonNotFillable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReasonNotFillable(JAXBElement<Integer> value) {
        this.reasonNotFillable = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the reasonNotRARable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReasonNotRARable() {
        return reasonNotRARable;
    }

    /**
     * Sets the value of the reasonNotRARable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReasonNotRARable(JAXBElement<Integer> value) {
        this.reasonNotRARable = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the refillAuthorizationProvider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Provider }{@code >}
     *     
     */
    public JAXBElement<Provider> getRefillAuthorizationProvider() {
        return refillAuthorizationProvider;
    }

    /**
     * Sets the value of the refillAuthorizationProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Provider }{@code >}
     *     
     */
    public void setRefillAuthorizationProvider(JAXBElement<Provider> value) {
        this.refillAuthorizationProvider = ((JAXBElement<Provider> ) value);
    }

    /**
     * Gets the value of the refillAuthorizationRequestMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RefillAuthorizationRequestMode }{@code >}
     *     
     */
    public JAXBElement<RefillAuthorizationRequestMode> getRefillAuthorizationRequestMode() {
        return refillAuthorizationRequestMode;
    }

    /**
     * Sets the value of the refillAuthorizationRequestMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RefillAuthorizationRequestMode }{@code >}
     *     
     */
    public void setRefillAuthorizationRequestMode(JAXBElement<RefillAuthorizationRequestMode> value) {
        this.refillAuthorizationRequestMode = ((JAXBElement<RefillAuthorizationRequestMode> ) value);
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoute(JAXBElement<String> value) {
        this.route = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSig() {
        return sig;
    }

    /**
     * Sets the value of the sig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSig(JAXBElement<String> value) {
        this.sig = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationOrderMedicationOrderStatus }
     *     
     */
    public MedicationOrderMedicationOrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationOrderMedicationOrderStatus }
     *     
     */
    public void setStatus(MedicationOrderMedicationOrderStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.timestamp = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
