package com.bank.onlinebanking.service.impl;


import com.bank.onlinebanking.dto.UserDto;
import com.bank.onlinebanking.entity.Auth;
import com.bank.onlinebanking.entity.User;

import com.bank.onlinebanking.repository.AuthRepositroy;
import com.bank.onlinebanking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.onlinebanking.service.UserService;

import javax.persistence.NonUniqueResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    private static final long MAX_USER_ID = 1000000;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthRepositroy authRepositroy;

    @Override
    public User createUser(UserDto userDto) {
        User user;
        Auth auth = new Auth();
        user = User.builder()
                .firstName(userDto.getFirstname())
                .lastName(userDto.getLastname())
                .surName(userDto.getSurname())
                .email(userDto.getEmail())
                .phoneNumber(userDto.getPhone())
                .balance(userDto.getBalance())
                .build();
        /*userRepository.save(user);
        auth.setLogin(userDto.getLogin());
        auth.setPassword(userDto.getPassword());
        user = userRepository.getByClientid(user.getClientid());
        auth.setUserid(user);*/
        try {


        if (authRepositroy.findAllByLogin(userDto.getLogin()) != null){
            System.out.println("Login" +" "+ userDto.getLogin()+ " " + "is busy");
        }
        else if(userRepository.findAllByEmail(user.getEmail()) != null){
            System.out.println("Email" + " " + user.getEmail() + " "+ "is busy");
        }
        else if(userRepository.findAllByPhoneNumber(userDto.getPhone()) != null){
            System.out.println("Phone" + " " + userDto.getPhone() + " " + "is busy");
        }
        else {
            userRepository.save(user);
            auth.setLogin(userDto.getLogin());
            auth.setPassword(userDto.getPassword());
            user = userRepository.getByClientid(user.getClientid());
            auth.setUserid(user);
            authRepositroy.save(auth);
        }} catch (Exception e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public Auth authUser(UserDto userDto) {
        Auth auth = authRepositroy.findAllByLoginAndPassword(userDto.getLogin(), userDto.getPassword());
        User user = new User();
        auth.setLogin(userDto.getLogin());
        auth.setPassword(userDto.getPassword());
        if(auth != null)
        {
            return auth;
        }
        else {
            throw new RuntimeException("User not found");}
        }


    @Override
    public Auth getUserIdByLogin(String login) {
        Auth auth = authRepositroy.findAllByLogin(login);
        if(auth!= null) {
            return auth;
        }
        else { throw new RuntimeException("User with login " + login + " not found");
    }






    /*   *//*if (authRepositroy.findAllByLogin(userDto.getLogin()) != null || userRepository.findAllByEmail(userDto.getEmail()) != null || userRepository.findAllByPhoneNumber(userDto.getPhone()) != null) {
                return null;
            }*//*
        } catch (Exception  e) {
            throw new RuntimeException(e.getMessage());
        }*/
        /*userRepository.save(user);
        user = userRepository.findByClientid(userDto.getClientid());;
        auth.setLogin(userDto.getLogin());
        auth.setClientid(user);
        auth.setPassword(userDto.getPassword());
        authRepositroy.save(auth);*/

    /*return user;*/






















/*    @Override
    public void createAuth(AuthenticationDto authenticationDto) {
        Authentication authentication =new Authentication();
        authentication.setUserid(authenticationDto.getId());
        authentication.setLogin(authenticationDto.getLogin());
        authentication.setPassword(authenticationDto.getPassword());
        authenticationRepository.save(authentication);
    }*/
}}
