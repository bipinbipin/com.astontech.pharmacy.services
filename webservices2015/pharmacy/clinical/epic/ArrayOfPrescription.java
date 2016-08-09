
package webservices2015.pharmacy.clinical.epic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prescription" type="{Epic.Clinical.Pharmacy.WebServices2015}Prescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrescription", propOrder = {
    "prescription"
})
public class ArrayOfPrescription {

    @XmlElement(name = "Prescription", nillable = true)
    protected List<Prescription> prescription;

    /**
     * Gets the value of the prescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prescription }
     * 
     * 
     */
    public List<Prescription> getPrescription() {
        if (prescription == null) {
            prescription = new ArrayList<Prescription>();
        }
        return this.prescription;
    }

}
