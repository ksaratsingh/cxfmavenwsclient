
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.cdyne.ws;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-09T01:44:53.194+05:30
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "DelayedStockQuote",
                      portName = "DelayedStockQuoteHttpPost",
                      targetNamespace = "http://ws.cdyne.com/",
                      wsdlLocation = "file:/C:/mysoftware/eclipse_wrkspce/stockquote/src/main/resources/delayedstockquote.wsdl",
                      endpointInterface = "com.cdyne.ws.DelayedStockQuoteHttpPost")
                      
public class DelayedStockQuoteHttpPostImpl implements DelayedStockQuoteHttpPost {

    private static final Logger LOG = Logger.getLogger(DelayedStockQuoteHttpPostImpl.class.getName());

    /* (non-Javadoc)
     * @see com.cdyne.ws.DelayedStockQuoteHttpPost#getQuote(java.lang.String stockSymbol, java.lang.String licenseKey)*
     */
    public com.cdyne.ws.QuoteData getQuote(java.lang.String stockSymbol, java.lang.String licenseKey) { 
        LOG.info("Executing operation getQuote");
        System.out.println(stockSymbol);
        System.out.println(licenseKey);
        try {
            com.cdyne.ws.QuoteData _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cdyne.ws.DelayedStockQuoteHttpPost#getQuoteDataSet(java.lang.String stockSymbols, java.lang.String licenseKey)*
     */
    public com.cdyne.ws.DataSet getQuoteDataSet(java.lang.String stockSymbols, java.lang.String licenseKey) { 
        LOG.info("Executing operation getQuoteDataSet");
        System.out.println(stockSymbols);
        System.out.println(licenseKey);
        try {
            com.cdyne.ws.DataSet _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cdyne.ws.DelayedStockQuoteHttpPost#getQuickQuote(java.lang.String stockSymbol, java.lang.String licenseKey)*
     */
    public java.math.BigDecimal getQuickQuote(java.lang.String stockSymbol, java.lang.String licenseKey) { 
        LOG.info("Executing operation getQuickQuote");
        System.out.println(stockSymbol);
        System.out.println(licenseKey);
        try {
            java.math.BigDecimal _return = new java.math.BigDecimal("0");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
