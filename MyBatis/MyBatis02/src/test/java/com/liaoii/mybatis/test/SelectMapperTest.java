package com.liaoii.mybatis.test;

import com.liaoii.mybatis.entity.User;
import com.liaoii.mybatis.mapper.SelectMapper;
import com.liaoii.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {

    @Test
    public void test01() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);
    }

    @Test
    public void test02() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> users = mapper.getAllUser();
        users.forEach(System.out::println);
    }

    @Test
    public void test03() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        int count = mapper.getCount();
        System.out.println(count);
    }

    @Test
    public void test04() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(2);
        System.out.println(map);
    }

    @Test
    public void test05() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<String, Object>> list = mapper.getAllUserToMap();
        list.forEach(System.out::println);
    }

    @Test
    public void test06() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getAllUserToMapKey();
        System.out.println(map);
    }
}
