
package gb.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gb.service package. 
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

    private final static QName _DeleteResponse_QNAME = new QName("http://service.gb/", "deleteResponse");
    private final static QName _FindByIdWS_QNAME = new QName("http://service.gb/", "findByIdWS");
    private final static QName _FindByIdWSResponse_QNAME = new QName("http://service.gb/", "findByIdWSResponse");
    private final static QName _Delete_QNAME = new QName("http://service.gb/", "delete");
    private final static QName _FindAll_QNAME = new QName("http://service.gb/", "findAll");
    private final static QName _InsertResponse_QNAME = new QName("http://service.gb/", "insertResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.gb/", "updateResponse");
    private final static QName _Insert_QNAME = new QName("http://service.gb/", "insert");
    private final static QName _Update_QNAME = new QName("http://service.gb/", "update");
    private final static QName _FindAllResponse_QNAME = new QName("http://service.gb/", "findAllResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gb.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindByIdWS }
     * 
     */
    public FindByIdWS createFindByIdWS() {
        return new FindByIdWS();
    }

    /**
     * Create an instance of {@link FindByIdWSResponse }
     * 
     */
    public FindByIdWSResponse createFindByIdWSResponse() {
        return new FindByIdWSResponse();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link ProductRepr }
     * 
     */
    public ProductRepr createProductRepr() {
        return new ProductRepr();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gb/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gb/", name = "findByIdWS")
    public JAXBElement<FindByIdWS> createFindByIdWS(FindByIdWS value) {
        return new JAXBElement<FindByIdWS>(_FindByIdWS_QNAME, FindByIdWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gb/", name = "findByIdWSResponse")
    public JAXBElement<FindByIdWSResponse> createFindByIdWSResponse(FindByIdWSResponse value) {
        return new JAXBElement<FindByIdWSResponse>(_FindByIdWSResponse_QNAME, FindByIdWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gb/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gb/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gb/", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gb/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gb/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gb/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gb/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

}
