package com.personal.service.impl;

import com.personal.dao.UserDao;
import com.personal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;
    @Override
    public List getUserList() {
        return (List) userDao.findAll();
    }
}
