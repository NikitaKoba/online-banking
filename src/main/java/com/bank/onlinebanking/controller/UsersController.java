package com.bank.onlinebanking.controller;

import com.bank.onlinebanking.entity.User;
import com.bank.onlinebanking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UsersController {
   /* @Autowired
    UserService userService;
    @PostMapping("/users")
    public User createUser(@RequestBody User user) throws Exception {
        return userService.createUser(user);
    }
    @PostMapping("/users/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }*/
}
