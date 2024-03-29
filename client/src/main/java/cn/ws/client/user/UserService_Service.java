package cn.ws.client.user;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.7
 * 2020-08-22T12:15:06.066+08:00
 * Generated source version: 3.3.7
 *
 */
@WebServiceClient(name = "UserService",
                  wsdlLocation = "http://127.0.0.1:18080/UserService?wsdl",
                  targetNamespace = "http://service.server.ws.cn")
public class UserService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.server.ws.cn", "UserService");
    public final static QName UserServiceImplPort = new QName("http://service.server.ws.cn", "UserServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:18080/UserService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UserService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:18080/UserService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UserService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public UserService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UserService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UserService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServiceImplPort")
    public UserService getUserServiceImplPort() {
        return super.getPort(UserServiceImplPort, UserService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServiceImplPort")
    public UserService getUserServiceImplPort(WebServiceFeature... features) {
        return super.getPort(UserServiceImplPort, UserService.class, features);
    }

}
