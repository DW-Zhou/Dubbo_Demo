package com.dengzhou.service.impl;

import com.dengzhou.bean.UserAddress;
import com.dengzhou.service.OrderService;
import com.dengzhou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;
    public void initOrder(Integer userId) {
        System.out.println("用户ID："+userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(1);

        for (UserAddress userAddress:userAddressList){
            System.out.println(userAddress);
        }
    }
}
