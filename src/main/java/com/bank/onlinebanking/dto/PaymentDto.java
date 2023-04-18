package com.bank.onlinebanking.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class PaymentDto {
    private Long id;
    private Long senderId;
    private Long receiverId;
    private Double amount;
    private LocalDateTime dateTime;

}
