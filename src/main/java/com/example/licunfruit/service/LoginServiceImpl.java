package com.example.licunfruit.service;

import com.example.licunfruit.bean.User;
import com.example.licunfruit.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl {

    @Autowired
    UserMapper userMapper;

    public User getUserByName(String loginName){
        return userMapper.findUserByUsername(loginName);
    }
}
