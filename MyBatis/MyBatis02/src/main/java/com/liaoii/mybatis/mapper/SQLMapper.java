package com.liaoii.mybatis.mapper;

import com.liaoii.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {
    List<User> getUserByLike(@Param("username") String username);
    int deleteMore(@Param("ids") String ids);
    /**
     * 查询指定表中的数据
     */
    List<User> getUserByTableName(@Param("tableName") String tableName);
    int insertUser(User user);
}
