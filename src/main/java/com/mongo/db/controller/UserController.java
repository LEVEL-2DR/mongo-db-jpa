package com.mongo.db.controller;

import com.mongo.db.model.User;
import com.mongo.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dinakar on 06/10/21
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("save")
    public String saveUser(@RequestBody User user){
        userRepository.save(user);
        return "User saved successfully";
    }

    @GetMapping("get")
    public List<User> getUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }
}
