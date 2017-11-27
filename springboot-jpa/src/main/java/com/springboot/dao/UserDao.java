package com.springboot.dao;

import com.springboot.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserDao extends CrudRepository<User, Long> {

}
