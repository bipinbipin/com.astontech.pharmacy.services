
package webservices2015.pharmacy.clinical.epic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContactMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContactMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactMethod" type="{Epic.Clinical.Pharmacy.WebServices2015}ContactMethod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContactMethod", propOrder = {
    "contactMethod"
})
public class ArrayOfContactMethod {

    @XmlElement(name = "ContactMethod", nillable = true)
    protected List<ContactMethod> contactMethod;

    /**
     * Gets the value of the contactMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMethod }
     * 
     * 
     */
    public List<ContactMethod> getContactMethod() {
        if (contactMethod == null) {
            contactMethod = new ArrayList<ContactMethod>();
        }
        return this.contactMethod;
    }

}
