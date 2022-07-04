package com.liaoii.mybatis.mapper;

import com.liaoii.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    Emp getEmpByEid(@Param("eid") Integer eid);
    int insertEmp(Emp emp);
}
