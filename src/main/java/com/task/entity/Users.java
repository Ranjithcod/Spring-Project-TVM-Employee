package com.task.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	private String userfirstname;
	private String usersecondname;
	private String useremail;
	private String userphone;

	@OneToMany(targetEntity = UsersAddress.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "usersid")
	private List<UsersAddress> usersAddress;

	@OneToMany(targetEntity = UsersAsset.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "users_id")
	private List<UsersAsset> usersAsset;

	@OneToMany(targetEntity = UsersEducation.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<UsersEducation> usersEducation;

	@OneToMany(targetEntity = EmployeeProjectDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private List<EmployeeProjectDetails> employeeprojectdetails;

	@OneToMany(targetEntity = EmployeeTechnolgyDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private List<EmployeeTechnolgyDetails> employeetechnologydetails;

	public List<EmployeeTechnolgyDetails> getEmployeetechnologydetails() {
		return employeetechnologydetails;
	}

	public void setEmployeetechnologydetails(List<EmployeeTechnolgyDetails> employeetechnologydetails) {
		this.employeetechnologydetails = employeetechnologydetails;
	}

	public List<EmployeeProjectDetails> getEmployeeprojectdetails() {
		return employeeprojectdetails;
	}

	public void setEmployeeprojectdetails(List<EmployeeProjectDetails> employeeprojectdetails) {
		this.employeeprojectdetails = employeeprojectdetails;
	}

	public List<UsersAddress> getUsersAddress() {
		return usersAddress;
	}

	public void setUsersAddress(List<UsersAddress> usersAddress) {
		this.usersAddress = usersAddress;
	}

	public List<UsersAsset> getUsersAsset() {
		return usersAsset;
	}

	public void setUsersAsset(List<UsersAsset> usersAsset) {
		this.usersAsset = usersAsset;
	}

	public List<UsersEducation> getUsersEducation() {
		return usersEducation;
	}

	public void setUsersEducation(List<UsersEducation> usersEducation) {
		this.usersEducation = usersEducation;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUserfirstname() {
		return userfirstname;
	}

	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}

	public String getUsersecondname() {
		return usersecondname;
	}

	public void setUsersecondname(String usersecondname) {
		this.usersecondname = usersecondname;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

}
