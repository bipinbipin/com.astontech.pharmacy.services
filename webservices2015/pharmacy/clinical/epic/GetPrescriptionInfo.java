
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.FillSubset;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.PrescriptionSubset;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pharmacyNCPDPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientMRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prescriptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="whichPrescriptions" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}PrescriptionSubset" minOccurs="0"/>
 *         &lt;element name="whichFills" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}FillSubset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "systemId",
    "pharmacyNCPDPId",
    "patientMRN",
    "prescriptionNumber",
    "fillId",
    "whichPrescriptions",
    "whichFills"
})
@XmlRootElement(name = "GetPrescriptionInfo")
public class GetPrescriptionInfo {

    @XmlElementRef(name = "systemId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> systemId;
    @XmlElementRef(name = "pharmacyNCPDPId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> pharmacyNCPDPId;
    @XmlElementRef(name = "patientMRN", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> patientMRN;
    @XmlElementRef(name = "prescriptionNumber", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> prescriptionNumber;
    @XmlElementRef(name = "fillId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> fillId;
    protected PrescriptionSubset whichPrescriptions;
    protected FillSubset whichFills;

    /**
     * Gets the value of the systemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSystemId(JAXBElement<String> value) {
        this.systemId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pharmacyNCPDPId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPharmacyNCPDPId() {
        return pharmacyNCPDPId;
    }

    /**
     * Sets the value of the pharmacyNCPDPId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPharmacyNCPDPId(JAXBElement<String> value) {
        this.pharmacyNCPDPId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the patientMRN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPatientMRN() {
        return patientMRN;
    }

    /**
     * Sets the value of the patientMRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPatientMRN(JAXBElement<String> value) {
        this.patientMRN = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prescriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrescriptionNumber() {
        return prescriptionNumber;
    }

    /**
     * Sets the value of the prescriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrescriptionNumber(JAXBElement<String> value) {
        this.prescriptionNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fillId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFillId() {
        return fillId;
    }

    /**
     * Sets the value of the fillId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFillId(JAXBElement<String> value) {
        this.fillId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the whichPrescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionSubset }
     *     
     */
    public PrescriptionSubset getWhichPrescriptions() {
        return whichPrescriptions;
    }

    /**
     * Sets the value of the whichPrescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionSubset }
     *     
     */
    public void setWhichPrescriptions(PrescriptionSubset value) {
        this.whichPrescriptions = value;
    }

    /**
     * Gets the value of the whichFills property.
     * 
     * @return
     *     possible object is
     *     {@link FillSubset }
     *     
     */
    public FillSubset getWhichFills() {
        return whichFills;
    }

    /**
     * Sets the value of the whichFills property.
     * 
     * @param value
     *     allowed object is
     *     {@link FillSubset }
     *     
     */
    public void setWhichFills(FillSubset value) {
        this.whichFills = value;
    }

}
