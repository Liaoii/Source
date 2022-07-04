package com.liaoii.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liaoii.mybatis.entity.Emp;
import com.liaoii.mybatis.mapper.EmpMapper;
import com.liaoii.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageHelperTest {

    @Test
    public void test01() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        //Page<Object> page = PageHelper.startPage(2,5);
        PageHelper.startPage(2,5);
        List<Emp> list = mapper.selectByExample(null);
        PageInfo<Emp> page = new PageInfo<>(list, 5);
        //list.forEach(System.out::println);
        System.out.println(page);
    }
}
