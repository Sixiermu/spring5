package com.atguigu.spring5;

public class User {
    private String name;
    private String bauhtor;

    public String getName() {
        return name;
    }

    public String getBauhtor() {
        return bauhtor;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setBauhtor(String bauhtor) {
        this.bauhtor = bauhtor;
    }

    public  void add(){
        System.out.println("add...");
    }

    public static void main(String[] args) {
        User user = new User();
        user.setName("2");
    }
}
