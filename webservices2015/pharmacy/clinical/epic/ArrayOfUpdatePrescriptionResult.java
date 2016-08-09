
package webservices2015.pharmacy.clinical.epic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdatePrescriptionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpdatePrescriptionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdatePrescriptionResult" type="{Epic.Clinical.Pharmacy.WebServices2015}UpdatePrescriptionResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdatePrescriptionResult", propOrder = {
    "updatePrescriptionResult"
})
public class ArrayOfUpdatePrescriptionResult {

    @XmlElement(name = "UpdatePrescriptionResult", nillable = true)
    protected List<UpdatePrescriptionResult> updatePrescriptionResult;

    /**
     * Gets the value of the updatePrescriptionResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatePrescriptionResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatePrescriptionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatePrescriptionResult }
     * 
     * 
     */
    public List<UpdatePrescriptionResult> getUpdatePrescriptionResult() {
        if (updatePrescriptionResult == null) {
            updatePrescriptionResult = new ArrayList<UpdatePrescriptionResult>();
        }
        return this.updatePrescriptionResult;
    }

}
