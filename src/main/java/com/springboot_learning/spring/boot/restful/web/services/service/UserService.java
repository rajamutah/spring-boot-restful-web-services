package com.springboot_learning.spring.boot.restful.web.services.service;

import com.springboot_learning.spring.boot.restful.web.services.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User fetchUserById(Long id);

    List<User> fetchAllUsers();

    void deleteUser(Long id);
}
