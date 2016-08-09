
package webservices2015.pharmacy.clinical.epic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdvanceFillStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdvanceFillStatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvanceFillStatusRequest" type="{Epic.Clinical.Pharmacy.WebServices2015}AdvanceFillStatusRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdvanceFillStatusRequest", propOrder = {
    "advanceFillStatusRequest"
})
public class ArrayOfAdvanceFillStatusRequest {

    @XmlElement(name = "AdvanceFillStatusRequest", nillable = true)
    protected List<AdvanceFillStatusRequest> advanceFillStatusRequest;

    /**
     * Gets the value of the advanceFillStatusRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advanceFillStatusRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvanceFillStatusRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvanceFillStatusRequest }
     * 
     * 
     */
    public List<AdvanceFillStatusRequest> getAdvanceFillStatusRequest() {
        if (advanceFillStatusRequest == null) {
            advanceFillStatusRequest = new ArrayList<AdvanceFillStatusRequest>();
        }
        return this.advanceFillStatusRequest;
    }

}
