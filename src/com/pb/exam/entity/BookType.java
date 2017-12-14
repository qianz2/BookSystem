package com.pb.exam.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * BookType entity. @author MyEclipse Persistence Tools
 */

public class BookType implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String typeName;
	private Set<BookInfo> bookInfos = new HashSet<BookInfo>(0);

	// Constructors

	/** default constructor */
	public BookType() {
	}

	/** minimal constructor */
	public BookType(Integer id, String typeName) {
		this.id = id;
		this.typeName = typeName;
	}

	/** full constructor */
	public BookType(Integer id, String typeName, Set<BookInfo> bookInfos) {
		this.id = id;
		this.typeName = typeName;
		this.bookInfos = bookInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Set<BookInfo> getBookInfos() {
		return this.bookInfos;
	}

	public void setBookInfos(Set<BookInfo> bookInfos) {
		this.bookInfos = bookInfos;
	}

}