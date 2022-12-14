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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This container brings together all data about a person as a party. Name and address are required components and each can be present more than once to enable as complete a description as possible. Whenever possible one or more identifiers (TIN etc) should be added as well as a residence country code. Additional data that describes and identifies the party can be given. The code for the legal type according to the OECD code list must be added. The structures of all of the sub elements are defined elsewhere in this schema.
 * 
 * <p>Java class for PersonParty_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonParty_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResCountryCode" type="{urn:oecd:ties:isofatcatypes:v1}CountryCode_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TIN" type="{urn:oecd:ties:stffatcatypes:v2}TIN_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:oecd:ties:stffatcatypes:v2}NamePerson_Type" maxOccurs="unbounded"/>
 *         &lt;element name="Address" type="{urn:oecd:ties:stffatcatypes:v2}Address_Type" maxOccurs="unbounded"/>
 *         &lt;element name="Nationality" type="{urn:oecd:ties:isofatcatypes:v1}CountryCode_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BirthInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="City" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" minOccurs="0"/>
 *                   &lt;element name="CitySubentity" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" minOccurs="0"/>
 *                   &lt;element name="CountryInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="CountryCode" type="{urn:oecd:ties:isofatcatypes:v1}CountryCode_Type"/>
 *                             &lt;element name="FormerCountryName" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonParty_Type", namespace = "urn:oecd:ties:stffatcatypes:v2", propOrder = {
    "resCountryCode",
    "tin",
    "name",
    "address",
    "nationality",
    "birthInfo"
})
public class PersonPartyType {

    @XmlElement(name = "ResCountryCode")
    @XmlSchemaType(name = "string")
    protected List<CountryCodeType> resCountryCode;
    @XmlElement(name = "TIN")
    protected List<TINType> tin;
    @XmlElement(name = "Name", required = true)
    protected List<NamePersonType> name;
    @XmlElement(name = "Address", required = true)
    protected List<AddressType> address;
    @XmlElement(name = "Nationality")
    @XmlSchemaType(name = "string")
    protected List<CountryCodeType> nationality;
    @XmlElement(name = "BirthInfo")
    protected PersonPartyType.BirthInfo birthInfo;

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
     * {@link NamePersonType }
     * 
     * 
     */
    public List<NamePersonType> getName() {
        if (name == null) {
            name = new ArrayList<NamePersonType>();
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

    /**
     * Gets the value of the nationality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getNationality() {
        if (nationality == null) {
            nationality = new ArrayList<CountryCodeType>();
        }
        return this.nationality;
    }

    /**
     * Gets the value of the birthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonPartyType.BirthInfo }
     *     
     */
    public PersonPartyType.BirthInfo getBirthInfo() {
        return birthInfo;
    }

    /**
     * Sets the value of the birthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonPartyType.BirthInfo }
     *     
     */
    public void setBirthInfo(PersonPartyType.BirthInfo value) {
        this.birthInfo = value;
    }


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
     *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="City" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" minOccurs="0"/>
     *         &lt;element name="CitySubentity" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" minOccurs="0"/>
     *         &lt;element name="CountryInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="CountryCode" type="{urn:oecd:ties:isofatcatypes:v1}CountryCode_Type"/>
     *                   &lt;element name="FormerCountryName" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "birthDate",
        "city",
        "citySubentity",
        "countryInfo"
    })
    public static class BirthInfo {

        @XmlElement(name = "BirthDate", namespace = "urn:oecd:ties:stffatcatypes:v2")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        @XmlElement(name = "City", namespace = "urn:oecd:ties:stffatcatypes:v2")
        protected String city;
        @XmlElement(name = "CitySubentity", namespace = "urn:oecd:ties:stffatcatypes:v2")
        protected String citySubentity;
        @XmlElement(name = "CountryInfo", namespace = "urn:oecd:ties:stffatcatypes:v2")
        protected PersonPartyType.BirthInfo.CountryInfo countryInfo;

        /**
         * Gets the value of the birthDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the citySubentity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitySubentity() {
            return citySubentity;
        }

        /**
         * Sets the value of the citySubentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCitySubentity(String value) {
            this.citySubentity = value;
        }

        /**
         * Gets the value of the countryInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PersonPartyType.BirthInfo.CountryInfo }
         *     
         */
        public PersonPartyType.BirthInfo.CountryInfo getCountryInfo() {
            return countryInfo;
        }

        /**
         * Sets the value of the countryInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonPartyType.BirthInfo.CountryInfo }
         *     
         */
        public void setCountryInfo(PersonPartyType.BirthInfo.CountryInfo value) {
            this.countryInfo = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="CountryCode" type="{urn:oecd:ties:isofatcatypes:v1}CountryCode_Type"/>
         *         &lt;element name="FormerCountryName" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "countryCode",
            "formerCountryName"
        })
        public static class CountryInfo {

            @XmlElement(name = "CountryCode", namespace = "urn:oecd:ties:stffatcatypes:v2")
            @XmlSchemaType(name = "string")
            protected CountryCodeType countryCode;
            @XmlElement(name = "FormerCountryName", namespace = "urn:oecd:ties:stffatcatypes:v2")
            protected String formerCountryName;

            /**
             * Gets the value of the countryCode property.
             * 
             * @return
             *     possible object is
             *     {@link CountryCodeType }
             *     
             */
            public CountryCodeType getCountryCode() {
                return countryCode;
            }

            /**
             * Sets the value of the countryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CountryCodeType }
             *     
             */
            public void setCountryCode(CountryCodeType value) {
                this.countryCode = value;
            }

            /**
             * Gets the value of the formerCountryName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormerCountryName() {
                return formerCountryName;
            }

            /**
             * Sets the value of the formerCountryName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormerCountryName(String value) {
                this.formerCountryName = value;
            }

        }

    }

}
