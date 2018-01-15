package com.cxy.service;

import com.cxy.domain.AreaInfo;

import java.util.List;

public interface AreaInfoService {
    public AreaInfo getAreaInfoByID(int id);
    public List<AreaInfo> getAllAreaInfo(int id);
    public List<AreaInfo> getAllChineseInfo(int id);
}
