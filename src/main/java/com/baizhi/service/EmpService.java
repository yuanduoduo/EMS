package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpService extends BaseService<Emp> {
    List<Emp> findAll(String id);
}
