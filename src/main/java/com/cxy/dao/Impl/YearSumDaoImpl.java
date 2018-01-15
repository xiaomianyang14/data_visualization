package com.cxy.dao.Impl;

import com.cxy.dao.YearSumDao;
import com.cxy.domain.YearSum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class YearSumDaoImpl implements YearSumDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<YearSum> getAllYearSum(int id) {
        return this.jdbcTemplate.query("select * from year_sum where id >= ?",new Object[]{id},new BeanPropertyRowMapper(YearSum.class));
    }
}
