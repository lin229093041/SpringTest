package com.rony.cglib;

import com.rony.dao.CourseDao;

public class Test {
    public static void main(String[] args) {
        CglibProxy proxy=new CglibProxy();
        CourseDao dao=new CourseDao();

        CourseDao dao2= (CourseDao) proxy.createProxy(dao);
        dao2.add();
        dao2.delete();
    }
}
