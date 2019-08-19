package com.rony.service;

import com.rony.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("courseService")
public class CourseServiceImpl implements  CourseService {
    @Resource(name="courseDao")
    private CourseDao dao;
    @Override
    public void save() {
        System.out.println("Service save ...");
        dao.save();
    }

    public void setDao(CourseDao dao) {
        this.dao = dao;
    }
}
