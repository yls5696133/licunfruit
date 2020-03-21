package com.example.licunfruit.dao;

import com.example.licunfruit.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User findUserById(@Param("userId") int userId);

    User findUserByUsername(@Param("username") String username);


    int addUser(User user);

    int removeUser(int userId);

    int updateUser(User user);

}
