package com.sl.srpingboot001.services.impl;

import com.sl.srpingboot001.mapper.UserMapper;
import com.sl.srpingboot001.pojo.User;
import com.sl.srpingboot001.services.UserServiceAble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceAble {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
