package com.bank.onlinebanking.repository;

import com.bank.onlinebanking.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
