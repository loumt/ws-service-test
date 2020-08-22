package cn.ws.server;

import cn.ws.server.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

/**
 * @Classname WsApplication
 * @Created by loumt
 * @email looty_loumt@hotmail.com
 * @Description TODO
 * @Date 2020/8/22 12:00
 */
@SpringBootApplication
public class WsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsApplication.class, args);

        //WebService发布
        System.out.println("启动并发布webservice远程服务");
        Endpoint.publish("http://127.0.0.1:18080/UserService?wsdl", new UserServiceImpl());
        System.out.println("启动并发布webservice远程服务，服务发布成功....");
    }
}
