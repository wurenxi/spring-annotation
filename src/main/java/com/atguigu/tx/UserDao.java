package com.atguigu.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/27 19:54
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "insert into tbl_user(username,age) values(?,?)";
        String username = UUID.randomUUID().toString().substring(0, 4);
        jdbcTemplate.update(sql,username,18);
    }
}
