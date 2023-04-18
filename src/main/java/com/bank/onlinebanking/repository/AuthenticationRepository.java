package com.bank.onlinebanking.repository;

import com.bank.onlinebanking.entity.Authentication;
import org.springframework.data.repository.CrudRepository;

public interface AuthenticationRepository extends CrudRepository<Authentication,Long> {
}
