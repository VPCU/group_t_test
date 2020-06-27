package com.t_books.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t_books.demo.dao.*;
import com.t_books.demo.model.*;

@Service
public class LoginClservice {
	
	
	@Autowired
	private Userdao userdao;//与dao层进行交互
	
	
	public String Chick(String uname,String password) {
		
		UserBean b=userdao.findByUnameAndPassword(uname, password);
		
		if(b==null) {
			
			return "null";
		}
		
		String aString=b.getUname();
		
		String bString=b.getPassword();
		
		if(aString.equals(uname)&&bString.equals(password)) {
			
			return "success";
		}else {
			
			return "error";
		}
		
		
	}
}
