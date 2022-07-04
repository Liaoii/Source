package com.liaoii.mybatis.test;

import com.liaoii.mybatis.entity.Emp;
import com.liaoii.mybatis.mapper.DynamicSQLMapper;
import com.liaoii.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicSQLTest {

    @Test
    public void test01() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = session.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp();
        //emp.setEmpName("张珊");
        //emp.setAge(18);
        //emp.setSex("男");
        //emp.setEmail("123@qq.com");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }

    @Test
    public void test02() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = session.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp();
        emp.setEmpName("张珊");
        emp.setAge(18);
        //emp.setSex("男");
        //emp.setEmail("123@qq.com");
        List<Emp> list = mapper.getEmpByChoose(emp);
        list.forEach(System.out::println);
    }

    @Test
    public void test03() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = session.getMapper(DynamicSQLMapper.class);
        int result = mapper.deleteMoreByArray(new Integer[]{6, 7, 8});
        System.out.println(result);
    }

    @Test
    public void test04() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = session.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "aa", 18, "女", "aa@qq.com");
        Emp emp2 = new Emp(null, "bb", 18, "女", "bb@qq.com");
        Emp emp3 = new Emp(null, "cc", 18, "女", "cc@qq.com");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        int result = mapper.insertMoreByList(emps);
        System.out.println(result);
    }
}
