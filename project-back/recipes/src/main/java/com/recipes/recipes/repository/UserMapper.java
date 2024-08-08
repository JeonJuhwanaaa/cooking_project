package com.recipes.recipes.repository;

import com.recipes.recipes.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public int saveUser(User user);
    public User findUserByUsername(String username);
}
