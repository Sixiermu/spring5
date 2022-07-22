package com.atguigu.spring5IOC.colletiontype;

import java.util.List;

public class Book1 {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public  void test(){
        System.out.println(list);
    }
}
