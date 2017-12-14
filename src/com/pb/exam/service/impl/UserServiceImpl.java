package com.pb.exam.service.impl;

import com.pb.exam.dao.UserDao;
import com.pb.exam.dao.impl.UserDaoImpl;
import com.pb.exam.entity.Users;
import com.pb.exam.service.UserService;

public class UserServiceImpl implements UserService {
	/**
	 * inversion of control 简称IOC，控制反转，降低程序耦合度，持久化类与业务层分离，接口与实现类分离
	 * 都是为了降低耦合度
	 */
	private UserDao dao = new UserDaoImpl();
	/**
 	 * 增加用户信息
 	 */
	public boolean addUser(Users user) {
		dao.save(user);
		return true;
	}
	/**
	 * 实现登录操作
	 */
	public Users getUserLogin(String userName, String psw) {
		final String hql = "from Users where USER_CODE=? and PASSWORD=?";//查询语句
		Users users = (Users) dao.uniqueResult(hql, userName,psw);
		return users;
	}
	public UserDao getDao() {
		return dao;
	}
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	
	
	


}
