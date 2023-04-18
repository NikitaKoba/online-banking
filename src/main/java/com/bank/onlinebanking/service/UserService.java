package com.bank.onlinebanking.service;

import com.bank.onlinebanking.dto.UserDto;
import com.bank.onlinebanking.entity.User;
import com.bank.onlinebanking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityNotFoundException;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


}
