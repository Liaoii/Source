package com.liaoii.mybatisplus;

import com.liaoii.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBatisPlus03ApplicationTests {

    @Test
    void contextLoads() {

    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {
        int result = userMapper.deleteByUid(14L);
        System.out.println("result: " + result);
    }

}
