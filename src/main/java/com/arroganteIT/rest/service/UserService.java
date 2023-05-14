package com.arroganteIT.rest.service;

import com.arroganteIT.rest.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUserById(User user);

    User getUserById(int id);

    void deleteUserById(int id);
}
