package com.app.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.app.model.User;

public interface UserDao extends CrudRepository<User, Integer>{

	
	 @Query("SELECT p FROM User p WHERE p.UserName=:name and p.Password=:pass")
	 User findByName(@Param("name") String name,@Param("pass") String pass);
	
}
