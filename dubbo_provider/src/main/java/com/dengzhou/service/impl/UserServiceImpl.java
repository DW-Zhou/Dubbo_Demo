package com.dengzhou.service.impl;

import com.dengzhou.bean.UserAddress;
import com.dengzhou.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(Integer userId) {
        UserAddress userAddress1 = new UserAddress(1,"小王","021-989810");
        UserAddress userAddress2 = new UserAddress(1,"小李","021-9019810");


        return Arrays.asList(userAddress1,userAddress2);
    }
}
