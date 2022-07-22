package com.atguigu.spring5IOC.testdemo;
import com.atguigu.spring5IOC.bean.Emp;
import com.atguigu.spring5IOC.colletiontype.Book1;
import com.atguigu.spring5IOC.config.SpringConfig;
import com.atguigu.spring5IOC.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    @Test
    public void testBean7(){

        //加载配置文件 src下相对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");

        //获取配置文件创建的对象.class 表示转换类型
         Emp emp = context.getBean("mybean", Emp.class);
         System.out.println(emp);
    }
    @Test
    public void testBeanByAnnotionn(){

        //加载配置文件 src下相对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring5IOC/beanmanagebyannotation/beanbyannotation.xml");

        //获取配置文件创建的对象.class 表示转换类型
        UserService useService = context.getBean("userService", UserService.class);
        useService.add();
    }

    @Test
    public void attributeByAnnotionn(){

        //加载配置文件 src下相对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring5IOC/beanmanagebyannotation/beanbyannotation.xml");

        //获取配置文件创建的对象.class 表示转换类型
        UserService useService = context.getBean("userService", UserService.class);
        //myBean.test();
        useService.add();
    }
    @Test
    public void testConfigSpring(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //获取配置文件创建的对象.class 表示转换类型
        UserService useService = context.getBean("userService", UserService.class);
        //myBean.test();
        useService.add();
    }
}

