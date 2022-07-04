package com.liaoii.mybatis.mapper;

import com.liaoii.mybatis.entity.User;

import java.util.List;

public interface UserMapper {

    int insertUser();

    int updateUser();

    int deleteUser();

    User getUserById();

    List<User> getAllUser();

}
