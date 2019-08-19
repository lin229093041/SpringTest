package com.rony.dao;

import org.springframework.stereotype.Repository;

@Repository("courseDao")
public class CourseDaoImpl implements CourseDao {

    @Override
    public void save() {
        System.out.println("Course save 。。。");
    }
}
