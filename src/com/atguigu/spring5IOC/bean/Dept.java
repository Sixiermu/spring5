package com.atguigu.spring5IOC.bean;

public class Dept {
    public void setDname(String dname) {
        this.dname = dname;
    }

    private  String dname;

    public Dept() {
    }

    public Dept(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
