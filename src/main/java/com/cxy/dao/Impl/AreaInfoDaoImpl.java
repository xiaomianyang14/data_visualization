package com.cxy.dao.Impl;

import com.cxy.dao.AreaInfoDao;
import com.cxy.domain.AreaInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AreaInfoDaoImpl implements AreaInfoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public AreaInfo getAreaInfoByID(int id) {
        List<AreaInfo> list = jdbcTemplate.query("select * from area_info where id = ?",new Object[]{id},new BeanPropertyRowMapper(AreaInfo.class));
        if(null != list && list.size()>0){
            AreaInfo areaInfo = list.get(0);
            return areaInfo;
        }
        return null;
    }

    @Override
    public List<AreaInfo> getAllAreaInfo(int id) {
        List<AreaInfo> list = jdbcTemplate.query("select * from area_info where id >= ?",new Object[]{id},new BeanPropertyRowMapper(AreaInfo.class));
        return list;
    }

    @Override
    public List<AreaInfo> getAllChineseAreaInfo(int id) {
        List<AreaInfo> list = jdbcTemplate.query("select * from area_info where id >= ?  and area_code REGEXP '^[0-9]+$'",new Object[]{id},new BeanPropertyRowMapper(AreaInfo.class));
        return list;
    }


}
