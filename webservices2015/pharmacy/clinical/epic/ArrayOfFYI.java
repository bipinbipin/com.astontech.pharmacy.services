
package webservices2015.pharmacy.clinical.epic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFYI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFYI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FYI" type="{Epic.Clinical.Pharmacy.WebServices2015}FYI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFYI", propOrder = {
    "fyi"
})
public class ArrayOfFYI {

    @XmlElement(name = "FYI", nillable = true)
    protected List<FYI> fyi;

    /**
     * Gets the value of the fyi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fyi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFYI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FYI }
     * 
     * 
     */
    public List<FYI> getFYI() {
        if (fyi == null) {
            fyi = new ArrayList<FYI>();
        }
        return this.fyi;
    }

}
