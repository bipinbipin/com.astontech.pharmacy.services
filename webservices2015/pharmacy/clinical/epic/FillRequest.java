
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.epic_clinical.RefillAuthorizationRequestToBeInitiatedBy;


/**
 * <p>Java class for FillRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FillRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentsURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FillQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FreeTextPrescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrescriptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefillAuthorizationRequestToBeInitiatedBy" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Orders}RefillAuthorizationRequestToBeInitiatedBy" minOccurs="0"/>
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
@XmlType(name = "FillRequest", propOrder = {
    "comments",
    "commentsURI",
    "fillQuantity",
    "freeTextPrescription",
    "prescriptionId",
    "refillAuthorizationRequestToBeInitiatedBy",
    "timestamp"
})
public class FillRequest {

    @XmlElementRef(name = "Comments", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "CommentsURI", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> commentsURI;
    @XmlElementRef(name = "FillQuantity", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Integer> fillQuantity;
    @XmlElementRef(name = "FreeTextPrescription", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> freeTextPrescription;
    @XmlElementRef(name = "PrescriptionId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> prescriptionId;
    @XmlElementRef(name = "RefillAuthorizationRequestToBeInitiatedBy", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<RefillAuthorizationRequestToBeInitiatedBy> refillAuthorizationRequestToBeInitiatedBy;
    @XmlElementRef(name = "Timestamp", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> timestamp;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the commentsURI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommentsURI() {
        return commentsURI;
    }

    /**
     * Sets the value of the commentsURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommentsURI(JAXBElement<String> value) {
        this.commentsURI = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fillQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFillQuantity() {
        return fillQuantity;
    }

    /**
     * Sets the value of the fillQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFillQuantity(JAXBElement<Integer> value) {
        this.fillQuantity = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the freeTextPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreeTextPrescription() {
        return freeTextPrescription;
    }

    /**
     * Sets the value of the freeTextPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreeTextPrescription(JAXBElement<String> value) {
        this.freeTextPrescription = ((JAXBElement<String> ) value);
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
     * Gets the value of the refillAuthorizationRequestToBeInitiatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RefillAuthorizationRequestToBeInitiatedBy }{@code >}
     *     
     */
    public JAXBElement<RefillAuthorizationRequestToBeInitiatedBy> getRefillAuthorizationRequestToBeInitiatedBy() {
        return refillAuthorizationRequestToBeInitiatedBy;
    }

    /**
     * Sets the value of the refillAuthorizationRequestToBeInitiatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RefillAuthorizationRequestToBeInitiatedBy }{@code >}
     *     
     */
    public void setRefillAuthorizationRequestToBeInitiatedBy(JAXBElement<RefillAuthorizationRequestToBeInitiatedBy> value) {
        this.refillAuthorizationRequestToBeInitiatedBy = ((JAXBElement<RefillAuthorizationRequestToBeInitiatedBy> ) value);
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
