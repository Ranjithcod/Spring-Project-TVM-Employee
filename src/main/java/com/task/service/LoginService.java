package com.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.entity.UsersLoginInformation;
import com.task.repository.UsersLoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private UsersLoginRepository usersLoginRepository;

	public UsersLoginInformation postLogin(UsersLoginInformation userlogin) {
		
		return usersLoginRepository.save(userlogin);
	}

}
