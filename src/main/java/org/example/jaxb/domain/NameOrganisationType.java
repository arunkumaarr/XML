//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.20 at 11:25:32 AM IST 
//


package org.example.jaxb.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Name of organisation
 * 
 * <p>Java class for NameOrganisation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameOrganisation_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:oecd:ties:stffatcatypes:v2>StringMax200_Type">
 *       &lt;attribute name="nameType" type="{urn:oecd:ties:stf:v4}OECDNameType_EnumType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameOrganisation_Type", namespace = "urn:oecd:ties:stffatcatypes:v2", propOrder = {
    "value"
})
public class NameOrganisationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "nameType")
    protected OECDNameTypeEnumType nameType;

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

}
