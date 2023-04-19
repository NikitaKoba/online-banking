package com.bank.onlinebanking.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "senderid", referencedColumnName = "clientid")
    private User senderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiverid", referencedColumnName = "clientid")
    private User receiverId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "datetime")
    private LocalDateTime dateTime;

    // геттеры и сеттеры
}
