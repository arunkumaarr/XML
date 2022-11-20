//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.20 at 11:25:32 AM IST 
//


package org.example.jaxb.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type that contains the details abouts account holder
 * 
 * <p>Java class for AccountHolder_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountHolder_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Individual" type="{urn:oecd:ties:stffatcatypes:v2}PersonParty_Type"/>
 *           &lt;sequence>
 *             &lt;element name="Organisation" type="{urn:oecd:ties:stffatcatypes:v2}OrganisationParty_Type"/>
 *             &lt;element name="AcctHolderType" type="{urn:oecd:ties:fatca:v2}FatcaAcctHolderType_EnumType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountHolder_Type", propOrder = {
    "individual",
    "organisation",
    "acctHolderType"
})
public class AccountHolderType {

    @XmlElement(name = "Individual")
    protected PersonPartyType individual;
    @XmlElement(name = "Organisation")
    protected OrganisationPartyType organisation;
    @XmlElement(name = "AcctHolderType")
    @XmlSchemaType(name = "string")
    protected FatcaAcctHolderTypeEnumType acctHolderType;

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link PersonPartyType }
     *     
     */
    public PersonPartyType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonPartyType }
     *     
     */
    public void setIndividual(PersonPartyType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationPartyType }
     *     
     */
    public OrganisationPartyType getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationPartyType }
     *     
     */
    public void setOrganisation(OrganisationPartyType value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the acctHolderType property.
     * 
     * @return
     *     possible object is
     *     {@link FatcaAcctHolderTypeEnumType }
     *     
     */
    public FatcaAcctHolderTypeEnumType getAcctHolderType() {
        return acctHolderType;
    }

    /**
     * Sets the value of the acctHolderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FatcaAcctHolderTypeEnumType }
     *     
     */
    public void setAcctHolderType(FatcaAcctHolderTypeEnumType value) {
        this.acctHolderType = value;
    }

}