package com.atguigu.spring5.dao;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class UserDaoImpl implements UserDao {
    @Override
    public void update() {
        System.out.println("dao update");
    }
}
