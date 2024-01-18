package com.task.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.entity.Users;
import com.task.service.UsersService;


@RestController
@RequestMapping("user")
public class UsersController {

	@Autowired
	private UsersService usersService;

	@PostMapping("/postData")
	public Users postMethod(@RequestBody Users users) {
		return usersService.getPostData(users);
	}

	@GetMapping("/getData/{userid}")
	public Optional<Users> getMethod(@PathVariable("userid") Integer i) {
		return usersService.getGetData(i);
	}

	@PostMapping("/projectDetails")
	public Users getProjectDetails(@RequestBody Users us) {
		return usersService.getDataFromProject(us);
	}

	@PostMapping("/techDetails")
	public Users getTechDetails(@RequestBody Users user) {
		return usersService.getStoretechDetails(user);
	}

	@GetMapping("/getDetails/{userid}")
	public Optional<Users> getDataDetails(@PathVariable("userid") Integer u) {
		return usersService.getDetails(u);
	}
	
	@GetMapping("/getAddressDetails/{addressid}")
	public Optional<Users> getAddress(@PathVariable("addressid") Integer i)
	{
		return usersService.geti(i);
	}
	
	@GetMapping("/getUserAddress/{userid}")
	public List<Users> getUsersAddresses(@PathVariable("userid") Integer inte)
	{
		return usersService.getUsersAddressDetails(inte);
	}
	
	@GetMapping("/getUserName/{userfirstname}")
	public List<Users> getUsersNames(@PathVariable("userfirstname") String st)
	{
		return usersService.findUsersName(st);
	}
	
	@GetMapping("/getByTechName/{techname}")
	public List<Users> getByName(@PathVariable("techname") String str)
	{
		return usersService.findByUsersName(str);
	}
	
	@PutMapping("/updateData/{userid}")
	public Users getUpdateMethod1(@PathVariable("userid") Integer integer,@RequestBody Users users)
	{
		return usersService.getUpdateData(integer,users);
	}
	
	@GetMapping("/getProjectId/{projectid}")
	public List<Users> getProjectNameMethod(@PathVariable("projectid") Integer i)
	{
		return usersService.getProjectData(i);
	}
	
	@GetMapping("/getByProjectName/{projectname}")
	public List<Users> getMethodName(@PathVariable("projectname") String str) {
		return usersService.getByProjectData(str);
	}
	
	
}
