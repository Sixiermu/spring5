package com.atguigu.spring5;

public class Order {
    private String address;
    private String name;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Order(String address, String name) {
//        this.address = address;
//        this.name = name;
//    }
    public void orderTest(){
        System.out.println(this.name +"::"+this.address);
    }
}
