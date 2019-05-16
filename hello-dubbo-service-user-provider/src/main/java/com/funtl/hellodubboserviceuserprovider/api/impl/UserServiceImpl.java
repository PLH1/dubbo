package com.funtl.hellodubboserviceuserprovider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.funtl.hello.dubbo.service.user.api.UserService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @describe:
 * @outhor 潘立欢
 * @create 2019-05-15 16:03
 */
/**/
@Service(version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}")
public class UserServiceImpl implements UserService {


    @Value("${dubbo.protocol.port}")
    private String port;
    @Override
    public String sayHi() {
        return "hello dubbo,i am from prot:"+port;
    }
}
