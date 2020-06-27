package com.t_books.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String IndexPage() {
        return "<h1>It works! ?? ~~  ????</h1>";
    }
}
