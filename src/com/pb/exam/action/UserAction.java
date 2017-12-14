package com.pb.exam.action;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.pb.exam.entity.Users;
import com.pb.exam.service.UserService;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private Users users;
	private String userCode;
	private String password;
	private String repassword;
	private String gender;
	private String email;
	
	/**
	 * 增加用户
	 */
	public String addUser(){
		java.util.Date day = new java.util.Date();
		users.setRegisterTime(new Date(day.getTime()));
		users.setLastLogintime(new Date(day.getTime()));
		if(userService.addUser(users)==true){
			return SUCCESS;
		}
		return ERROR;
	}
	/**
	 * 实现登录功能
	 */
	public String getUserLogin(){
		users=userService.getUserLogin(userCode,password);
		if (users==null) {
			return ERROR;
		}
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("userCode", users.getUserCode());
		return "login";
	}
	
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
