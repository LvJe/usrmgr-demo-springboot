package com.xiehaojie.usrmgr.service;

import com.xiehaojie.usrmgr.dao.User;

import java.util.List;

public interface IUserService {
    public Long add(User u);

    public void put(Long id, User u);

    public User get(Long id);

    public void remove(Long id);

    public List<User> list();
}
