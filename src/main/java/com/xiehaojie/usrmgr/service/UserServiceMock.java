package com.xiehaojie.usrmgr.service;

import com.xiehaojie.usrmgr.dao.User;

import java.util.*;

public class UserServiceMock implements IUserService {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
    static int id = 0;

    @Override
    public Long add(User u) {
        id++;
        u.setId((long) id);
        users.put((long) id, u);
        return (long) id;
    }

    @Override
    public void put(Long id, User u) {
        //TODO 加锁哦
        users.put((long) id, u);
    }

    @Override
    public User get(Long id) {
        return users.get(id);
    }

    @Override
    public void remove(Long id) {
        users.remove(id);
    }

    @Override
    public List<User> list() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }
}
