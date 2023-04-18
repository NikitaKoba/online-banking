package com.bank.onlinebanking.entity;

import com.bank.onlinebanking.dto.UserDto;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "authentication")
public class Authentication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;
}