package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//value 和id的作用一致
@Service(value = "userService")
public class UserService {
    //创建UserDao属性
    //加入注解注入 不需要添加set方法
    //根据类型注入
    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao1;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void add(){
        System.out.println("你正在调用UerService"+userDao.toString());
        System.out.println("你正在调用UerService"+userDao1.toString());
        userDao.update();
        userDao1.update();
// 原始方式
//        UserDao dao = new UserDaoImpl();
//        dao.update();
    }
}
