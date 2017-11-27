package com.springboot.service;

import com.springboot.domain.User;

public interface UserService {

    public User findUserById(Long id);
}
