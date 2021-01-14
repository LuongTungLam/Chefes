package com.chefes.page;

import com.chefes.page.reponsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ChefApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ChefApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}

