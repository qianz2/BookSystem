package com.pb.exam.service.impl;

import java.util.List;

import com.pb.exam.dao.BookTypeDao;
import com.pb.exam.dao.impl.BookTypeDaoImpl;
import com.pb.exam.entity.BookType;
import com.pb.exam.service.BookTypeService;

public class BookTypeServiceImpl implements BookTypeService {
	private BookTypeDao dao = new BookTypeDaoImpl();
	/**
	 * 查询所有图书分类信息
	 */
	public List<BookType> findAllBt() {
		List<BookType> list = dao.findAll();
		return list;
	}
	
	public BookTypeDao getDao() {
		return dao;
	}
	public void setDao(BookTypeDao dao) {
		this.dao = dao;
	}
	
}
