package com.atguigu.spring5IOC;

public class Book {
    private String author;
    private String name;
    private String address;
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book() {
    }
    public void bookTest(){
        System.out.println(author+":"+name+":"+address);
    }
}
