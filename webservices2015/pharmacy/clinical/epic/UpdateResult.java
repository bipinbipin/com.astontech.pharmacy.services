
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrescriptionsUpdated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UpdatePrescriptionResults" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfUpdatePrescriptionResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateResult", propOrder = {
    "errorCode",
    "errorMessage",
    "prescriptionsUpdated",
    "updatePrescriptionResults"
})
public class UpdateResult {

    @XmlElement(name = "ErrorCode")
    protected Integer errorCode;
    @XmlElementRef(name = "ErrorMessage", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "PrescriptionsUpdated")
    protected Integer prescriptionsUpdated;
    @XmlElementRef(name = "UpdatePrescriptionResults", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUpdatePrescriptionResult> updatePrescriptionResults;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prescriptionsUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrescriptionsUpdated() {
        return prescriptionsUpdated;
    }

    /**
     * Sets the value of the prescriptionsUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrescriptionsUpdated(Integer value) {
        this.prescriptionsUpdated = value;
    }

    /**
     * Gets the value of the updatePrescriptionResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdatePrescriptionResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUpdatePrescriptionResult> getUpdatePrescriptionResults() {
        return updatePrescriptionResults;
    }

    /**
     * Sets the value of the updatePrescriptionResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdatePrescriptionResult }{@code >}
     *     
     */
    public void setUpdatePrescriptionResults(JAXBElement<ArrayOfUpdatePrescriptionResult> value) {
        this.updatePrescriptionResults = ((JAXBElement<ArrayOfUpdatePrescriptionResult> ) value);
    }

}
