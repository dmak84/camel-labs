package org.tempuri.calculator;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.BindingProvider;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.CXFService;
import org.apache.cxf.Bus;
import org.apache.cxf.common.logging.LogUtils;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-11-29T14:58:41.303-02:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "Calculator", 
                  wsdlLocation = "file:/home/ricferna/dev/git/stackoverflow/camel-labs/src/test/resources/wsdl/org.tempuri.calculator.wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class Calculator extends CXFService {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "Calculator");
    public final static QName CalculatorSoap12 = new QName("http://tempuri.org/", "CalculatorSoap12");
    public final static QName CalculatorSoap = new QName("http://tempuri.org/", "CalculatorSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/ricferna/dev/git/stackoverflow/camel-labs/src/test/resources/wsdl/org.tempuri.calculator.wsdl");
        } catch (MalformedURLException e) {
            LogUtils.getL7dLogger(Calculator.class)
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/ricferna/dev/git/stackoverflow/camel-labs/src/test/resources/wsdl/org.tempuri.calculator.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Calculator(Bus bus, WebServiceFeature ... features) {
        super(bus, WSDL_LOCATION, SERVICE, features);
    }

    public Calculator(Bus bus, URL wsdlLocation, WebServiceFeature ... features) {
        super(bus, wsdlLocation, SERVICE, features);
    }

    public Calculator(Bus bus, URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(bus, wsdlLocation, serviceName, features);
    }    
    
    public Calculator(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Calculator(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Calculator(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     * Proxy interface the extends CalculatorSoap to also provide useful methods
     * without having to cast to the appropriate interface. 
     */
    public interface CalculatorSoapProxy extends CalculatorSoap, AutoCloseable, BindingProvider, Client {
    }



    /**
     *
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap12")
    public CalculatorSoapProxy getCalculatorSoap12() {
        return super.getPort(CalculatorSoap12, CalculatorSoapProxy.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap12")
    public CalculatorSoapProxy getCalculatorSoap12(WebServiceFeature... features) {
        return super.getPort(CalculatorSoap12, CalculatorSoapProxy.class, features);
    }


    /**
     *
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap")
    public CalculatorSoapProxy getCalculatorSoap() {
        return super.getPort(CalculatorSoap, CalculatorSoapProxy.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap")
    public CalculatorSoapProxy getCalculatorSoap(WebServiceFeature... features) {
        return super.getPort(CalculatorSoap, CalculatorSoapProxy.class, features);
    }

}
