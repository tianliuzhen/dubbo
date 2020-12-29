package com.aaa.consumer.web;

import com.aaa.consumer.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzhen.tian
 * @version 1.0 OrderController.java  2020/12/29 20:53
 */
@RestController
public class OrderController {
    @Autowired
    OrderServiceImpl orderService;

    @RequestMapping("/initOrder")
    public void initOrder(){
        orderService.initOrder("1");
    }
}
