package com.task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UsersEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationid;
	private String higherqualification;
	private String percentage;
	private String universityname;
	public Integer getEducationid() {
		return educationid;
	}
	public void setEducationid(Integer educationid) {
		this.educationid = educationid;
	}
	public String getHigherqualification() {
		return higherqualification;
	}
	public void setHigherqualification(String higherqualification) {
		this.higherqualification = higherqualification;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getUniversityname() {
		return universityname;
	}
	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}
	
	
	
	
	
}
