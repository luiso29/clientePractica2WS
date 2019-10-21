
package mx.uacm.wscliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NumerosPrimosWS", targetNamespace = "http://ws.uacm.mx/", wsdlLocation = "http://localhost:8080/practica2/numeros?wsdl")
public class NumerosPrimosWS_Service
    extends Service
{

    private final static URL NUMEROSPRIMOSWS_WSDL_LOCATION;
    private final static WebServiceException NUMEROSPRIMOSWS_EXCEPTION;
    private final static QName NUMEROSPRIMOSWS_QNAME = new QName("http://ws.uacm.mx/", "NumerosPrimosWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/practica2/numeros?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NUMEROSPRIMOSWS_WSDL_LOCATION = url;
        NUMEROSPRIMOSWS_EXCEPTION = e;
    }

    public NumerosPrimosWS_Service() {
        super(__getWsdlLocation(), NUMEROSPRIMOSWS_QNAME);
    }

    public NumerosPrimosWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NUMEROSPRIMOSWS_QNAME, features);
    }

    public NumerosPrimosWS_Service(URL wsdlLocation) {
        super(wsdlLocation, NUMEROSPRIMOSWS_QNAME);
    }

    public NumerosPrimosWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NUMEROSPRIMOSWS_QNAME, features);
    }

    public NumerosPrimosWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NumerosPrimosWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NumerosPrimosWS
     */
    @WebEndpoint(name = "NumerosPrimosWSPort")
    public NumerosPrimosWS getNumerosPrimosWSPort() {
        return super.getPort(new QName("http://ws.uacm.mx/", "NumerosPrimosWSPort"), NumerosPrimosWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NumerosPrimosWS
     */
    @WebEndpoint(name = "NumerosPrimosWSPort")
    public NumerosPrimosWS getNumerosPrimosWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.uacm.mx/", "NumerosPrimosWSPort"), NumerosPrimosWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NUMEROSPRIMOSWS_EXCEPTION!= null) {
            throw NUMEROSPRIMOSWS_EXCEPTION;
        }
        return NUMEROSPRIMOSWS_WSDL_LOCATION;
    }

}
