package com.springboot.service;

import java.util.List;

import com.springboot.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
