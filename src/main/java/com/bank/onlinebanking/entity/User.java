package com.bank.onlinebanking.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
@Builder
@Data
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientid;

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "surname")
    private String surName;
    @Column
    private String email;

    @Column(name = "phone")
    private String phoneNumber;

    @Column
    private BigDecimal balance;

    @JsonIgnore
    @Column
    private String login;

    @JsonIgnore
    @Column
    private String password;

}
