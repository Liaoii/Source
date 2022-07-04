package com.liaoii.mybatis.test;

import com.liaoii.mybatis.entity.Emp;
import com.liaoii.mybatis.mapper.CacheMapper;
import com.liaoii.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class CacheTest {
    @Test
    public void test01() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = session.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpByEid(1);
        System.out.println(emp1);
        Emp emp2 = mapper.getEmpByEid(1);
        System.out.println(emp2);
    }

    @Test
    public void test02() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = session.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpByEid(1);
        System.out.println(emp1);
        mapper.insertEmp(new Emp(null, "ceshi", 22, "女", "122@qq.com"));
        Emp emp2 = mapper.getEmpByEid(1);
        System.out.println(emp2);
    }

    @Test
    public void test03() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = session.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpByEid(1);
        System.out.println(emp1);
        session.clearCache();
        Emp emp2 = mapper.getEmpByEid(1);
        System.out.println(emp2);
    }

    @Test
    public void test04() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session1 = factory.openSession(true);
            CacheMapper mapper1 = session1.getMapper(CacheMapper.class);
            Emp emp1 = mapper1.getEmpByEid(1);
            System.out.println(emp1);
            session1.close();

            SqlSession session2 = factory.openSession(true);
            CacheMapper mapper2 = session2.getMapper(CacheMapper.class);
            Emp emp2 = mapper2.getEmpByEid(1);
            System.out.println(emp2);
            session2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
