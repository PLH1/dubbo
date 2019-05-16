package com.funtl.hellodubboserviceuserconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.funtl.hello.dubbo.service.user.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @describe:
 * @outhor 潘立欢
 * @create 2019-05-16 13:26
 */
@RestController
public class UserController {
    @Reference(version = "${demo.service.version}",application="dubbo.application.id",url = "dubbo://127.0.0.1:12345")
    private UserService userService;
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(){
        return userService.sayHi();
    }
}
