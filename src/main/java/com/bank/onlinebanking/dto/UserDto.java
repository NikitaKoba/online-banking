package com.bank.onlinebanking.dto;

import com.bank.onlinebanking.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long clientid;
    private String firstname;
    private String lastname;
    private String surname;
    private String email;
    private BigDecimal balance;
    private String phone;
    private String login;
    private String password;

    }

