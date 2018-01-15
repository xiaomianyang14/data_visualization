package com.cxy.service.Impl;

import com.cxy.dao.KeyWordsTopDao;
import com.cxy.domain.KeyWordsTop;
import com.cxy.service.KeyWordsTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyWordsTopServiceImpl implements KeyWordsTopService {

    @Autowired
    KeyWordsTopDao keyWordsTopDao;

    @Override
    public List<KeyWordsTop> getAllKeyWordsTop(int id) {
        return this.keyWordsTopDao.getAllKeyWordsTop(id);
    }
}
