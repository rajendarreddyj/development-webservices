
package org.example.contactwsdlfile;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ContactWSDLFile", targetNamespace = "http://www.example.org/ContactWSDLFile/", wsdlLocation = "file:/apps/sourceCode/git/rajendarreddyj/development-java/webservices-projects/axis1projects/axis1wsdl/src/main/schemas/ContactWSDLFile.wsdl")
public class ContactWSDLFile_Service
    extends Service
{

    private final static URL CONTACTWSDLFILE_WSDL_LOCATION;
    private final static WebServiceException CONTACTWSDLFILE_EXCEPTION;
    private final static QName CONTACTWSDLFILE_QNAME = new QName("http://www.example.org/ContactWSDLFile/", "ContactWSDLFile");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/apps/sourceCode/git/rajendarreddyj/development-java/webservices-projects/axis1projects/axis1wsdl/src/main/schemas/ContactWSDLFile.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONTACTWSDLFILE_WSDL_LOCATION = url;
        CONTACTWSDLFILE_EXCEPTION = e;
    }

    public ContactWSDLFile_Service() {
        super(__getWsdlLocation(), CONTACTWSDLFILE_QNAME);
    }

    public ContactWSDLFile_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONTACTWSDLFILE_QNAME, features);
    }

    public ContactWSDLFile_Service(URL wsdlLocation) {
        super(wsdlLocation, CONTACTWSDLFILE_QNAME);
    }

    public ContactWSDLFile_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONTACTWSDLFILE_QNAME, features);
    }

    public ContactWSDLFile_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ContactWSDLFile_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ContactWSDLFile
     */
    @WebEndpoint(name = "ContactWSDLFileSOAP")
    public ContactWSDLFile getContactWSDLFileSOAP() {
        return super.getPort(new QName("http://www.example.org/ContactWSDLFile/", "ContactWSDLFileSOAP"), ContactWSDLFile.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContactWSDLFile
     */
    @WebEndpoint(name = "ContactWSDLFileSOAP")
    public ContactWSDLFile getContactWSDLFileSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.example.org/ContactWSDLFile/", "ContactWSDLFileSOAP"), ContactWSDLFile.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONTACTWSDLFILE_EXCEPTION!= null) {
            throw CONTACTWSDLFILE_EXCEPTION;
        }
        return CONTACTWSDLFILE_WSDL_LOCATION;
    }

}
