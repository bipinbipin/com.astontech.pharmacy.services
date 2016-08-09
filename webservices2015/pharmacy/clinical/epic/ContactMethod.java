
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.ContactMethodType;


/**
 * <p>Java class for ContactMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}ContactMethodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMethod", propOrder = {
    "data",
    "type"
})
public class ContactMethod {

    @XmlElementRef(name = "Data", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> data;
    @XmlElementRef(name = "Type", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ContactMethodType> type;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setData(JAXBElement<String> value) {
        this.data = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactMethodType }{@code >}
     *     
     */
    public JAXBElement<ContactMethodType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactMethodType }{@code >}
     *     
     */
    public void setType(JAXBElement<ContactMethodType> value) {
        this.type = ((JAXBElement<ContactMethodType> ) value);
    }

}
