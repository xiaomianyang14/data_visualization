package com.cxy.service.Impl;

import com.cxy.dao.YearSumDao;
import com.cxy.domain.YearSum;
import com.cxy.service.YearSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YearSumServiceImpl implements YearSumService {

    @Autowired
    YearSumDao yearSumDao;

    @Override
    public List<YearSum> getAllYearSum(int id) {
        return this.yearSumDao.getAllYearSum(id);
    }
}
