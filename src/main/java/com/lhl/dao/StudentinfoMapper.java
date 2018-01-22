package com.lhl.dao;

import com.lhl.po.Studentinfo;
import java.util.List;

public interface StudentinfoMapper {
    int deleteByPrimaryKey(String stuid);

    int insert(Studentinfo record);

    Studentinfo selectByPrimaryKey(String stuid);

    List<Studentinfo> selectAll();

    int updateByPrimaryKey(Studentinfo record);
}