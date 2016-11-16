
package com.cdyne.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StockSymbols" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stockSymbols",
    "licenseKey"
})
@XmlRootElement(name = "GetQuoteDataSet")
public class GetQuoteDataSet {

    @XmlElement(name = "StockSymbols")
    protected String stockSymbols;
    @XmlElement(name = "LicenseKey")
    protected String licenseKey;

    /**
     * Gets the value of the stockSymbols property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockSymbols() {
        return stockSymbols;
    }

    /**
     * Sets the value of the stockSymbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockSymbols(String value) {
        this.stockSymbols = value;
    }

    /**
     * Gets the value of the licenseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseKey() {
        return licenseKey;
    }

    /**
     * Sets the value of the licenseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseKey(String value) {
        this.licenseKey = value;
    }

}
