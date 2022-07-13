package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

public class UserService {
    //创建UserDao属性
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("你正在调用UerService");
        userDao.update();
// 原始方式
//        UserDao dao = new UserDaoImpl();
//        dao.update();
    }
}
