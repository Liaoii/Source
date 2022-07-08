package com.liaoii.mybatisplus;

import com.liaoii.mybatisplus.entity.Product;
import com.liaoii.mybatisplus.entity.User;
import com.liaoii.mybatisplus.service.ProductService;
import com.liaoii.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBatisPlus02ApplicationTests {

    @Test
    void contextLoads() {

    }

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Test
    public void test01() {
        User user = userService.getById(1);
        System.out.println("User: " + user);
        Product product = productService.getById(1);
        System.out.println("Product: " + product);
    }
}
