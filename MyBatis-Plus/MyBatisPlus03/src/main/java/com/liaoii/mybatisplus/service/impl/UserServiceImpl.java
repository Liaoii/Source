package com.liaoii.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liaoii.mybatisplus.entity.User;
import com.liaoii.mybatisplus.service.UserService;
import com.liaoii.mybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author 73480
 * @description 针对表【t_user】的数据库操作Service实现
 * @createDate 2022-07-08 11:13:45
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}




