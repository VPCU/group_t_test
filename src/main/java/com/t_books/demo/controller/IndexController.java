package com.t_books.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String userLogin() {
		//System.out.println("userLogin.do");
		return "login";
	}
}
