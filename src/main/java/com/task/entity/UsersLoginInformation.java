package com.task.entity;

import java.util.Date;
import jakarta.persistence.*;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.PrePersist;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;

@Entity
public class UsersLoginInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date logintime;
	
	@PrePersist //load and generated
	private void onCreate()
	{
		logintime= new Date();
	}
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users use;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}

	public Users getUse() {
		return use;
	}

	public void setUse(Users use) {
		this.use = use;
	}
	
}
	
	
	
	