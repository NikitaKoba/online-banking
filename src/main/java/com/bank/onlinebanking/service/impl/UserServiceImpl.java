package com.bank.onlinebanking.service.impl;


import com.bank.onlinebanking.dto.UserDto;
import com.bank.onlinebanking.entity.User;

import com.bank.onlinebanking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.onlinebanking.service.UserService;

import javax.persistence.NonUniqueResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserDto userDto) {
        User user;
        try {
            user = User.builder()
                    .firstName(userDto.getFirstname())
                    .lastName(userDto.getLastname())
                    .surName(userDto.getSurname())
                    .email(userDto.getEmail())
                    .phoneNumber(userDto.getPhone())
                    .balance(userDto.getBalance())
                    .login(userDto.getLogin())
                    .password(userDto.getPassword())
                    .build();

            if (userRepository.findAllByLogin(userDto.getLogin()) != null || userRepository.findAllByEmail(userDto.getEmail()) != null || userRepository.findAllByPhoneNumber(userDto.getPhone()) != null) {
                return null;
            }
        } catch (Exception  e) {
            throw new RuntimeException(e.getMessage());
        }
        return userRepository.save(user);
    }





















/*    @Override
    public void createAuth(AuthenticationDto authenticationDto) {
        Authentication authentication =new Authentication();
        authentication.setUserid(authenticationDto.getId());
        authentication.setLogin(authenticationDto.getLogin());
        authentication.setPassword(authenticationDto.getPassword());
        authenticationRepository.save(authentication);
    }*/
}
