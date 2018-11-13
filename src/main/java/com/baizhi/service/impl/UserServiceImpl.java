package com.baizhi.service.impl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public void save(User user) {
        userDao.insert(user);
    }

    @Override
    public void motify(User user) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findOne(User user) {
        User user1 = userDao.queryOne(user);
        return user1;
    }

    @Override
    public List<User> findByPage(Integer start, Integer rows) {
        return null;
    }

    @Override
    public Long findTotals() {
        return null;
    }
}
