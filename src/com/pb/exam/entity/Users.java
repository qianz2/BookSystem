package com.pb.exam.entity;

import java.sql.Date;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String userCode;
	private String password;
	private String email;
	private String gender;
	private Date registerTime;
	private Date lastLogintime;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(Integer userId, String userCode, String password,
			String email, String gender, Date registerTime, Date lastLogintime) {
		this.userId = userId;
		this.userCode = userCode;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.registerTime = registerTime;
		this.lastLogintime = lastLogintime;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getLastLogintime() {
		return this.lastLogintime;
	}

	public void setLastLogintime(Date lastLogintime) {
		this.lastLogintime = lastLogintime;
	}

}