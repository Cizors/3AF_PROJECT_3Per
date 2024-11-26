package com.example.project3af.services;

import com.example.project3af.dao.UserDao;
import com.example.project3af.db.DB;
import com.example.project3af.models.User;

public class UserService {

    private UserDao userDao = new UserDao(DB.getConnection());

    public void create(User user){
        userDao.insert(user);
    }
}
