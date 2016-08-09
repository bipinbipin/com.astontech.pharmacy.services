
package webservices2015.pharmacy.clinical.epic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCancelFillRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCancelFillRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelFillRequest" type="{Epic.Clinical.Pharmacy.WebServices2015}CancelFillRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCancelFillRequest", propOrder = {
    "cancelFillRequest"
})
public class ArrayOfCancelFillRequest {

    @XmlElement(name = "CancelFillRequest", nillable = true)
    protected List<CancelFillRequest> cancelFillRequest;

    /**
     * Gets the value of the cancelFillRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelFillRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelFillRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelFillRequest }
     * 
     * 
     */
    public List<CancelFillRequest> getCancelFillRequest() {
        if (cancelFillRequest == null) {
            cancelFillRequest = new ArrayList<CancelFillRequest>();
        }
        return this.cancelFillRequest;
    }

}
