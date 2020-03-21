package com.example.licunfruit.service;

import com.example.licunfruit.dao.UserMapper;
import com.example.licunfruit.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User findUserById(int userId){
        return userMapper.findUserById(userId);
    }

    public User findUserByUsername(String username){
        return userMapper.findUserByUsername(username);
    }


}
