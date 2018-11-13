package com.baizhi.service.impl;

import com.baizhi.dao.DeptDao;
import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("deptService")
@Transactional
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    public void save(Dept dept) {
        deptDao.insert(dept);
    }

    public void remove(String id) {
        deptDao.delete(id);
    }

    public List<Dept> findAll() {
        List<Dept> queryAll = deptDao.queryAll();
        return queryAll;
    }

    @Override
    public Dept findOne(Dept T) {
        return null;
    }

    @Override
    public List<Dept> findByPage(Integer start, Integer rows) {
        return null;
    }

    @Override
    public Long findTotals() {
        return null;
    }

    @Override
    public void motify(Dept dept) {
        deptDao.update(dept);
    }

}
