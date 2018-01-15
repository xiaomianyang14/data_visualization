package com.cxy.service.Impl;

import com.cxy.dao.CreatorTopDao;
import com.cxy.domain.CreatorTop;
import com.cxy.service.CreatorTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CreatorTopServiceImpl implements CreatorTopService {

    @Autowired
    CreatorTopDao creatorTopDao;

    @Override
    public List<CreatorTop> getAllCreatorTop(int id) {
        return this.creatorTopDao.getAllCreatorTop(id);
    }
}
