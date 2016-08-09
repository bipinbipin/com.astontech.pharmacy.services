
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.DeliveryDestination;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.DeliveryMethod;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.PatientPaymentMethod;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requests" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfFillRequest" minOccurs="0"/>
 *         &lt;element name="pickupDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pickupPharmacyNCPDPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="freeTextPickupPharmacy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactMethods" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfContactMethod" minOccurs="0"/>
 *         &lt;element name="contactRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentsURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryMethod" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}DeliveryMethod" minOccurs="0"/>
 *         &lt;element name="deliveryDestination" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}DeliveryDestination" minOccurs="0"/>
 *         &lt;element name="deliveryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}PatientPaymentMethod" minOccurs="0"/>
 *         &lt;element name="creditCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedNotificationsWhenFilled" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfContactMethod" minOccurs="0"/>
 *         &lt;element name="isInteractive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workstationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "systemId",
    "requests",
    "pickupDateTime",
    "pickupPharmacyNCPDPId",
    "freeTextPickupPharmacy",
    "contactMethods",
    "contactRequested",
    "comments",
    "commentsURI",
    "deliveryMethod",
    "deliveryDestination",
    "deliveryComments",
    "paymentMethod",
    "creditCardId",
    "requestedNotificationsWhenFilled",
    "isInteractive",
    "userId",
    "userIdType",
    "workstationId"
})
@XmlRootElement(name = "RequestFills")
public class RequestFills {

    @XmlElementRef(name = "systemId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> systemId;
    @XmlElementRef(name = "requests", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFillRequest> requests;
    @XmlElementRef(name = "pickupDateTime", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> pickupDateTime;
    @XmlElementRef(name = "pickupPharmacyNCPDPId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> pickupPharmacyNCPDPId;
    @XmlElementRef(name = "freeTextPickupPharmacy", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> freeTextPickupPharmacy;
    @XmlElementRef(name = "contactMethods", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfContactMethod> contactMethods;
    @XmlElementRef(name = "contactRequested", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Boolean> contactRequested;
    @XmlElementRef(name = "comments", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "commentsURI", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> commentsURI;
    @XmlElementRef(name = "deliveryMethod", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<DeliveryMethod> deliveryMethod;
    @XmlElementRef(name = "deliveryDestination", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<DeliveryDestination> deliveryDestination;
    @XmlElementRef(name = "deliveryComments", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> deliveryComments;
    @XmlElementRef(name = "paymentMethod", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<PatientPaymentMethod> paymentMethod;
    @XmlElementRef(name = "creditCardId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> creditCardId;
    @XmlElementRef(name = "RequestedNotificationsWhenFilled", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfContactMethod> requestedNotificationsWhenFilled;
    protected Boolean isInteractive;
    @XmlElementRef(name = "userId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> userId;
    @XmlElementRef(name = "userIdType", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> userIdType;
    @XmlElementRef(name = "workstationId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> workstationId;

    /**
     * Gets the value of the systemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSystemId(JAXBElement<String> value) {
        this.systemId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the requests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFillRequest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFillRequest> getRequests() {
        return requests;
    }

    /**
     * Sets the value of the requests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFillRequest }{@code >}
     *     
     */
    public void setRequests(JAXBElement<ArrayOfFillRequest> value) {
        this.requests = ((JAXBElement<ArrayOfFillRequest> ) value);
    }

    /**
     * Gets the value of the pickupDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPickupDateTime() {
        return pickupDateTime;
    }

    /**
     * Sets the value of the pickupDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPickupDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.pickupDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the freeTextPickupPharmacy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreeTextPickupPharmacy() {
        return freeTextPickupPharmacy;
    }

    /**
     * Sets the value of the freeTextPickupPharmacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreeTextPickupPharmacy(JAXBElement<String> value) {
        this.freeTextPickupPharmacy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contactMethods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContactMethod }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContactMethod> getContactMethods() {
        return contactMethods;
    }

    /**
     * Sets the value of the contactMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContactMethod }{@code >}
     *     
     */
    public void setContactMethods(JAXBElement<ArrayOfContactMethod> value) {
        this.contactMethods = ((JAXBElement<ArrayOfContactMethod> ) value);
    }

    /**
     * Gets the value of the contactRequested property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getContactRequested() {
        return contactRequested;
    }

    /**
     * Sets the value of the contactRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setContactRequested(JAXBElement<Boolean> value) {
        this.contactRequested = ((JAXBElement<Boolean> ) value);
    }

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
     * Gets the value of the deliveryDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeliveryDestination }{@code >}
     *     
     */
    public JAXBElement<DeliveryDestination> getDeliveryDestination() {
        return deliveryDestination;
    }

    /**
     * Sets the value of the deliveryDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeliveryDestination }{@code >}
     *     
     */
    public void setDeliveryDestination(JAXBElement<DeliveryDestination> value) {
        this.deliveryDestination = ((JAXBElement<DeliveryDestination> ) value);
    }

    /**
     * Gets the value of the deliveryComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryComments() {
        return deliveryComments;
    }

    /**
     * Sets the value of the deliveryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryComments(JAXBElement<String> value) {
        this.deliveryComments = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PatientPaymentMethod }{@code >}
     *     
     */
    public JAXBElement<PatientPaymentMethod> getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PatientPaymentMethod }{@code >}
     *     
     */
    public void setPaymentMethod(JAXBElement<PatientPaymentMethod> value) {
        this.paymentMethod = ((JAXBElement<PatientPaymentMethod> ) value);
    }

    /**
     * Gets the value of the creditCardId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditCardId() {
        return creditCardId;
    }

    /**
     * Sets the value of the creditCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditCardId(JAXBElement<String> value) {
        this.creditCardId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the requestedNotificationsWhenFilled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContactMethod }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContactMethod> getRequestedNotificationsWhenFilled() {
        return requestedNotificationsWhenFilled;
    }

    /**
     * Sets the value of the requestedNotificationsWhenFilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContactMethod }{@code >}
     *     
     */
    public void setRequestedNotificationsWhenFilled(JAXBElement<ArrayOfContactMethod> value) {
        this.requestedNotificationsWhenFilled = ((JAXBElement<ArrayOfContactMethod> ) value);
    }

    /**
     * Gets the value of the isInteractive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInteractive() {
        return isInteractive;
    }

    /**
     * Sets the value of the isInteractive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInteractive(Boolean value) {
        this.isInteractive = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserId(JAXBElement<String> value) {
        this.userId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserIdType() {
        return userIdType;
    }

    /**
     * Sets the value of the userIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserIdType(JAXBElement<String> value) {
        this.userIdType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workstationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkstationId() {
        return workstationId;
    }

    /**
     * Sets the value of the workstationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkstationId(JAXBElement<String> value) {
        this.workstationId = ((JAXBElement<String> ) value);
    }

}
