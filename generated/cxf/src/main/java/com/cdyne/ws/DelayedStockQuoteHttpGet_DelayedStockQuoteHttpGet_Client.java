
package com.cdyne.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-09T01:44:53.094+05:30
 * Generated source version: 3.1.7
 * 
 */
public final class DelayedStockQuoteHttpGet_DelayedStockQuoteHttpGet_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.cdyne.com/", "DelayedStockQuote");

    private DelayedStockQuoteHttpGet_DelayedStockQuoteHttpGet_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DelayedStockQuote.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DelayedStockQuote ss = new DelayedStockQuote(wsdlURL, SERVICE_NAME);
        DelayedStockQuoteHttpGet port = ss.getDelayedStockQuoteHttpGet();  
        
        {
        System.out.println("Invoking getQuote...");
        java.lang.String _getQuote_stockSymbol = "";
        java.lang.String _getQuote_licenseKey = "";
        com.cdyne.ws.QuoteData _getQuote__return = port.getQuote(_getQuote_stockSymbol, _getQuote_licenseKey);
        System.out.println("getQuote.result=" + _getQuote__return);


        }
        {
        System.out.println("Invoking getQuoteDataSet...");
        java.lang.String _getQuoteDataSet_stockSymbols = "";
        java.lang.String _getQuoteDataSet_licenseKey = "";
        com.cdyne.ws.DataSet _getQuoteDataSet__return = port.getQuoteDataSet(_getQuoteDataSet_stockSymbols, _getQuoteDataSet_licenseKey);
        System.out.println("getQuoteDataSet.result=" + _getQuoteDataSet__return);


        }
        {
        System.out.println("Invoking getQuickQuote...");
        java.lang.String _getQuickQuote_stockSymbol = "";
        java.lang.String _getQuickQuote_licenseKey = "";
        java.math.BigDecimal _getQuickQuote__return = port.getQuickQuote(_getQuickQuote_stockSymbol, _getQuickQuote_licenseKey);
        System.out.println("getQuickQuote.result=" + _getQuickQuote__return);


        }

        System.exit(0);
    }

}
