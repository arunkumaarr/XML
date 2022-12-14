//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.20 at 11:25:32 AM IST 
//


package org.example.jaxb.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FatcaAcctPoolReportType_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FatcaAcctPoolReportType_EnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FATCA201"/>
 *     &lt;enumeration value="FATCA202"/>
 *     &lt;enumeration value="FATCA203"/>
 *     &lt;enumeration value="FATCA204"/>
 *     &lt;enumeration value="FATCA205"/>
 *     &lt;enumeration value="FATCA206"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FatcaAcctPoolReportType_EnumType")
@XmlEnum
public enum FatcaAcctPoolReportTypeEnumType {


    /**
     * Recalcitrant account holders with U.S. Indicia
     * 
     */
    @XmlEnumValue("FATCA201")
    FATCA_201("FATCA201"),

    /**
     * Recalcitrant account holders without US Indicia
     * 
     */
    @XmlEnumValue("FATCA202")
    FATCA_202("FATCA202"),

    /**
     * Dormant accounts
     * 
     */
    @XmlEnumValue("FATCA203")
    FATCA_203("FATCA203"),

    /**
     * Non-participating FFIs
     * 
     */
    @XmlEnumValue("FATCA204")
    FATCA_204("FATCA204"),

    /**
     * Recalcitrant account holders that are U.S. persons
     * 
     */
    @XmlEnumValue("FATCA205")
    FATCA_205("FATCA205"),

    /**
     * Recalcitrant account holders that are passive NFFEs
     * 
     */
    @XmlEnumValue("FATCA206")
    FATCA_206("FATCA206");
    private final String value;

    FatcaAcctPoolReportTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FatcaAcctPoolReportTypeEnumType fromValue(String v) {
        for (FatcaAcctPoolReportTypeEnumType c: FatcaAcctPoolReportTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
