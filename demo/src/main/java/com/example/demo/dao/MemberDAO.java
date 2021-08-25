package com.example.demo.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


@Repository
public class MemberDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addMember(){
        System.out.println("EXECUTE INSERT MEMBER");
        jdbcTemplate.update("INSERT INTO USERS(USERNAME, PASSWORD) "
                + "VALUES (?,?)","lll2","kkkk");
    }
    public List query(){
        List rows = jdbcTemplate.queryForList("SELECT * FROM users");
        return rows;
    }
}

