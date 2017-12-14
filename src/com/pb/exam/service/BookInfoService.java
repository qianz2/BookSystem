package com.pb.exam.service;

import java.util.List;

import com.pb.exam.common.Page;
import com.pb.exam.entity.BookInfo;

public interface BookInfoService {
	/**
	 * 通过id查找数据
	 */
	BookInfo findById(int id);
	/**
	 * 查询所有图书信息
	 * @return
	 */
	List<BookInfo> findAllBookInfo();
	/**
	 * 增加图书信息
	 */
	boolean addBookInfo(BookInfo bookInfo);

	/**
	 * 修改图书信息
	 */
	boolean updateBookInfo(BookInfo bookInfo);
	/**
	 * 删除图书信息
	 */
	boolean deleteBookInfo(BookInfo bookInfo);

	/** *//**
	 * 分页查询
	 * @param page 当前第几页
	 * @param pageSize 每页大小
	 * @return 封闭了分页信息(包括记录集list)的Bean
	 */
	public Page queryForPage(int pageSize,int page);
	/**
	 * 模糊查询
	 */
	List<BookInfo> findByType(String name);
}
