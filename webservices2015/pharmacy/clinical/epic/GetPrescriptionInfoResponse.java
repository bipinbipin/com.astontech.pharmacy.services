
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
 *         &lt;element name="GetPrescriptionInfoResult" type="{Epic.Clinical.Pharmacy.WebServices2015}PrescriptionInfo" minOccurs="0"/>
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
    "getPrescriptionInfoResult"
})
@XmlRootElement(name = "GetPrescriptionInfoResponse")
public class GetPrescriptionInfoResponse {

    @XmlElementRef(name = "GetPrescriptionInfoResult", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<PrescriptionInfo> getPrescriptionInfoResult;

    /**
     * Gets the value of the getPrescriptionInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrescriptionInfo }{@code >}
     *     
     */
    public JAXBElement<PrescriptionInfo> getGetPrescriptionInfoResult() {
        return getPrescriptionInfoResult;
    }

    /**
     * Sets the value of the getPrescriptionInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrescriptionInfo }{@code >}
     *     
     */
    public void setGetPrescriptionInfoResult(JAXBElement<PrescriptionInfo> value) {
        this.getPrescriptionInfoResult = ((JAXBElement<PrescriptionInfo> ) value);
    }

}
