package com.example.estude.controller;

import com.example.estude.model.User;
import com.example.estude.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public List<User> list(String username){
        if (username == null) {
            return userService.all();
        } else {
            return userService.findBy(username);
        }

    }
}
