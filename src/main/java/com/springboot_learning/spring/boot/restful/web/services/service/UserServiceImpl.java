package com.springboot_learning.spring.boot.restful.web.services.service;

import com.springboot_learning.spring.boot.restful.web.services.entity.User;
import com.springboot_learning.spring.boot.restful.web.services.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public User fetchUserById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<User> fetchAllUsers() {
        return repository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
