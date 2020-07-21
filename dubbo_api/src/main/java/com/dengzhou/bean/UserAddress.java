package com.dengzhou.bean;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private Integer userId;
    private String name;
    private String phoneNum;

    public UserAddress() {
    }

    public UserAddress(Integer userId, String name, String phoneNum) {
        this.userId = userId;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
