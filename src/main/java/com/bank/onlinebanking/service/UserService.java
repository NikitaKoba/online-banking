package com.bank.onlinebanking.service;



import com.bank.onlinebanking.dto.UserDto;
import com.bank.onlinebanking.entity.User;

import java.util.List;

public interface UserService {

    User createUser(UserDto userDto);


}
