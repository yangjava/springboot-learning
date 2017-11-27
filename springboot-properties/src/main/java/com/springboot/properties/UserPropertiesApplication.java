package com.springboot.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserPropertiesApplication implements CommandLineRunner {

    @Autowired
    UserProperties userProperties;

    @Autowired
    UserProperties1 userProperties1;

    @Autowired
    RandomProperties randomProperties;

    @Autowired
    ProfileProperties profileProperties;



    public static void main(String[] args) {
        SpringApplication.run(UserPropertiesApplication.class,args);
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n" + userProperties.toString());
        System.out.println("\n" + userProperties1.toString());
        System.out.println("\n" + randomProperties.toString());
        System.out.println("\n" + profileProperties.toString());
    }
}
