package com.aaa.privder.web;

import com.aaa.privder.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzhen.tian
 * @version 1.0 OrderController.java  2020/12/29 20:53
 */
@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/initUser")
    public void initOrder(){
        System.out.println(userService.getUserAddress());
    }
}
