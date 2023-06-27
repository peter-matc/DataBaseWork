package com.Test.service.impl;

import com.Test.dao.UserDao;
import com.Test.dao.impl.UserDaoImpl;
import com.Test.entity.User;
import com.Test.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl();
    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public void addUser(User user) {
         dao.add(user);
    }
}
