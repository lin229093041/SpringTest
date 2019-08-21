package com.rony.test;

import com.rony.dao.AccountDao;
import com.rony.pojo.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        /*JdbcTemplate j= (JdbcTemplate) context.getBean("jdbcTemplate");
        String sql = "create table account ( id int primary key auto_increment,username varchar (20),password varchar (20))";
//        j.execute(sql);
//        System.out.println("创建表格成功");
//        ----------------------------------------------
        sql="insert into account values (?,?,?)";
        int i = j.update(sql, 2, "rony2", "8888");
//        System.out.println("插入了"+i+"条数据");
//        -----------------------------------------------
        sql="select * from account where id=?";
        RowMapper<Account> rm=new BeanPropertyRowMapper(Account.class);
        int id=1;
        Account a = j.queryForObject(sql, rm, id);
//        System.out.println(a);
        sql="select * from account";
        List<Account> q = j.query(sql, rm);
        System.out.println(q);*/
        AccountDao dao= (AccountDao) context.getBean("accountDao");
        dao.transfer("rony","rony2",100);
    }

}
