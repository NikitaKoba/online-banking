package com.bank.onlinebanking.repository;

import com.bank.onlinebanking.entity.Auth;
import com.bank.onlinebanking.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthRepositroy extends CrudRepository<Auth,Long> {
    public Auth findAllByLogin(String login);


    Auth findAllByLoginAndPassword(String login,String password);

    Auth findAllByPassword(String password);






    /*Auth findById(Long id,String login,String password);*/
    /*public User getByClientid(Long id);*/



}
