package com.cxy.dao;

import com.cxy.domain.AreaInfo;

import java.util.List;


public interface AreaInfoDao {
    public AreaInfo getAreaInfoByID(int id);
    public List<AreaInfo> getAllAreaInfo(int id);
    public List<AreaInfo> getAllChineseAreaInfo(int id);
}
