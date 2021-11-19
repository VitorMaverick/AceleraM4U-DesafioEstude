package com.example.estude.controller;

import com.example.estude.model.Student;
import com.example.estude.model.User;
import com.example.estude.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> list(String username){
            return userService.all();

    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user, UriComponentsBuilder builder) {
        Optional<User> optional = userService.findById(user.getIdUser());

        if(optional.isPresent()) {
            User savedUser = userService.save(user);
            final URI uri = builder.path("/students/{id}").buildAndExpand(savedUser.getIdUser()).toUri();
            return ResponseEntity.created(uri).body(savedUser);
        }

        return ResponseEntity.notFound().build();
    }
}
