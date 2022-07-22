package com.atguigu.spring5IOC.colletiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //数组
    private  String[] courses;
    //list集合
    private List<String> list;
    //Map
    private Map<String,String> map;
    //set
    private Set<String> set;

    //学生
    private List<Course> courseList;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }


    public  void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
        System.out.println(courseList);
    }
}
