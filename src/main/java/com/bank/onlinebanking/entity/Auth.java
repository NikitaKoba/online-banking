package com.bank.onlinebanking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "auth")
@AllArgsConstructor
@NoArgsConstructor
public class Auth  {
    private final static long MAX = 10000;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "userid")
    private User userid;

    private String login;
    @JsonIgnore
    private String password;

    public User getUserid() {
        return userid;
    }
}
