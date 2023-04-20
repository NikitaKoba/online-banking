package com.bank.onlinebanking.repository;



import com.bank.onlinebanking.dto.UserDto;
import com.bank.onlinebanking.entity.Auth;
import com.bank.onlinebanking.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    public User findAllByEmail(String email);
    public User findAllByPhoneNumber(String phone);

    public User getByClientid(Long id);





}
