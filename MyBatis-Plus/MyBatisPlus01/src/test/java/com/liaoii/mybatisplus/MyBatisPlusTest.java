package com.liaoii.mybatisplus;

import com.liaoii.mybatisplus.entity.User;
import com.liaoii.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("张珊");
        user.setAge(18);
        user.setEmail("zs@qq.com");
        int result = userMapper.insert(user);
        System.out.println("result: " + result);
        System.out.println("user.id: " + user.getId());
    }

    @Test
    public void testDeleteById() {
        int result = userMapper.deleteById(1544211730737479681L);
        System.out.println("result: " + result);
    }

    @Test
    public void testDeleteByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张珊");
        map.put("age", 18);
        int result = userMapper.deleteByMap(map);
        System.out.println("result: " + result);
    }

    @Test
    public void testDeleteBatchIds() {
        List<Long> list = Arrays.asList(1L, 2L, 3L);
        int result = userMapper.deleteBatchIds(list);
        System.out.println("result: " + result);
    }

    @Test
    public void testUpdateById() {
        User user = new User();
        user.setId(4L);
        user.setName("李思");
        user.setEmail("lisi@qq.com");
        int result = userMapper.updateById(user);
        System.out.println("result: " + result);
    }

    @Test
    public void testSelectById() {
        User user = userMapper.selectById(2L);
        System.out.println("user: " + user);
    }

    @Test
    public void testSelectBatchIds() {
        List<Long> list = Arrays.asList(1L, 3L, 5L);
        List<User> users = userMapper.selectBatchIds(list);
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Jack");
        map.put("age", 20);
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectList() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectMapById() {
        Map<String, Object> map = userMapper.selectMapById(2L);
        System.out.println(map);
    }
}
