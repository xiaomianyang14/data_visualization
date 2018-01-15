package com.cxy.dao.Impl;

import com.cxy.dao.CreatorTopDao;
import com.cxy.domain.CreatorTop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CreatorTopDaoImpl implements CreatorTopDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<CreatorTop> getAllCreatorTop(int id) {
        return this.jdbcTemplate.query("select * from creator_top100 where id >= ?",new Object[]{id},new BeanPropertyRowMapper(CreatorTop.class));
    }
}
