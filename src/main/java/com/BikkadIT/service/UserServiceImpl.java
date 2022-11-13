package com.BikkadIT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.entity.User;
import com.BikkadIT.repository.UserRepository;
@Service
public class UserServiceImpl implements UserServiceI {
@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		
		User user1 = userRepository.save(user);

		return user1;
	}

}
