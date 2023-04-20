package com.bank.onlinebanking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
import java.util.Random;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private static final long MAX_USER_ID = 1000000;
    private Random random = new Random();
    private long userid;
    private String firstname;
    private String lastname;
    private String surname;
    private String email;
    private BigDecimal balance;
    private String phone;
    private String login;
    private String password;

}

