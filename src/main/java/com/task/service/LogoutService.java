package com.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.entity.UseersLogOutInformation;
import com.task.repository.UserLogOutRepository;

@Service
public class LogoutService {
	
	@Autowired
	private UserLogOutRepository logoutrepository;

	public UseersLogOutInformation logoutmethod(UseersLogOutInformation userlogout) {
		
		return logoutrepository.save(userlogout);
	}

	

}
