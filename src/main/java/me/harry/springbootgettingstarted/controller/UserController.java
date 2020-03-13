package me.harry.springbootgettingstarted.controller;

import me.harry.springbootgettingstarted.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }
}
