//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.20 at 11:25:32 AM IST 
//


package org.example.jaxb.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This container brings together all data about an organisation as a party. Name and address are required components and each can be present more than once to enable a complete description. Whenever possible one or more identifiers (TIN, etc.) should be added as well as a residence country code. Additional data that describes and identifies the party can be given. The code for the legal type according to the OECD code list must be added. The structures of all of the sub elements are defined elsewhere in this schema.
 * 
 * <p>Java class for OrganisationParty_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationParty_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResCountryCode" type="{urn:oecd:ties:isofatcatypes:v1}CountryCode_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TIN" type="{urn:oecd:ties:stffatcatypes:v2}TIN_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:oecd:ties:stffatcatypes:v2}NameOrganisation_Type" maxOccurs="unbounded"/>
 *         &lt;element name="Address" type="{urn:oecd:ties:stffatcatypes:v2}Address_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationParty_Type", namespace = "urn:oecd:ties:stffatcatypes:v2", propOrder = {
    "resCountryCode",
    "tin",
    "name",
    "address"
})
@XmlSeeAlso({
    CorrectableReportOrganisationType.class
})
public class OrganisationPartyType {

    @XmlElement(name = "ResCountryCode")
    @XmlSchemaType(name = "string")
    protected List<CountryCodeType> resCountryCode;
    @XmlElement(name = "TIN")
    protected List<TINType> tin;
    @XmlElement(name = "Name", required = true)
    protected List<NameOrganisationType> name;
    @XmlElement(name = "Address", required = true)
    protected List<AddressType> address;

    /**
     * Gets the value of the resCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getResCountryCode() {
        if (resCountryCode == null) {
            resCountryCode = new ArrayList<CountryCodeType>();
        }
        return this.resCountryCode;
    }

    /**
     * Gets the value of the tin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TINType }
     * 
     * 
     */
    public List<TINType> getTIN() {
        if (tin == null) {
            tin = new ArrayList<TINType>();
        }
        return this.tin;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameOrganisationType }
     * 
     * 
     */
    public List<NameOrganisationType> getName() {
        if (name == null) {
            name = new ArrayList<NameOrganisationType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

}
