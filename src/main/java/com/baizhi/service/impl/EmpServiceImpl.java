package com.baizhi.service.impl;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    public void save(Emp emp) {

        empDao.insert(emp);
    }

    public void remove(String id) {
        empDao.delete(id);
    }

    @Override
    public List<Emp> findAll() {
        return null;
    }

    @Override
    public Emp findOne(Emp T) {
        return null;
    }

    @Override
    public List<Emp> findByPage(Integer start, Integer rows) {
        return null;
    }

    @Override
    public Long findTotals() {
        return null;
    }

    public void motify(Emp emp) {
        empDao.update(emp);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> findAll(String id) {
        List<Emp> findAll = empDao.queryAll(id);
        return findAll;
    }

}
