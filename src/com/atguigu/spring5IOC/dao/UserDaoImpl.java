package com.atguigu.spring5IOC.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Value(value = "456")
    private String userName;
    public void setUserName(String userName) {
        this.userName = userName;
    }
//
//    public UserDaoImpl(String userName) {
//        this.userName = userName;
//    }

    @Override
    public void update() {
        System.out.println("正在调用userdaoiml update");
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
