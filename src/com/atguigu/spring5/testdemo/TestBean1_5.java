package com.atguigu.spring5.testdemo;
import com.atguigu.spring5.Book;
import com.atguigu.spring5.User;
import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.colletiontype.Stu;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestBean1_5 {
    @Test
    public void testBean2(){

        //加载配置文件
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("D:\\project\\spring5_demo1\\src\\bean2.xml");
        //获取配置文件创建的对象.class 表示转换类型
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }

    @Test
    public void testBean3(){

        //加载配置文件 src下相对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        //获取配置文件创建的对象.class 表示转换类型
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

    @Test
    public void testBean4(){

        //加载配置文件 src下相对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //获取配置文件创建的对象.class 表示转换类型
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
    @Test
    public void testBean5(){

        //加载配置文件 src下相对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        //获取配置文件创建的对象.class 表示转换类型

        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }
}

