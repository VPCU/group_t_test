package com.t_books.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.t_books.demo", "com.t_books.demo.controller", "com.t_books.demo.dao","com.t_books.demo.model","com.t_books.demo.service"})
public class Demo_Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo_Application.class, args);
    }

}
