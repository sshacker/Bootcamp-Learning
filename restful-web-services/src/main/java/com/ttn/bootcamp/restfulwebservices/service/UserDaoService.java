package com.ttn.bootcamp.restfulwebservices.service;

import com.ttn.bootcamp.restfulwebservices.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static  int usersCount = 3;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));
    }

    // findAll
    public List<User> findAll () {
        return users;
    }

    //save
    public User saveUser(User user){
        if(user.getId() == 0) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    // findOneUser
    public User findByUserId(long id) {
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
