package com.bank.onlinebanking.entity;

import com.bank.onlinebanking.dto.AdditionalUserDataDto;
import com.bank.onlinebanking.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "surname")
    private String surName;
    @Column
    private String email;

    @Column(name = "phone")
    private String phoneNumber;

    private BigDecimal balance;



}
