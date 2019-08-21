package com.rony.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public void transfer(String out, String in, double money){
        String sql="update account set balance = balance + ? where username=?";
//        转入金额
        int update = jdbcTemplate.update(sql, money, in);
        System.out.println("转入了"+update);
//        模拟出现未知错误
        int i=10/0;
        sql="update account set balance=balance - ? where username=?";
//        转出金额
        update = jdbcTemplate.update(sql, money, out);
        System.out.println("转出了"+update);
    }
}
