package com.liaoii.mybatis.test;

import com.liaoii.mybatis.entity.User;
import com.liaoii.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    public void test01() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(stream);
        SqlSession sqlSession = factory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.insertUser();
        sqlSession.commit();
        System.out.println("Result: " + res);
    }

    @Test
    public void test02() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(stream);
        SqlSession session = factory.openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.updateUser();
    }

    @Test
    public void test03() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(stream);
        SqlSession session = factory.openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);
        int res = mapper.deleteUser();
        System.out.println("Result: " + res);
    }

    @Test
    public void test04() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(stream);
        SqlSession session = factory.openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
    }

    @Test
    public void test05() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(stream);
        SqlSession session = factory.openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getAllUser();
        System.out.println(users);
    }
}
