
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrescriptionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrescriptionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Patient" type="{Epic.Clinical.Pharmacy.WebServices2015}Patient" minOccurs="0"/>
 *         &lt;element name="Prescriptions" type="{Epic.Clinical.Pharmacy.WebServices2015}ArrayOfPrescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrescriptionInfo", propOrder = {
    "patient",
    "prescriptions"
})
public class PrescriptionInfo {

    @XmlElementRef(name = "Patient", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Patient> patient;
    @XmlElementRef(name = "Prescriptions", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPrescription> prescriptions;

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Patient }{@code >}
     *     
     */
    public JAXBElement<Patient> getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Patient }{@code >}
     *     
     */
    public void setPatient(JAXBElement<Patient> value) {
        this.patient = ((JAXBElement<Patient> ) value);
    }

    /**
     * Gets the value of the prescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPrescription }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPrescription> getPrescriptions() {
        return prescriptions;
    }

    /**
     * Sets the value of the prescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPrescription }{@code >}
     *     
     */
    public void setPrescriptions(JAXBElement<ArrayOfPrescription> value) {
        this.prescriptions = ((JAXBElement<ArrayOfPrescription> ) value);
    }

}
