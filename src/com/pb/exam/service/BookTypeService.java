package com.pb.exam.service;

import java.util.List;

import com.pb.exam.entity.BookType;

public interface BookTypeService {
	/**
	 * 获取所有图书类型信息
	 */
	List<BookType> findAllBt();
}
