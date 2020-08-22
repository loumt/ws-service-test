package cn.ws.client.handler;

import cn.ws.client.user.UserService;
import cn.ws.client.user.UserService_Service;

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Classname UserClient
 * @Created by loumt
 * @email looty_loumt@hotmail.com
 * @Description TODO
 * @Date 2020/8/22 12:25
 */
public class UserClient {

    private static final QName SERVICE_NAME = new QName("http://service.server.ws.cn", "UserService");

    private UserClient() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = UserService_Service.WSDL_LOCATION;
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

        UserService_Service ss = new UserService_Service(wsdlURL, SERVICE_NAME);
        UserService port = ss.getUserServiceImplPort();

        {
            System.out.println("Invoking sayHello...");
            String _sayHello_username = "LOUMT";
            String _sayHello__return = port.sayHello(_sayHello_username);
            System.out.println("sayHello.result=" + _sayHello__return);


        }

        System.exit(0);
    }

}
