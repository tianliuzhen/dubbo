package com.aaa.commonservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author liuzhen.tian
 * @version 1.0 UserAddress.java  2020/12/29 17:43
 */
@Data
@AllArgsConstructor
public class UserAddress implements Serializable {
    private String name;
    private String phone;
    private String address;

}
