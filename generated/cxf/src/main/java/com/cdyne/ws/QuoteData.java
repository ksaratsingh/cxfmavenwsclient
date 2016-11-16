
package com.cdyne.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QuoteData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StockSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastTradeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LastTradeDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="StockChange" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OpenAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DayHigh" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DayLow" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="StockVolume" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PrevCls" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ChangePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FiftyTwoWeekRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EarnPerShare" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteData", propOrder = {
    "stockSymbol",
    "lastTradeAmount",
    "lastTradeDateTime",
    "stockChange",
    "openAmount",
    "dayHigh",
    "dayLow",
    "stockVolume",
    "prevCls",
    "changePercent",
    "fiftyTwoWeekRange",
    "earnPerShare",
    "pe",
    "companyName",
    "quoteError"
})
public class QuoteData {

    @XmlElement(name = "StockSymbol")
    protected String stockSymbol;
    @XmlElement(name = "LastTradeAmount", required = true)
    protected BigDecimal lastTradeAmount;
    @XmlElement(name = "LastTradeDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTradeDateTime;
    @XmlElement(name = "StockChange", required = true)
    protected BigDecimal stockChange;
    @XmlElement(name = "OpenAmount", required = true)
    protected BigDecimal openAmount;
    @XmlElement(name = "DayHigh", required = true)
    protected BigDecimal dayHigh;
    @XmlElement(name = "DayLow", required = true)
    protected BigDecimal dayLow;
    @XmlElement(name = "StockVolume")
    protected int stockVolume;
    @XmlElement(name = "PrevCls", required = true)
    protected BigDecimal prevCls;
    @XmlElement(name = "ChangePercent")
    protected String changePercent;
    @XmlElement(name = "FiftyTwoWeekRange")
    protected String fiftyTwoWeekRange;
    @XmlElement(name = "EarnPerShare", required = true)
    protected BigDecimal earnPerShare;
    @XmlElement(name = "PE", required = true)
    protected BigDecimal pe;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "QuoteError")
    protected boolean quoteError;

    /**
     * Gets the value of the stockSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     * Sets the value of the stockSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockSymbol(String value) {
        this.stockSymbol = value;
    }

    /**
     * Gets the value of the lastTradeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastTradeAmount() {
        return lastTradeAmount;
    }

    /**
     * Sets the value of the lastTradeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastTradeAmount(BigDecimal value) {
        this.lastTradeAmount = value;
    }

    /**
     * Gets the value of the lastTradeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTradeDateTime() {
        return lastTradeDateTime;
    }

    /**
     * Sets the value of the lastTradeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTradeDateTime(XMLGregorianCalendar value) {
        this.lastTradeDateTime = value;
    }

    /**
     * Gets the value of the stockChange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStockChange() {
        return stockChange;
    }

    /**
     * Sets the value of the stockChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStockChange(BigDecimal value) {
        this.stockChange = value;
    }

    /**
     * Gets the value of the openAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenAmount() {
        return openAmount;
    }

    /**
     * Sets the value of the openAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenAmount(BigDecimal value) {
        this.openAmount = value;
    }

    /**
     * Gets the value of the dayHigh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayHigh() {
        return dayHigh;
    }

    /**
     * Sets the value of the dayHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayHigh(BigDecimal value) {
        this.dayHigh = value;
    }

    /**
     * Gets the value of the dayLow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayLow() {
        return dayLow;
    }

    /**
     * Sets the value of the dayLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayLow(BigDecimal value) {
        this.dayLow = value;
    }

    /**
     * Gets the value of the stockVolume property.
     * 
     */
    public int getStockVolume() {
        return stockVolume;
    }

    /**
     * Sets the value of the stockVolume property.
     * 
     */
    public void setStockVolume(int value) {
        this.stockVolume = value;
    }

    /**
     * Gets the value of the prevCls property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrevCls() {
        return prevCls;
    }

    /**
     * Sets the value of the prevCls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrevCls(BigDecimal value) {
        this.prevCls = value;
    }

    /**
     * Gets the value of the changePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangePercent() {
        return changePercent;
    }

    /**
     * Sets the value of the changePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangePercent(String value) {
        this.changePercent = value;
    }

    /**
     * Gets the value of the fiftyTwoWeekRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiftyTwoWeekRange() {
        return fiftyTwoWeekRange;
    }

    /**
     * Sets the value of the fiftyTwoWeekRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiftyTwoWeekRange(String value) {
        this.fiftyTwoWeekRange = value;
    }

    /**
     * Gets the value of the earnPerShare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEarnPerShare() {
        return earnPerShare;
    }

    /**
     * Sets the value of the earnPerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEarnPerShare(BigDecimal value) {
        this.earnPerShare = value;
    }

    /**
     * Gets the value of the pe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPE() {
        return pe;
    }

    /**
     * Sets the value of the pe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPE(BigDecimal value) {
        this.pe = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the quoteError property.
     * 
     */
    public boolean isQuoteError() {
        return quoteError;
    }

    /**
     * Sets the value of the quoteError property.
     * 
     */
    public void setQuoteError(boolean value) {
        this.quoteError = value;
    }

}
