package com.example.project3af.dao;

import com.example.project3af.models.User;

import java.util.List;

public interface IUserDao {

    void insert(User user);

    void update(User user);

    void deleteByID(Integer id);

    void findByID(Integer id);

    List<User> findAll();
}
