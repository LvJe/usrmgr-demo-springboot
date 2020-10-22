package com.xiehaojie.usrmgr;

import com.xiehaojie.usrmgr.dao.User;
import com.xiehaojie.usrmgr.dao.UserMapper;
import com.xiehaojie.usrmgr.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class UsrmgrApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("123");
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() throws Exception {
        userMapper.insert("AAB", 20, 1, "17000000000", "bj");
        User u = userMapper.findByName("AAAB");
        System.out.println("123");
    }

    @Test
    public void testGetUserByAgeGap() throws Exception {
        List<User> users = userMapper.findByAgeGap(20, 21);
        System.out.println("GetUsersSuc");
    }

    @Autowired
    private UserService userService;

    @Test
    public void testUserServiceGetUser() {
        List<User> u = userService.list();
        System.out.println("GetUsersSuc");
    }
}
