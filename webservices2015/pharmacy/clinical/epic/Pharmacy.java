
package webservices2015.pharmacy.clinical.epic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.epic_clinical_pharmacy.ArrayOfDeliveryMethod;


/**
 * <p>Java class for Pharmacy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pharmacy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableDeliveryMethods" type="{http://schemas.datacontract.org/2004/07/Epic.Clinical.Pharmacy.WebServices2015}ArrayOfDeliveryMethod" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EarliestAvailablePickupFromNow" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsIntegrated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NCPDPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZIPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pharmacy", propOrder = {
    "availableDeliveryMethods",
    "city",
    "country",
    "countryAbbreviation",
    "county",
    "displayName",
    "earliestAvailablePickupFromNow",
    "id",
    "isIntegrated",
    "ncpdpId",
    "phoneNumber",
    "state",
    "stateAbbreviation",
    "streetAddress",
    "zipCode"
})
public class Pharmacy {

    @XmlElementRef(name = "AvailableDeliveryMethods", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDeliveryMethod> availableDeliveryMethods;
    @XmlElementRef(name = "City", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "Country", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "CountryAbbreviation", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> countryAbbreviation;
    @XmlElementRef(name = "County", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> county;
    @XmlElementRef(name = "DisplayName", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "EarliestAvailablePickupFromNow", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> earliestAvailablePickupFromNow;
    @XmlElementRef(name = "Id", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> id;
    @XmlElement(name = "IsIntegrated")
    protected Boolean isIntegrated;
    @XmlElementRef(name = "NCPDPId", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> ncpdpId;
    @XmlElementRef(name = "PhoneNumber", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "State", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "StateAbbreviation", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> stateAbbreviation;
    @XmlElementRef(name = "StreetAddress", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> streetAddress;
    @XmlElementRef(name = "ZIPCode", namespace = "Epic.Clinical.Pharmacy.WebServices2015", type = JAXBElement.class)
    protected JAXBElement<String> zipCode;

    /**
     * Gets the value of the availableDeliveryMethods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDeliveryMethod }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDeliveryMethod> getAvailableDeliveryMethods() {
        return availableDeliveryMethods;
    }

    /**
     * Sets the value of the availableDeliveryMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDeliveryMethod }{@code >}
     *     
     */
    public void setAvailableDeliveryMethods(JAXBElement<ArrayOfDeliveryMethod> value) {
        this.availableDeliveryMethods = ((JAXBElement<ArrayOfDeliveryMethod> ) value);
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the countryAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryAbbreviation() {
        return countryAbbreviation;
    }

    /**
     * Sets the value of the countryAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryAbbreviation(JAXBElement<String> value) {
        this.countryAbbreviation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounty(JAXBElement<String> value) {
        this.county = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the earliestAvailablePickupFromNow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEarliestAvailablePickupFromNow() {
        return earliestAvailablePickupFromNow;
    }

    /**
     * Sets the value of the earliestAvailablePickupFromNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEarliestAvailablePickupFromNow(JAXBElement<XMLGregorianCalendar> value) {
        this.earliestAvailablePickupFromNow = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the isIntegrated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIntegrated() {
        return isIntegrated;
    }

    /**
     * Sets the value of the isIntegrated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntegrated(Boolean value) {
        this.isIntegrated = value;
    }

    /**
     * Gets the value of the ncpdpId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNCPDPId() {
        return ncpdpId;
    }

    /**
     * Sets the value of the ncpdpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNCPDPId(JAXBElement<String> value) {
        this.ncpdpId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stateAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateAbbreviation() {
        return stateAbbreviation;
    }

    /**
     * Sets the value of the stateAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateAbbreviation(JAXBElement<String> value) {
        this.stateAbbreviation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreetAddress(JAXBElement<String> value) {
        this.streetAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZIPCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZIPCode(JAXBElement<String> value) {
        this.zipCode = ((JAXBElement<String> ) value);
    }

}
