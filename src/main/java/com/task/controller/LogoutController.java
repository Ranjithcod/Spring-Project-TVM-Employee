package com.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.entity.UseersLogOutInformation;
import com.task.service.LogoutService;

@RestController
public class LogoutController {

	@Autowired
	private LogoutService logoutservice;

	@PostMapping("/logout")
	public UseersLogOutInformation log(@RequestBody UseersLogOutInformation userlogout) {
		return logoutservice.logoutmethod(userlogout);
	}
}
