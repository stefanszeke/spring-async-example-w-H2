package com.example.springasync.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springasync.config.MyUtil;
import com.example.springasync.model.User;
import com.example.springasync.service.UserService;
import com.github.javafaker.Faker;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/async/{usersToCreate}")
  public void saveUsers(@PathVariable int usersToCreate) {
    System.out.println();

    List<User> users = new ArrayList<>();

    for (int i = 0; i < usersToCreate; i++) {
      users.add(new User(MyUtil.faker().name().fullName()));
    }

    users.forEach(user -> userService.saveUser(user));
  }

}
