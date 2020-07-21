package com.dengzhou.service;

import com.dengzhou.bean.UserAddress;

import java.util.List;

public interface UserService {
    List<UserAddress> getUserAddressList(Integer userId);
}
