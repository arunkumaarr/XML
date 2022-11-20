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
import javax.xml.bind.annotation.XmlType;


/**
 * Type for CAR reference. Contains identifying information for Competent Authority Request. Required when account report is sent as a response to a Competent Authority Request (CAR). Used to associate the response to Competent Authority Request to a pooled report.
 * 
 * <p>Java class for CARRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CARRef_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PoolReportReportingFIGIIN" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type"/>
 *         &lt;element name="PoolReportMessageRefId" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type"/>
 *         &lt;element name="PoolReportDocRefId" type="{urn:oecd:ties:stffatcatypes:v2}StringMax200_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CARRef_Type", propOrder = {
    "poolReportReportingFIGIIN",
    "poolReportMessageRefId",
    "poolReportDocRefId"
})
public class CARRefType {

    @XmlElement(name = "PoolReportReportingFIGIIN", required = true)
    protected String poolReportReportingFIGIIN;
    @XmlElement(name = "PoolReportMessageRefId", required = true)
    protected String poolReportMessageRefId;
    @XmlElement(name = "PoolReportDocRefId", required = true)
    protected String poolReportDocRefId;

    /**
     * Gets the value of the poolReportReportingFIGIIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolReportReportingFIGIIN() {
        return poolReportReportingFIGIIN;
    }

    /**
     * Sets the value of the poolReportReportingFIGIIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolReportReportingFIGIIN(String value) {
        this.poolReportReportingFIGIIN = value;
    }

    /**
     * Gets the value of the poolReportMessageRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolReportMessageRefId() {
        return poolReportMessageRefId;
    }

    /**
     * Sets the value of the poolReportMessageRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolReportMessageRefId(String value) {
        this.poolReportMessageRefId = value;
    }

    /**
     * Gets the value of the poolReportDocRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolReportDocRefId() {
        return poolReportDocRefId;
    }

    /**
     * Sets the value of the poolReportDocRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolReportDocRefId(String value) {
        this.poolReportDocRefId = value;
    }

}
