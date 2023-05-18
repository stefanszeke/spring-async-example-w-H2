package com.example.springasync.service;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.springasync.config.MyUtil;
import com.example.springasync.model.User;
import com.example.springasync.repository.UserRepository;


import lombok.AllArgsConstructor;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;


  @Async("threadPoolTaskExecutorA")
  public void saveUser(User user) {
    Thread thread = Thread.currentThread(); 
    System.out.println("[saving]: "+ user.getFullname() +" - Thread: " + thread.getName());

    MyUtil.SleepFor(3);

    System.out.println(" -> user: "+ user.getFullname() +" saved");
    userRepository.save(user);
  }

  
}
