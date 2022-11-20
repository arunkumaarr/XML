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
import javax.xml.bind.annotation.XmlType;


/**
 * The type for providing additional data. Contains elements of information identified by a descriptive name
 * 
 * <p>Java class for AdditionalData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalItem" maxOccurs="100">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemName" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type"/>
 *                   &lt;element name="ItemContent" type="{urn:oecd:ties:stffatcatypes:v2}StringMax4000_Type"/>
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
@XmlType(name = "AdditionalData_Type", propOrder = {
    "additionalItem"
})
public class AdditionalDataType {

    @XmlElement(name = "AdditionalItem", required = true)
    protected List<AdditionalDataType.AdditionalItem> additionalItem;

    /**
     * Gets the value of the additionalItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalDataType.AdditionalItem }
     * 
     * 
     */
    public List<AdditionalDataType.AdditionalItem> getAdditionalItem() {
        if (additionalItem == null) {
            additionalItem = new ArrayList<AdditionalDataType.AdditionalItem>();
        }
        return this.additionalItem;
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
     *         &lt;element name="ItemName" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type"/>
     *         &lt;element name="ItemContent" type="{urn:oecd:ties:stffatcatypes:v2}StringMax4000_Type"/>
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
        "itemName",
        "itemContent"
    })
    public static class AdditionalItem {

        @XmlElement(name = "ItemName", required = true)
        protected String itemName;
        @XmlElement(name = "ItemContent", required = true)
        protected String itemContent;

        /**
         * Gets the value of the itemName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemName() {
            return itemName;
        }

        /**
         * Sets the value of the itemName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemName(String value) {
            this.itemName = value;
        }

        /**
         * Gets the value of the itemContent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemContent() {
            return itemContent;
        }

        /**
         * Sets the value of the itemContent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemContent(String value) {
            this.itemContent = value;
        }

    }

}
