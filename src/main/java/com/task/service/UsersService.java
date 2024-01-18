package com.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.entity.Users;
import com.task.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository userRepository;

	public Users getPostData(Users users) {

		return userRepository.save(users);
	}

	public Optional<Users> getGetData(Integer i) {

		return userRepository.findById(i);
	}

	public Users getDataFromProject(Users us) {

		return userRepository.save(us);
	}

	public Users getStoretechDetails(Users user) {

		return userRepository.save(user);
	}

	public Optional<Users> getDetails(Integer u) {

		return userRepository.findById(u);
	}

	public Optional<Users> geti(Integer i) {

		return userRepository.findById(i);
	}

	public List<Users> getUsersAddressDetails(Integer inte) {

		return userRepository.getUsersAddress(inte);
	}

	public List<Users> findUsersName(String st) {

		return userRepository.getUserName(st);
	}

	public List<Users> findByUsersName(String str) {
		
		return userRepository.getUsersByTechnology(str);
	}

	public Users getUpdateData(Integer integer, Users users) {
		Optional<Users> u=userRepository.findById(integer);
		Users us=u.get();
		us.setUserfirstname(users.getUserfirstname());
		us.setUsersecondname(users.getUsersecondname());
		us.setUseremail(users.getUseremail());
		us.setUserphone(users.getUserphone());
		us.setUsersAddress(users.getUsersAddress());
		us.setUsersEducation(users.getUsersEducation());
		us.setUsersAsset(users.getUsersAsset());
		us.setEmployeeprojectdetails(users.getEmployeeprojectdetails());
		us.setEmployeetechnologydetails(users.getEmployeetechnologydetails());
		return userRepository.save(us);
	}

	public List<Users> getProjectData(Integer i) {
		
		return userRepository.getUsersByProject(i);
	}
	
	public List<Users> getByProjectData(String str)
	{
		return userRepository.getByProjectName(str);
	}
}
