package com.app.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.model.User;

@Service
public class UserService {

	@Autowired
	UserDao dao;
	@Transactional
	public void save(User person) {
		
		dao.save(person);
	}
	@Transactional
	public User login(User user) {

		User u=dao.findByName(user.getUserName(),user.getPassword());
		return u;
		
	}
	
}
