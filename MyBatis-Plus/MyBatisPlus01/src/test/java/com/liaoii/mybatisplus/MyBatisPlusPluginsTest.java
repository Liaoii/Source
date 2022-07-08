package com.liaoii.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liaoii.mybatisplus.entity.Product;
import com.liaoii.mybatisplus.entity.User;
import com.liaoii.mybatisplus.enums.SexEnum;
import com.liaoii.mybatisplus.mapper.ProductMapper;
import com.liaoii.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusPluginsTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testPage() {
        Page<User> page = new Page<>(1, 3);
        userMapper.selectPage(page, null);
        System.out.println(page.getRecords());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.hasPrevious());
        System.out.println(page.hasNext());
    }

    @Test
    public void testPageVo() {
        Page<User> page = new Page<>(1, 3);
        userMapper.selectPageVo(page, 20);
        System.out.println(page.getRecords());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.hasPrevious());
        System.out.println(page.hasNext());
    }

    @Test
    public void test03() {
        Product productLi = productMapper.selectById(1);
        System.out.println("小李查询到的价格：" + productLi.getPrice());
        Product productWang = productMapper.selectById(1);
        System.out.println("小王查询到的价格：" + productWang.getPrice());
        productLi.setPrice(productLi.getPrice() + 50);
        productMapper.updateById(productLi);
        productWang.setPrice(productWang.getPrice() - 30);
        productMapper.updateById(productWang);
        Product productBoss = productMapper.selectById(1);
        System.out.println("老板查询到的价格：" + productBoss.getPrice());
    }

    @Test
    public void test04() {
        Product productLi = productMapper.selectById(1);
        System.out.println("小李查询到的价格：" + productLi.getPrice());
        Product productWang = productMapper.selectById(1);
        System.out.println("小王查询到的价格：" + productWang.getPrice());
        productLi.setPrice(productLi.getPrice() + 50);
        productMapper.updateById(productLi);
        productWang.setPrice(productWang.getPrice() - 30);
        int result = productMapper.updateById(productWang);
        if (result == 0) {
            Product productN = productMapper.selectById(1);
            productN.setPrice(productN.getPrice() - 30);
            productMapper.updateById(productN);
        }
        Product productBoss = productMapper.selectById(1);
        System.out.println("老板查询到的价格：" + productBoss.getPrice());
    }

    @Test
    public void testSexEnum() {
        User user = new User();
        user.setName("Enum");
        user.setAge(20);
        user.setSex(SexEnum.MALE);
        userMapper.insert(user);
    }

}
