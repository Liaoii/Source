package com.liaoii.mybatis.test;

import com.liaoii.mybatis.entity.Emp;
import com.liaoii.mybatis.entity.EmpExample;
import com.liaoii.mybatis.mapper.EmpMapper;
import com.liaoii.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisTest {
    @Test
    public void test01() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        EmpExample example = new EmpExample();
        example.createCriteria().andSexEqualTo("男");
        example.or().andDidEqualTo(3);
        example.or().andEmpNameEqualTo("秦琪");
        List<Emp> emps = mapper.selectByExample(example);
        emps.forEach(System.out::println);
    }

    @Test
    public void test02() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        //int result1 = mapper.updateByPrimaryKey(new Emp(14, "呜呜", 18, null, "323@qq.com", 1));
        //System.out.println(result1);
        int result2 = mapper.updateByPrimaryKeySelective(new Emp(14, "呜呜", 20, null, "323@qq.com", 1));
        System.out.println(result2);
    }
}
