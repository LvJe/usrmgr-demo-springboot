package com.xiehaojie.usrmgr.service;

import com.xiehaojie.usrmgr.dao.User;
import com.xiehaojie.usrmgr.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Slf4j
@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Long add(User u) {
        return userMapper.insertByUser(u);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void put(Long id, User u) {
        u.setId(id);
        userMapper.update(u);
    }

    @Override
    public User get(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void remove(Long id) {
    }

    @Override
    public List<User> list() {
        List<User> r;
        r = userMapper.findAll();
        return r;
    }
}
