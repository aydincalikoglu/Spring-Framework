package com.aydincalikoglu.spring.springstarter.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;


    List<User> getAllUsers()
    {
        return (List<User>) userRepo.findAll();
    }

    User getUser(int id)
    {
        return userRepo.findById(id).get();
    }


    void addUpdateUser(User user)
    {
        userRepo.save(user);
    }

    void deleteUser(int id)
    {
        userRepo.deleteById(id);
    }
}
