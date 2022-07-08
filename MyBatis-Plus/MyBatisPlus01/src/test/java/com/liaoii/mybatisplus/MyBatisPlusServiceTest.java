package com.liaoii.mybatisplus;

import com.liaoii.mybatisplus.entity.User;
import com.liaoii.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MyBatisPlusServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void test01() {
        long count = userService.count();
        System.out.println("count: " + count);
    }

    @Test
    public void test02() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setName("LL" + i);
            user.setAge(10 + i);
            list.add(user);
        }
        boolean b = userService.saveBatch(list);
        System.out.println("result: " + b);
    }
}
