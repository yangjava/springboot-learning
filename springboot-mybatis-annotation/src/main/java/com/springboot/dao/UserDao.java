package com.springboot.dao;

import com.springboot.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {
   @Select("select * from user where id = #{id}")
   @Results({
           @Result(property = "id", column = "id"),
           @Result(property = "name", column = "name"),
           @Result(property = "age", column = "age"),
           @Result(property = "descp", column = "descp"),
   })
  public User findById(@Param("id") int id);
}
