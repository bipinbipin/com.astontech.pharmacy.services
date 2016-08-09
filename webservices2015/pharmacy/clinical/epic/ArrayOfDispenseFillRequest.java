
package webservices2015.pharmacy.clinical.epic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDispenseFillRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDispenseFillRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DispenseFillRequest" type="{Epic.Clinical.Pharmacy.WebServices2015}DispenseFillRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDispenseFillRequest", propOrder = {
    "dispenseFillRequest"
})
public class ArrayOfDispenseFillRequest {

    @XmlElement(name = "DispenseFillRequest", nillable = true)
    protected List<DispenseFillRequest> dispenseFillRequest;

    /**
     * Gets the value of the dispenseFillRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispenseFillRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispenseFillRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DispenseFillRequest }
     * 
     * 
     */
    public List<DispenseFillRequest> getDispenseFillRequest() {
        if (dispenseFillRequest == null) {
            dispenseFillRequest = new ArrayList<DispenseFillRequest>();
        }
        return this.dispenseFillRequest;
    }

}
