package com.atguigu.spring5IOC.testdemo;
import com.atguigu.spring5IOC.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring{
    @Test
    public void testAdd(){
/*        //加载spring配置文件
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");

        //获取配置创建的对象 .class 表示转换类型
        User user = context.getBean("user", User.class);*/
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("D:\\project\\spring5_demo1\\src\\bean1.xml");
        //类似反射
        Book order = context.getBean("book",Book.class);
        order.bookTest();
    }
}

