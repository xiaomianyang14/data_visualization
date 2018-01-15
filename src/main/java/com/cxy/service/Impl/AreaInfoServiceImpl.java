package com.cxy.service.Impl;

import com.cxy.dao.AreaInfoDao;
import com.cxy.domain.AreaInfo;
import com.cxy.service.AreaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaInfoServiceImpl implements AreaInfoService{

    @Autowired
    AreaInfoDao areaInfoDao;

    @Override
    public AreaInfo getAreaInfoByID(int id) {
        return this.areaInfoDao.getAreaInfoByID(id);
    }

    @Override
    public List<AreaInfo> getAllAreaInfo(int id) { return this.areaInfoDao.getAllAreaInfo(id); }

    @Override
    public List<AreaInfo> getAllChineseInfo(int id) { return this.areaInfoDao.getAllChineseAreaInfo(id); }
}
