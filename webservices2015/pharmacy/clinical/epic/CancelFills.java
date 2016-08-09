
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="requests" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfCancelFillRequest" minOccurs="0"/>
 *         &lt;element name="isInteractive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workstationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnPharmacyNcpdpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelingPharmacyNcpdpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "isInteractive",
    "userId",
    "userIdType",
    "workstationId",
    "returnPharmacyNcpdpId",
    "cancelingPharmacyNcpdpId",
    "cancelReason"
})
@XmlRootElement(name = "CancelFills")
public class CancelFills {

    @XmlElementRef(name = "systemId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> systemId;
    @XmlElementRef(name = "requests", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCancelFillRequest> requests;
    protected Boolean isInteractive;
    @XmlElementRef(name = "userId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> userId;
    @XmlElementRef(name = "userIdType", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> userIdType;
    @XmlElementRef(name = "workstationId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> workstationId;
    @XmlElementRef(name = "returnPharmacyNcpdpId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> returnPharmacyNcpdpId;
    @XmlElementRef(name = "cancelingPharmacyNcpdpId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> cancelingPharmacyNcpdpId;
    @XmlElementRef(name = "cancelReason", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> cancelReason;

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
     *     {@link JAXBElement }{@code <}{@link ArrayOfCancelFillRequest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCancelFillRequest> getRequests() {
        return requests;
    }

    /**
     * Sets the value of the requests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCancelFillRequest }{@code >}
     *     
     */
    public void setRequests(JAXBElement<ArrayOfCancelFillRequest> value) {
        this.requests = ((JAXBElement<ArrayOfCancelFillRequest> ) value);
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

    /**
     * Gets the value of the returnPharmacyNcpdpId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnPharmacyNcpdpId() {
        return returnPharmacyNcpdpId;
    }

    /**
     * Sets the value of the returnPharmacyNcpdpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnPharmacyNcpdpId(JAXBElement<String> value) {
        this.returnPharmacyNcpdpId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cancelingPharmacyNcpdpId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCancelingPharmacyNcpdpId() {
        return cancelingPharmacyNcpdpId;
    }

    /**
     * Sets the value of the cancelingPharmacyNcpdpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCancelingPharmacyNcpdpId(JAXBElement<String> value) {
        this.cancelingPharmacyNcpdpId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCancelReason(JAXBElement<String> value) {
        this.cancelReason = ((JAXBElement<String> ) value);
    }

}
