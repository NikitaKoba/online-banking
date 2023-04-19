package com.bank.onlinebanking.controller;



import com.bank.onlinebanking.dto.UserDto;
import com.bank.onlinebanking.entity.User;
import com.bank.onlinebanking.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UsersController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("/register/")
    public User createUser(@RequestBody UserDto userDto){
        return userServiceImpl.createUser(userDto);
    }
}
