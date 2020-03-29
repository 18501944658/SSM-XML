package com.itszt.service;

import com.itszt.dao.UserDao;
import com.itszt.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public void insertUser(String name, int age) {
        userDao.insertUser(name, age);
    }
}
