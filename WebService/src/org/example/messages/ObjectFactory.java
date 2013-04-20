
package org.example.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.messages package. 
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

    private final static QName _CheckSpellcheckRequest_QNAME = new QName("http://www.example.org/messages", "checkSpellcheckRequest");
    private final static QName _CheckSpellcheckResponse_QNAME = new QName("http://www.example.org/messages", "checkSpellcheckResponse");
    private final static QName _CheckSpellcheckFault_QNAME = new QName("http://www.example.org/messages", "checkSpellcheckFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.messages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckSpellcheckFaultType }
     * 
     */
    public CheckSpellcheckFaultType createCheckSpellcheckFaultType() {
        return new CheckSpellcheckFaultType();
    }

    /**
     * Create an instance of {@link CheckSpellcheckResponseType }
     * 
     */
    public CheckSpellcheckResponseType createCheckSpellcheckResponseType() {
        return new CheckSpellcheckResponseType();
    }

    /**
     * Create an instance of {@link CheckSpellcheckRequestType }
     * 
     */
    public CheckSpellcheckRequestType createCheckSpellcheckRequestType() {
        return new CheckSpellcheckRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSpellcheckRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/messages", name = "checkSpellcheckRequest")
    public JAXBElement<CheckSpellcheckRequestType> createCheckSpellcheckRequest(CheckSpellcheckRequestType value) {
        return new JAXBElement<CheckSpellcheckRequestType>(_CheckSpellcheckRequest_QNAME, CheckSpellcheckRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSpellcheckResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/messages", name = "checkSpellcheckResponse")
    public JAXBElement<CheckSpellcheckResponseType> createCheckSpellcheckResponse(CheckSpellcheckResponseType value) {
        return new JAXBElement<CheckSpellcheckResponseType>(_CheckSpellcheckResponse_QNAME, CheckSpellcheckResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSpellcheckFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/messages", name = "checkSpellcheckFault")
    public JAXBElement<CheckSpellcheckFaultType> createCheckSpellcheckFault(CheckSpellcheckFaultType value) {
        return new JAXBElement<CheckSpellcheckFaultType>(_CheckSpellcheckFault_QNAME, CheckSpellcheckFaultType.class, null, value);
    }

}
