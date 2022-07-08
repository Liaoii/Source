package com.liaoii.mybatisplus.mapper;
import org.apache.ibatis.annotations.Param;

import com.liaoii.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author 73480
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-07-08 11:13:45
* @Entity com.liaoii.mybatisplus.entity.User
*/
@Repository
public interface UserMapper extends BaseMapper<User> {

}




