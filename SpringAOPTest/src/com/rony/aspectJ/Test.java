package com.rony.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("spring-aspectJ-Annotation.xml");
        CourseDao cd= (CourseDao) app.getBean("courseDao");
        cd.add();
//        cd.delete();
    }
}
