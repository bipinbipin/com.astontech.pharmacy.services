
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
 *         &lt;element name="GetCreditCardsResult" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfCreditCard" minOccurs="0"/>
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
    "getCreditCardsResult"
})
@XmlRootElement(name = "GetCreditCardsResponse")
public class GetCreditCardsResponse {

    @XmlElementRef(name = "GetCreditCardsResult", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCreditCard> getCreditCardsResult;

    /**
     * Gets the value of the getCreditCardsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreditCard }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCreditCard> getGetCreditCardsResult() {
        return getCreditCardsResult;
    }

    /**
     * Sets the value of the getCreditCardsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreditCard }{@code >}
     *     
     */
    public void setGetCreditCardsResult(JAXBElement<ArrayOfCreditCard> value) {
        this.getCreditCardsResult = ((JAXBElement<ArrayOfCreditCard> ) value);
    }

}
