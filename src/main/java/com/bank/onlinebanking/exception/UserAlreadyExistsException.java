package com.bank.onlinebanking.exception;

import com.bank.onlinebanking.entity.User;

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(){
        super("User already exists");
    }
    public UserAlreadyExistsException(String message){
        super(message);
    }
}
