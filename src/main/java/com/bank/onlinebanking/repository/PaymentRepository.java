package com.bank.onlinebanking.repository;

import com.bank.onlinebanking.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
}
