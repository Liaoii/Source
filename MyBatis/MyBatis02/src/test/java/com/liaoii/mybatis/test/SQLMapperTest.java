package com.liaoii.mybatis.test;

import com.liaoii.mybatis.entity.User;
import com.liaoii.mybatis.mapper.SQLMapper;
import com.liaoii.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SQLMapperTest {
    @Test
    public void test01() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = session.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);
    }

    @Test
    public void test02() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = session.getMapper(SQLMapper.class);
        int result = mapper.deleteMore("1,2,3");
        System.out.println(result);
    }

    @Test
    public void test03() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = session.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByTableName("t_user");
        list.forEach(System.out::println);
    }

    @Test
    public void test04() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = session.getMapper(SQLMapper.class);
        User user = new User(null, "Liaoii", "123", 22, "男", "1314@163.com");
        int result = mapper.insertUser(user);
        System.out.println(result);
        System.out.println(user);
    }
}
