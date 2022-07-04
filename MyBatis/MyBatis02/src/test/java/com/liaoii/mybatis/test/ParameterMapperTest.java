package com.liaoii.mybatis.test;

import com.liaoii.mybatis.entity.User;
import com.liaoii.mybatis.mapper.ParameterMapper;
import com.liaoii.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParameterMapperTest {

    @Test
    public void test01() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = mapper.getAllUser();
        users.forEach(System.out::println);
    }

    @Test
    public void test02() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUserName("Lily");
        System.out.println(user);
    }

    @Test
    public void test03() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("Lily", "123456");
        System.out.println(user);
    }

    @Test
    public void test04() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "Lily");
        map.put("password", "123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void test05() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = new User(null, "李思", "123456", 22, "女", "1314@163.com");
        int result = mapper.insertUser(user);
        System.out.println(result);
    }

    @Test
    public void test06() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLoginByParam("Lily", "123456");
        System.out.println(user);
    }
}
