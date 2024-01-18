package com.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.task.entity.UsersLoginInformation;
import com.task.service.LoginService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("login")
	public UsersLoginInformation postMethodName(@RequestBody UsersLoginInformation userlogin) {

		return loginService.postLogin(userlogin);
	}

}
