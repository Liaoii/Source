package com.liaoii.mybatis.mapper;

import com.liaoii.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    List<Emp> getEmpByCondition(Emp emp);
    List<Emp> getEmpByChoose(Emp emp);
    int deleteMoreByArray(@Param("eids") Integer[] eids);
    int insertMoreByList(@Param("emps") List<Emp> emps);
}
