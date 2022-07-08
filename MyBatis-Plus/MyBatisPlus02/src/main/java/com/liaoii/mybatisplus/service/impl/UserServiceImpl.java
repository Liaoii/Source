package com.liaoii.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liaoii.mybatisplus.entity.User;
import com.liaoii.mybatisplus.mapper.UserMapper;
import com.liaoii.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
