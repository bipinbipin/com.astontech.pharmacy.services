
package webservices2015.pharmacy.clinical.epic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFillRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFillRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FillRequest" type="{Epic.Clinical.Pharmacy.WebServices2015}FillRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFillRequest", propOrder = {
    "fillRequest"
})
public class ArrayOfFillRequest {

    @XmlElement(name = "FillRequest", nillable = true)
    protected List<FillRequest> fillRequest;

    /**
     * Gets the value of the fillRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fillRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFillRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FillRequest }
     * 
     * 
     */
    public List<FillRequest> getFillRequest() {
        if (fillRequest == null) {
            fillRequest = new ArrayList<FillRequest>();
        }
        return this.fillRequest;
    }

}
