package com.pb.exam.entity;

import java.sql.Date;

/**
 * BookInfo entity. @author MyEclipse Persistence Tools
 */

public class BookInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer bookId;
	private BookType bookType;
	private String bookCode;
	private String bookName;
	private String bookAuthor;
	private String publishPress;
	private Date publicDate;
	private Integer isBorrow;
	private String createby;
	private Date createTime;
	private Date lastUpdatetime;

	// Constructors

	/** default constructor */
	public BookInfo() {
	}

	/** full constructor */
	public BookInfo(Integer bookId, BookType bookType, String bookCode,
			String bookName, String bookAuthor, String publishPress,
			Date publicDate, Integer isBorrow, String createby,
			Date createTime, Date lastUpdatetime) {
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.publishPress = publishPress;
		this.publicDate = publicDate;
		this.isBorrow = isBorrow;
		this.createby = createby;
		this.createTime = createTime;
		this.lastUpdatetime = lastUpdatetime;
	}

	// Property accessors

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public BookType getBookType() {
		return this.bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public String getBookCode() {
		return this.bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return this.bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getPublishPress() {
		return this.publishPress;
	}

	public void setPublishPress(String publishPress) {
		this.publishPress = publishPress;
	}

	public Date getPublicDate() {
		return this.publicDate;
	}

	public void setPublicDate(Date publicDate) {
		this.publicDate = publicDate;
	}

	public Integer getIsBorrow() {
		return this.isBorrow;
	}

	public void setIsBorrow(Integer isBorrow) {
		this.isBorrow = isBorrow;
	}

	public String getCreateby() {
		return this.createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastUpdatetime() {
		return this.lastUpdatetime;
	}

	public void setLastUpdatetime(Date lastUpdatetime) {
		this.lastUpdatetime = lastUpdatetime;
	}

}