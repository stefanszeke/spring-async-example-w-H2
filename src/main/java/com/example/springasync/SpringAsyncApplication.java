package com.example.springasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springasync.repository.UserRepository;
import com.example.springasync.service.UserService;

import lombok.AllArgsConstructor;

@SpringBootApplication
public class SpringAsyncApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringAsyncApplication.class, args);

    System.out.println("\n *** server running ***");
	}

}
