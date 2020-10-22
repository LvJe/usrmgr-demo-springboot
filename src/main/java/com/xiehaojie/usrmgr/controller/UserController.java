package com.xiehaojie.usrmgr.controller;

import com.xiehaojie.usrmgr.dao.User;
import com.xiehaojie.usrmgr.service.IUserService;
import com.xiehaojie.usrmgr.service.UserService;
import com.xiehaojie.usrmgr.service.UserServiceMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author xiehaojie
 * @created at 2020-10-21
 */

@RestController
@RequestMapping(value = "/users")
public class UserController {
    // 创建线程安全的Map，模拟users信息的存储
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    //    IUserService userService = new UserServiceMock();
    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<User> getUserList() {
        List<User> r = userService.list();
        return r;
    }

    @PostMapping("/")
    public String postUser(@RequestBody User user) {
        userService.add(user);
        return "success";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        // url中的id可通过@PathVariable绑定到函数的参数中
        return userService.get(id);
    }

    @PutMapping("/{id}")
    public String putUser(@PathVariable Long id, @RequestBody User user) {
        User u = userService.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }
}
