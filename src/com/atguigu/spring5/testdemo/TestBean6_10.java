package com.atguigu.spring5.testdemo;
import com.atguigu.spring5.colletiontype.Book1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBean6_10 {
    @Test
    public void testBean6(){

        //加载配置文件 src下相对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");

        //获取配置文件创建的对象.class 表示转换类型
        Book1 book = context.getBean("book", Book1.class);
        book.test();
    }
}

