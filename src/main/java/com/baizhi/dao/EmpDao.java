package com.baizhi.dao;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpDao extends BaseDao<Emp> {
    List<Emp> queryAll(String id);
}
