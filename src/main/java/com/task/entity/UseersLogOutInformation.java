package com.task.entity;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class UseersLogOutInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer logoutid;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date logouttime;

	
	@Temporal(TemporalType.TIME)
	@Column(nullable = false)
	private LocalTime time;
	
	@PrePersist
	private void cre() {
		logouttime = new Date();
		time = LocalTime.now();
	}


	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;

	public Integer getLogoutid() {
		return logoutid;
	}

	public void setLogoutid(Integer logoutid) {
		this.logoutid = logoutid;
	}

	public Date getLogouttime() {
		return logouttime;
	}

	public void setLogouttime(Date logouttime) {
		this.logouttime = logouttime;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

}
