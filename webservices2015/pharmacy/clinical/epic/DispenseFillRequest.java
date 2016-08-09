
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.CounselingStatus;


/**
 * <p>Java class for DispenseFillRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DispenseFillRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountCollected" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CounselingPharmacistProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounselingPharmacistProviderIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounselingPharmacistUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounselingPharmacistUserIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounselingStatus" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}CounselingStatus" minOccurs="0"/>
 *         &lt;element name="CustomerIdExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CustomerIdIssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispensedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrescriptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DispenseFillRequest", propOrder = {
    "amountCollected",
    "counselingPharmacistProviderId",
    "counselingPharmacistProviderIdType",
    "counselingPharmacistUserId",
    "counselingPharmacistUserIdType",
    "counselingStatus",
    "customerIdExpirationDate",
    "customerIdIssuedBy",
    "customerIdNumber",
    "customerIdType",
    "dispensedDateTime",
    "fillId",
    "prescriptionId"
})
public class DispenseFillRequest {

    @XmlElementRef(name = "AmountCollected", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Double> amountCollected;
    @XmlElementRef(name = "CounselingPharmacistProviderId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> counselingPharmacistProviderId;
    @XmlElementRef(name = "CounselingPharmacistProviderIdType", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> counselingPharmacistProviderIdType;
    @XmlElementRef(name = "CounselingPharmacistUserId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> counselingPharmacistUserId;
    @XmlElementRef(name = "CounselingPharmacistUserIdType", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> counselingPharmacistUserIdType;
    @XmlElement(name = "CounselingStatus")
    protected CounselingStatus counselingStatus;
    @XmlElementRef(name = "CustomerIdExpirationDate", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> customerIdExpirationDate;
    @XmlElementRef(name = "CustomerIdIssuedBy", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> customerIdIssuedBy;
    @XmlElementRef(name = "CustomerIdNumber", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> customerIdNumber;
    @XmlElementRef(name = "CustomerIdType", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> customerIdType;
    @XmlElementRef(name = "DispensedDateTime", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dispensedDateTime;
    @XmlElementRef(name = "FillId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> fillId;
    @XmlElementRef(name = "PrescriptionId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> prescriptionId;

    /**
     * Gets the value of the amountCollected property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAmountCollected() {
        return amountCollected;
    }

    /**
     * Sets the value of the amountCollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAmountCollected(JAXBElement<Double> value) {
        this.amountCollected = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the counselingPharmacistProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounselingPharmacistProviderId() {
        return counselingPharmacistProviderId;
    }

    /**
     * Sets the value of the counselingPharmacistProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounselingPharmacistProviderId(JAXBElement<String> value) {
        this.counselingPharmacistProviderId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the counselingPharmacistProviderIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounselingPharmacistProviderIdType() {
        return counselingPharmacistProviderIdType;
    }

    /**
     * Sets the value of the counselingPharmacistProviderIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounselingPharmacistProviderIdType(JAXBElement<String> value) {
        this.counselingPharmacistProviderIdType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the counselingPharmacistUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounselingPharmacistUserId() {
        return counselingPharmacistUserId;
    }

    /**
     * Sets the value of the counselingPharmacistUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounselingPharmacistUserId(JAXBElement<String> value) {
        this.counselingPharmacistUserId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the counselingPharmacistUserIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounselingPharmacistUserIdType() {
        return counselingPharmacistUserIdType;
    }

    /**
     * Sets the value of the counselingPharmacistUserIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounselingPharmacistUserIdType(JAXBElement<String> value) {
        this.counselingPharmacistUserIdType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the counselingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CounselingStatus }
     *     
     */
    public CounselingStatus getCounselingStatus() {
        return counselingStatus;
    }

    /**
     * Sets the value of the counselingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounselingStatus }
     *     
     */
    public void setCounselingStatus(CounselingStatus value) {
        this.counselingStatus = value;
    }

    /**
     * Gets the value of the customerIdExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCustomerIdExpirationDate() {
        return customerIdExpirationDate;
    }

    /**
     * Sets the value of the customerIdExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCustomerIdExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.customerIdExpirationDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the customerIdIssuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerIdIssuedBy() {
        return customerIdIssuedBy;
    }

    /**
     * Sets the value of the customerIdIssuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerIdIssuedBy(JAXBElement<String> value) {
        this.customerIdIssuedBy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerIdNumber() {
        return customerIdNumber;
    }

    /**
     * Sets the value of the customerIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerIdNumber(JAXBElement<String> value) {
        this.customerIdNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerIdType() {
        return customerIdType;
    }

    /**
     * Sets the value of the customerIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerIdType(JAXBElement<String> value) {
        this.customerIdType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dispensedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDispensedDateTime() {
        return dispensedDateTime;
    }

    /**
     * Sets the value of the dispensedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDispensedDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.dispensedDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the fillId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFillId() {
        return fillId;
    }

    /**
     * Sets the value of the fillId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFillId(JAXBElement<String> value) {
        this.fillId = ((JAXBElement<String> ) value);
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

}
