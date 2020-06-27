package com.t_books.demo.dao;

import com.t_books.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userdao extends JpaRepository<UserBean, Integer> {
	UserBean findByUnameAndPassword(String uname,String password);
}
