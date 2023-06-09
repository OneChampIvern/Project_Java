package com.example.demo.controller;


import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
    @Autowired
    public UserMapper userMapper;

    @GetMapping(value = "/get")
    public List<User> helloString(){
        return userMapper.getAll();
    }
}
