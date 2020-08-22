package cn.ws.server.service;

import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.Date;

/**
 * @Classname UserServiceImpl
 * @Created by loumt
 * @email looty_loumt@hotmail.com
 * @Description TODO
 * @Date 2020/8/22 12:00
 */
@WebService(serviceName = "UserService", targetNamespace = "http://service.server.ws.cn", endpointInterface = "cn.ws.server.service.UserService")
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String username) {
        return username + "，现在时间：" + "(" + new Date() + ") Hello";
    }
}
