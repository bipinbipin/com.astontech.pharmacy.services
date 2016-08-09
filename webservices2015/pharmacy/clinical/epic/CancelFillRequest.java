
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.CancelReturnToStockMethod;


/**
 * <p>Java class for CancelFillRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelFillRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelReturnToStockMethod" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}CancelReturnToStockMethod" minOccurs="0"/>
 *         &lt;element name="CanceledDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrescriptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelFillRequest", propOrder = {
    "cancelReturnToStockMethod",
    "canceledDateTime",
    "fillId",
    "prescriptionId",
    "refundedAmount"
})
public class CancelFillRequest {

    @XmlElementRef(name = "CancelReturnToStockMethod", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<CancelReturnToStockMethod> cancelReturnToStockMethod;
    @XmlElementRef(name = "CanceledDateTime", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> canceledDateTime;
    @XmlElementRef(name = "FillId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> fillId;
    @XmlElementRef(name = "PrescriptionId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> prescriptionId;
    @XmlElementRef(name = "RefundedAmount", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<Double> refundedAmount;

    /**
     * Gets the value of the cancelReturnToStockMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CancelReturnToStockMethod }{@code >}
     *     
     */
    public JAXBElement<CancelReturnToStockMethod> getCancelReturnToStockMethod() {
        return cancelReturnToStockMethod;
    }

    /**
     * Sets the value of the cancelReturnToStockMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CancelReturnToStockMethod }{@code >}
     *     
     */
    public void setCancelReturnToStockMethod(JAXBElement<CancelReturnToStockMethod> value) {
        this.cancelReturnToStockMethod = ((JAXBElement<CancelReturnToStockMethod> ) value);
    }

    /**
     * Gets the value of the canceledDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCanceledDateTime() {
        return canceledDateTime;
    }

    /**
     * Sets the value of the canceledDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCanceledDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.canceledDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     * Gets the value of the prescriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrescriptionId() {
        return prescriptionId;
    }

    /**
     * Sets the value of the prescriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrescriptionId(JAXBElement<String> value) {
        this.prescriptionId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the refundedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRefundedAmount() {
        return refundedAmount;
    }

    /**
     * Sets the value of the refundedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRefundedAmount(JAXBElement<Double> value) {
        this.refundedAmount = ((JAXBElement<Double> ) value);
    }

}
