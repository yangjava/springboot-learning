package com.springboot.dao;

import com.springboot.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

  public User findById(@Param("id")int id);
}
