
package br.com.webservice.soa.client.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.webservice.soa.client.wsdl package. 
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

    private final static QName _GetAllUsersResponse_QNAME = new QName("http://infra.soa.webservice.com.br/", "getAllUsersResponse");
    private final static QName _GetUserFromEmailResponse_QNAME = new QName("http://infra.soa.webservice.com.br/", "getUserFromEmailResponse");
    private final static QName _SayHelloToUser_QNAME = new QName("http://infra.soa.webservice.com.br/", "sayHelloToUser");
    private final static QName _SayHello_QNAME = new QName("http://infra.soa.webservice.com.br/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://infra.soa.webservice.com.br/", "sayHelloResponse");
    private final static QName _SayHelloToUserResponse_QNAME = new QName("http://infra.soa.webservice.com.br/", "sayHelloToUserResponse");
    private final static QName _GetAllUsers_QNAME = new QName("http://infra.soa.webservice.com.br/", "getAllUsers");
    private final static QName _SayHelloToResponse_QNAME = new QName("http://infra.soa.webservice.com.br/", "sayHelloToResponse");
    private final static QName _GetUserFromEmail_QNAME = new QName("http://infra.soa.webservice.com.br/", "getUserFromEmail");
    private final static QName _SayHelloTo_QNAME = new QName("http://infra.soa.webservice.com.br/", "sayHelloTo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.webservice.soa.client.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHelloToUserResponse }
     * 
     */
    public SayHelloToUserResponse createSayHelloToUserResponse() {
        return new SayHelloToUserResponse();
    }

    /**
     * Create an instance of {@link GetUserFromEmail }
     * 
     */
    public GetUserFromEmail createGetUserFromEmail() {
        return new GetUserFromEmail();
    }

    /**
     * Create an instance of {@link SayHelloToResponse }
     * 
     */
    public SayHelloToResponse createSayHelloToResponse() {
        return new SayHelloToResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHelloTo }
     * 
     */
    public SayHelloTo createSayHelloTo() {
        return new SayHelloTo();
    }

    /**
     * Create an instance of {@link SayHelloToUser }
     * 
     */
    public SayHelloToUser createSayHelloToUser() {
        return new SayHelloToUser();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link GetUserFromEmailResponse }
     * 
     */
    public GetUserFromEmailResponse createGetUserFromEmailResponse() {
        return new GetUserFromEmailResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infra.soa.webservice.com.br/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserFromEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infra.soa.webservice.com.br/", name = "getUserFromEmailResponse")
    public JAXBElement<GetUserFromEmailResponse> createGetUserFromEmailResponse(GetUserFromEmailResponse value) {
        return new JAXBElement<GetUserFromEmailResponse>(_GetUserFromEmailResponse_QNAME, GetUserFromEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloToUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infra.soa.webservice.com.br/", name = "sayHelloToUser")
    public JAXBElement<SayHelloToUser> createSayHelloToUser(SayHelloToUser value) {
        return new JAXBElement<SayHelloToUser>(_SayHelloToUser_QNAME, SayHelloToUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infra.soa.webservice.com.br/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infra.soa.webservice.com.br/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloToUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infra.soa.webservice.com.br/", name = "sayHelloToUserResponse")
    public JAXBElement<SayHelloToUserResponse> createSayHelloToUserResponse(SayHelloToUserResponse value) {
        return new JAXBElement<SayHelloToUserResponse>(_SayHelloToUserResponse_QNAME, SayHelloToUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infra.soa.webservice.com.br/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloToResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infra.soa.webservice.com.br/", name = "sayHelloToResponse")
    public JAXBElement<SayHelloToResponse> createSayHelloToResponse(SayHelloToResponse value) {
        return new JAXBElement<SayHelloToResponse>(_SayHelloToResponse_QNAME, SayHelloToResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserFromEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infra.soa.webservice.com.br/", name = "getUserFromEmail")
    public JAXBElement<GetUserFromEmail> createGetUserFromEmail(GetUserFromEmail value) {
        return new JAXBElement<GetUserFromEmail>(_GetUserFromEmail_QNAME, GetUserFromEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infra.soa.webservice.com.br/", name = "sayHelloTo")
    public JAXBElement<SayHelloTo> createSayHelloTo(SayHelloTo value) {
        return new JAXBElement<SayHelloTo>(_SayHelloTo_QNAME, SayHelloTo.class, null, value);
    }

}
