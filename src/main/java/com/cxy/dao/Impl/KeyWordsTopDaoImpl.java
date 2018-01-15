package com.cxy.dao.Impl;

import com.cxy.dao.KeyWordsTopDao;
import com.cxy.domain.KeyWordsTop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KeyWordsTopDaoImpl implements KeyWordsTopDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<KeyWordsTop> getAllKeyWordsTop(int id) {
        return this.jdbcTemplate.query("select * from keywords_top200 where id >= ?",new Object[]{id},new BeanPropertyRowMapper(KeyWordsTop.class));
    }



}
