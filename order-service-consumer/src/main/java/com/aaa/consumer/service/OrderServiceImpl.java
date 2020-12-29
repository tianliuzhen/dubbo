package com.aaa.consumer.service;


import com.aaa.commonservice.domain.UserAddress;
import com.aaa.commonservice.service.OrderService;
import com.aaa.commonservice.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 1、将服务提供者注册到注册中心（暴漏服务）
 *   1)、导入dubbo依赖、操作zookeeper依赖
 *   2)、配置服务提供者
 * 2、
 * @author liuzhen.tian
 * @version 1.0 OrderServiceImpl.java  2020/12/29 17:54
 */
@Component
public class OrderServiceImpl implements OrderService {


    // @Autowired
    @DubboReference
    UserService userService;

    @Override
    public void initOrder(String UserId) {
        List<UserAddress> userAddress = userService.getUserAddress();
        System.out.println(userAddress.toString());
    }
}
