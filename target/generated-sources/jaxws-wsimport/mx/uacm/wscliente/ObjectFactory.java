
package mx.uacm.wscliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.uacm.wscliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NumerosPrimos_QNAME = new QName("http://ws.uacm.mx/", "numerosPrimos");
    private final static QName _NumerosPrimosResponse_QNAME = new QName("http://ws.uacm.mx/", "numerosPrimosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.uacm.wscliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NumerosPrimosResponse }
     * 
     */
    public NumerosPrimosResponse createNumerosPrimosResponse() {
        return new NumerosPrimosResponse();
    }

    /**
     * Create an instance of {@link NumerosPrimos }
     * 
     */
    public NumerosPrimos createNumerosPrimos() {
        return new NumerosPrimos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumerosPrimos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.uacm.mx/", name = "numerosPrimos")
    public JAXBElement<NumerosPrimos> createNumerosPrimos(NumerosPrimos value) {
        return new JAXBElement<NumerosPrimos>(_NumerosPrimos_QNAME, NumerosPrimos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumerosPrimosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.uacm.mx/", name = "numerosPrimosResponse")
    public JAXBElement<NumerosPrimosResponse> createNumerosPrimosResponse(NumerosPrimosResponse value) {
        return new JAXBElement<NumerosPrimosResponse>(_NumerosPrimosResponse_QNAME, NumerosPrimosResponse.class, null, value);
    }

}
