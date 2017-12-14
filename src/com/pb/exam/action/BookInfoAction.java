package com.pb.exam.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.pb.exam.common.Page;
import com.pb.exam.entity.BookInfo;
import com.pb.exam.entity.BookType;
import com.pb.exam.service.BookInfoService;
import com.pb.exam.service.BookTypeService;

public class BookInfoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private BookInfoService bookInfoService;
	private int page ;
	private Page pages;
	private BookInfo bookInfo;
	private String name;
	private List<BookInfo> list;
	private int id;
	private BookTypeService bookTypeService;
	private List<BookType> typeList;
	/**
	 * 通过id获取图书
	 */
	public String findById(){
		bookInfo = bookInfoService.findById(id);
		if (bookInfo==null) {
			return ERROR;
		}
		return SUCCESS;
	}
	
	/**
	 * 分页查询
	 */
	public String findPage(){
		if (page==0) {
			page=1;
		}
		pages=bookInfoService.queryForPage(5, page);
		if (pages==null) {
			return ERROR;
		}
		typeList= bookTypeService.findAllBt();
		return "list";
	}
	
	/**
	 * 增加
	 */
	public String addBookInfo(){
		if(bookInfoService.addBookInfo(bookInfo)==true){
			return SUCCESS;
		}
		return ERROR;
	}
	/**
	 * 删除
	 */
	public String deleteBookInfo(){
		if(bookInfoService.deleteBookInfo(bookInfo)==true){
			return SUCCESS;
		}
		return ERROR;
	}
	/**
	 * 修改
	 */
	public String updateBookInfo(){
		
		bookInfoService.updateBookInfo(bookInfo);
		if(bookInfoService.updateBookInfo(bookInfo)==true){
			return SUCCESS;
		}
		return ERROR;
	}
	/**
	 * 模糊查询
	 * @return
	 */
	public String findByType(){
		list=bookInfoService.findByType(name);
		if (list==null) {
			return ERROR;
		}
		return "likeType";
	}

	
	public List<BookInfo> getList() {
		return list;
	}

	public void setList(List<BookInfo> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public BookInfoService getBookInfoService() {
		return bookInfoService;
	}
	public void setBookInfoService(BookInfoService bookInfoService) {
		this.bookInfoService = bookInfoService;
	}
	public BookInfo getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Page getPages() {
		return pages;
	}
	public void setPages(Page pages) {
		this.pages = pages;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BookTypeService getBookTypeService() {
		return bookTypeService;
	}

	public void setBookTypeService(BookTypeService bookTypeService) {
		this.bookTypeService = bookTypeService;
	}

	public List<BookType> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<BookType> typeList) {
		this.typeList = typeList;
	}
	
}
