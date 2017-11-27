package com.springboot.service.impl;

import com.springboot.dao.UserDao;
import com.springboot.domain.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;
    public User findUserById(Long id){
        return userDao.findOne(id);
    }
}
