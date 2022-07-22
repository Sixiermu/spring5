package com.atguigu.spring5IOC.factorybean;

import com.atguigu.spring5IOC.bean.Emp;
import org.springframework.beans.factory.FactoryBean;
//实现FactoryBean 并通过泛型定义返回对象
public class MyBean implements FactoryBean<Emp> {

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Emp getObject() throws Exception {
        //此处用new 实际可以用工厂+反射获取对象
        Emp emp = new Emp();
        emp.setEname("lucy");
        return emp;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
