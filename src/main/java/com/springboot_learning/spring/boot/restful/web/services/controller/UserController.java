package com.springboot_learning.spring.boot.restful.web.services.controller;

import com.springboot_learning.spring.boot.restful.web.services.entity.User;
import com.springboot_learning.spring.boot.restful.web.services.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService service;

//    @PostMapping
//    public User createUser(@RequestBody User user){
//        return service.createUser(user);
//    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = service.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return service.fetchUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return service.fetchAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id){
        service.deleteUser(id);
    }


}
