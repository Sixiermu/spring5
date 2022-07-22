package com.atguigu.spring5IOC.bean;

public class Emp {
    private String ename;
    private String gender;

    //员工属于某个部门 用对象表示
    private  Dept dept;
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public Dept getDept() {
        return dept;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void add(){
        System.out.println(ename + "::" + gender +"::" + dept);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
