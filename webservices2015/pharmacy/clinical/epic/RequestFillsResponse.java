
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
 *         &lt;element name="RequestFillsResult" type="{Epic.Clinical.Pharmacy.WebServices2015}UpdateResult" minOccurs="0"/>
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
    "requestFillsResult"
})
@XmlRootElement(name = "RequestFillsResponse")
public class RequestFillsResponse {

    @XmlElementRef(name = "RequestFillsResult", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<UpdateResult> requestFillsResult;

    /**
     * Gets the value of the requestFillsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateResult }{@code >}
     *     
     */
    public JAXBElement<UpdateResult> getRequestFillsResult() {
        return requestFillsResult;
    }

    /**
     * Sets the value of the requestFillsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateResult }{@code >}
     *     
     */
    public void setRequestFillsResult(JAXBElement<UpdateResult> value) {
        this.requestFillsResult = ((JAXBElement<UpdateResult> ) value);
    }

}
