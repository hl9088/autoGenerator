package com.lhl.dao;

import com.lhl.po.Stumarkinfo;
import java.util.List;

public interface StumarkinfoMapper {
    int deleteByPrimaryKey(String markid);

    int insert(Stumarkinfo record);

    Stumarkinfo selectByPrimaryKey(String markid);

    List<Stumarkinfo> selectAll();

    int updateByPrimaryKey(Stumarkinfo record);
}