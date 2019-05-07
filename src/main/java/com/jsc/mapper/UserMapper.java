package com.jsc.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
   @Insert("insert t_user (username,password) values (#{username),#{password)")
    public int save(@Param("username") String username,@Param("password") String password);
}
