package com.bank.onlinebanking.repository;



import com.bank.onlinebanking.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public User findAllByLogin(String login);

    public User findAllByEmail(String email);
    public User findAllByPhoneNumber(String phone);

}
