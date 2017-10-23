package com.toricor.training.controller;

import com.toricor.training.dao.User;
import com.toricor.training.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    UserService userService;

    // 顧客全件取得
    @GetMapping
    List<User> getUsers() {
        List<User> users = userService.findAll();
        return users;
    }

    // 顧客1件取得
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    User getUser(@PathVariable Integer id) {
        User user = userService.findOne(id);
        return user;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    User postUsers(@RequestBody User user) {
        return userService.create(user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    User putUser(@PathVariable Integer id, @RequestBody User user) {
        user.setId(id);
        return userService.update(user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteUser(@PathVariable Integer id) {
        userService.delete(id);
    }
}
