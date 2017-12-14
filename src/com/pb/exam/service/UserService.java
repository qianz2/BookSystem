package com.pb.exam.service;

import com.pb.exam.entity.Users;

public interface UserService {
	/**
	 * 实现登录操作
	 */
     Users getUserLogin(String userName,String psw);
     /**
 	 * 增加用户信息
 	 */
 	boolean addUser(Users user);
}
