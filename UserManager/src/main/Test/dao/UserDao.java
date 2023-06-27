package com.Test.dao;

import com.Test.entity.User;

public interface UserDao {
    User findUserByUsernameAndPassword(String username, String password);
    void add(User user);
}
