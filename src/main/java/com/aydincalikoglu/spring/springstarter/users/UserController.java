package com.aydincalikoglu.spring.springstarter.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(method = RequestMethod.GET,value = "/users")
    List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    User getUser(@PathVariable int id)
    {
        return userService.getUser(id);
    }


    @RequestMapping(value = "/users",method = RequestMethod.POST)
    void addUser(@RequestBody User user)
    {
        userService.addUpdateUser(user);
    }

    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    void updateUser(@RequestBody User user)
    {
        userService.addUpdateUser(user);
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    void deleteUser(@PathVariable int id)
    {
        userService.deleteUser(id);
    }
}
