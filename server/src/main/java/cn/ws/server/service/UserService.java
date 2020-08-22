package cn.ws.server.service;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @Classname UserService
 * @Created by loumt
 * @email looty_loumt@hotmail.com
 * @Description TODO
 * @Date 2020/8/22 12:00
 */
@WebService(name="UserService",targetNamespace = "http://service.server.ws.cn")
public interface UserService {
    public String sayHello(@WebParam(name = "username") String username);
}
