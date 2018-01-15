package com.cxy.service.Impl;

import com.cxy.dao.AgentManTopDao;
import com.cxy.domain.AgentManTop;
import com.cxy.service.AgentManTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AgentManTopServiceImpl implements AgentManTopService {

    @Autowired
    AgentManTopDao agentManTopDao;

    @Override
    public List<AgentManTop> getAllAgentManTop(int id) {
        return this.agentManTopDao.getAllAgentManTop(id);
    }
}
