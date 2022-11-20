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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The user must spread the data about the name of a party over up to six elements. The container element for this will be 'NameFix'. 
 * 
 * <p>Java class for NamePerson_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamePerson_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrecedingTitle" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" minOccurs="0"/>
 *         &lt;element name="Title" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FirstName">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:oecd:ties:stffatcatypes:v2>StringMax200_Type">
 *                 &lt;attribute name="xnlNameType" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MiddleName" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:oecd:ties:stffatcatypes:v2>StringMax200_Type">
 *                 &lt;attribute name="xnlNameType" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NamePrefix" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:oecd:ties:stffatcatypes:v2>StringMax200_Type">
 *                 &lt;attribute name="xnlNameType" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LastName">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:oecd:ties:stffatcatypes:v2>StringMax200_Type">
 *                 &lt;attribute name="xnlNameType" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GenerationIdentifier" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GeneralSuffix" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nameType" type="{urn:oecd:ties:stf:v4}OECDNameType_EnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamePerson_Type", namespace = "urn:oecd:ties:stffatcatypes:v2", propOrder = {
    "precedingTitle",
    "title",
    "firstName",
    "middleName",
    "namePrefix",
    "lastName",
    "generationIdentifier",
    "suffix",
    "generalSuffix"
})
public class NamePersonType {

    @XmlElement(name = "PrecedingTitle")
    protected String precedingTitle;
    @XmlElement(name = "Title")
    protected List<String> title;
    @XmlElement(name = "FirstName", required = true)
    protected NamePersonType.FirstName firstName;
    @XmlElement(name = "MiddleName")
    protected List<NamePersonType.MiddleName> middleName;
    @XmlElement(name = "NamePrefix")
    protected NamePersonType.NamePrefix namePrefix;
    @XmlElement(name = "LastName", required = true)
    protected NamePersonType.LastName lastName;
    @XmlElement(name = "GenerationIdentifier")
    protected List<String> generationIdentifier;
    @XmlElement(name = "Suffix")
    protected List<String> suffix;
    @XmlElement(name = "GeneralSuffix")
    protected String generalSuffix;
    @XmlAttribute(name = "nameType")
    protected OECDNameTypeEnumType nameType;

    /**
     * Gets the value of the precedingTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecedingTitle() {
        return precedingTitle;
    }

    /**
     * Sets the value of the precedingTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecedingTitle(String value) {
        this.precedingTitle = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTitle() {
        if (title == null) {
            title = new ArrayList<String>();
        }
        return this.title;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link NamePersonType.FirstName }
     *     
     */
    public NamePersonType.FirstName getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePersonType.FirstName }
     *     
     */
    public void setFirstName(NamePersonType.FirstName value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamePersonType.MiddleName }
     * 
     * 
     */
    public List<NamePersonType.MiddleName> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<NamePersonType.MiddleName>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link NamePersonType.NamePrefix }
     *     
     */
    public NamePersonType.NamePrefix getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePersonType.NamePrefix }
     *     
     */
    public void setNamePrefix(NamePersonType.NamePrefix value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link NamePersonType.LastName }
     *     
     */
    public NamePersonType.LastName getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePersonType.LastName }
     *     
     */
    public void setLastName(NamePersonType.LastName value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the generationIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generationIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenerationIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGenerationIdentifier() {
        if (generationIdentifier == null) {
            generationIdentifier = new ArrayList<String>();
        }
        return this.generationIdentifier;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuffix() {
        if (suffix == null) {
            suffix = new ArrayList<String>();
        }
        return this.suffix;
    }

    /**
     * Gets the value of the generalSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralSuffix() {
        return generalSuffix;
    }

    /**
     * Sets the value of the generalSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralSuffix(String value) {
        this.generalSuffix = value;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link OECDNameTypeEnumType }
     *     
     */
    public OECDNameTypeEnumType getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OECDNameTypeEnumType }
     *     
     */
    public void setNameType(OECDNameTypeEnumType value) {
        this.nameType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:oecd:ties:stffatcatypes:v2>StringMax200_Type">
     *       &lt;attribute name="xnlNameType" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FirstName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        protected String xnlNameType;

        /**
         * Defines a string with maximum length of 200
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the xnlNameType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return xnlNameType;
        }

        /**
         * Sets the value of the xnlNameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(String value) {
            this.xnlNameType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:oecd:ties:stffatcatypes:v2>StringMax200_Type">
     *       &lt;attribute name="xnlNameType" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LastName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        protected String xnlNameType;

        /**
         * Defines a string with maximum length of 200
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the xnlNameType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return xnlNameType;
        }

        /**
         * Sets the value of the xnlNameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(String value) {
            this.xnlNameType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:oecd:ties:stffatcatypes:v2>StringMax200_Type">
     *       &lt;attribute name="xnlNameType" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MiddleName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        protected String xnlNameType;

        /**
         * Defines a string with maximum length of 200
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the xnlNameType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return xnlNameType;
        }

        /**
         * Sets the value of the xnlNameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(String value) {
            this.xnlNameType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:oecd:ties:stffatcatypes:v2>StringMax200_Type">
     *       &lt;attribute name="xnlNameType" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NamePrefix {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        protected String xnlNameType;

        /**
         * Defines a string with maximum length of 200
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the xnlNameType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return xnlNameType;
        }

        /**
         * Sets the value of the xnlNameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(String value) {
            this.xnlNameType = value;
        }

    }

}
