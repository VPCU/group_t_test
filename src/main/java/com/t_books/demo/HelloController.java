package com.t_books.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String IndexPage() {
        return "<h1>It works! ?? ~~</h1>";
    }
}
