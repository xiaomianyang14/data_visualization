package com.cxy.dao.Impl;

import com.cxy.dao.AgentManTopDao;
import com.cxy.domain.AgentManTop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AgentManTopDaoImpl implements AgentManTopDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<AgentManTop> getAllAgentManTop(int id) {
        List<AgentManTop> list = jdbcTemplate.query("select * from agent_man_top100 where id >= ?",new Object[]{id},new BeanPropertyRowMapper(AgentManTop.class));
        return list;
    }
}
