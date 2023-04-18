package com.bank.onlinebanking.dto;

import lombok.Data;

@Data
public class AuthenticationDto {
    private Long userId;
    private String login;
    private String password;
}
