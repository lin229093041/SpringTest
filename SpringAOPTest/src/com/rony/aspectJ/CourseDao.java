package com.rony.aspectJ;

import org.springframework.stereotype.Component;

@Component("courseDao")
public class CourseDao {
    public void add(){
        int x=0;
//        int y=10/x;
        System.out.println("添加课程");
    }
    public void delete(){
        System.out.println("删除课程");
    }
}
