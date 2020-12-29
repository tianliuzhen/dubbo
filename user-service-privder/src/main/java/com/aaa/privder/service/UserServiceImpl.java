package com.aaa.privder.service;


import com.aaa.commonservice.domain.UserAddress;
import com.aaa.commonservice.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author liuzhen.tian
 * @version 1.0 UserServiceImpl.java  2020/12/29 17:45
 */
@DubboService
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddress() {

        UserAddress userAddress = new UserAddress("张三", "110", "杭州");
        UserAddress userAddress1 = new UserAddress("李四", "120", "湖州");
        return Arrays.asList(userAddress, userAddress1);
    }
}
