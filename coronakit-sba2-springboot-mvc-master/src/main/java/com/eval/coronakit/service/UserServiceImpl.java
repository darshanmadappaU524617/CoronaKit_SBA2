package com.eval.coronakit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eval.coronakit.dao.UserRepository;
import com.eval.coronakit.entity.User;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;
	@Override
	public User getUserDetails(String username) {
		// TODO Auto-generated method stub
		return repo.findByUsername(username);
	}

}
