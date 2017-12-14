package com.pb.exam.service.impl;

import java.util.List;

import com.pb.exam.common.Page;
import com.pb.exam.dao.BookInfoDao;
import com.pb.exam.dao.impl.BookInfoDaoImpl;
import com.pb.exam.entity.BookInfo;
import com.pb.exam.service.BookInfoService;



public class BookInfoServiceImpl implements BookInfoService {
	private BookInfoDao dao = new BookInfoDaoImpl();
	/**
	 * 通过id查找数据
	 */
	public BookInfo findById(int id) {
		BookInfo bookInfo = dao.findById(id);
		return bookInfo;
	}
	/**
	 * 查询所有图书信息
	 * @return
	 */
	public List<BookInfo> findAllBookInfo() {
		List<BookInfo> list = dao.findAll();
		return list;
	}
	/**
	 * 增加图书信息
	 */
	public boolean addBookInfo(BookInfo bookInfo) {
		dao.save(bookInfo);
		return true;
	}
	/**
	 * 修改图书信息
	 */
	public boolean updateBookInfo(BookInfo bookInfo) {
		dao.update(bookInfo);
		return true;
	}
	/**
	 * 删除图书信息
	 */
	public boolean deleteBookInfo(BookInfo bookInfo) {
		dao.delete(bookInfo);
		return true;
	}
	/** *//**
	 * 分页查询
	 * @param page 当前第几页
	 * @param pageSize 每页大小
	 * @return 封闭了分页信息(包括记录集list)的Bean
	 */
	public Page queryForPage(int pageSize, int page) {
		final String hql = "from BookInfo ";//查询语句
		int allRow = dao.getAllRowCount(hql);//总记录数
		int totalPage = Page.countTotalPage(pageSize, allRow);//总页数
		final int offset = Page.countOffset(pageSize, page);//当前页开始记录
		final int length = pageSize;//每页记录数
		final int currentPage = Page.countCurrentPage(page);
		List<BookInfo> list = dao.queryForPage(hql,offset, length);//"一页"的记录

		//把分页信息保存到Bean中
		Page pages = new Page();
		pages.setPageSize(pageSize);
		pages.setCurrentPage(currentPage);
		pages.setAllRow(allRow);
		pages.setTotalPage(totalPage);
		pages.setList(list);
		pages.init();
		return pages;
	}
	
	/**
	 * 模糊查询
	 */
	public List<BookInfo> findByType(String name) {
		String hql="from BookInfo where bookType=(select id from BookType where typeName=?)";
		List<BookInfo> list=dao.findByHql(hql, name);
		return list;
	}
	
	
	public BookInfoDao getDao() {
		return dao;
	}
	public void setDao(BookInfoDao dao) {
		this.dao = dao;
	}
	

	
	
}
