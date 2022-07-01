package com.ttn.bootcamp.restfulwebservices.controller;

import com.ttn.bootcamp.restfulwebservices.domain.User;
import com.ttn.bootcamp.restfulwebservices.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserDaoService userDaoService;

    @GetMapping(path = "/users")
    public List<User> retrieveAllUser() {
        return userDaoService.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User retrieveUserById(@PathVariable long id){
        return userDaoService.findByUserId(id);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User savedUser = userDaoService.saveUser(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
