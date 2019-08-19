package com.rony.controller;

import com.rony.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

//@Controller("courseController")
public class CourseController {
//    @Resource(name="courseService")
//    @Autowired
    private CourseService cs;
    public void save(){
        System.out.println("Controller save ....");
        cs.save();
    }

    public void setCs(CourseService cs) {
        this.cs = cs;
    }
}
