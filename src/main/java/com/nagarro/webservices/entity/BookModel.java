/**
 * 
 */
package com.nagarro.webservices.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class is use for model the book entity
 * 
 * @author ravikumar05
 *
 */

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity

public class BookModel {
	
	@Id
	private int bookcode;
	private String bookname;
	private String author;
	private String date;

	/**
	 * 
	 */
	public BookModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param bookname
	 * @param author
	 */
	public BookModel(String bookname, String author) {
		super();
		this.bookname = bookname;
		this.author = author;
	}

	/**
	 * 
	 * @param bookcode
	 * @param bookname
	 * @param author
	 * @param date
	 */
	public BookModel(int bookcode, String bookname, String author, String date) {
		super();
		this.bookcode = bookcode;
		this.bookname = bookname;
		this.author = author;
		this.date = date;
	}

	/**
	 * @param bookcode
	 * @param bookname
	 * @param author
	 */
	public BookModel(int bookcode, String bookname, String author) {
		super();
		this.bookcode = bookcode;
		this.bookname = bookname;
		this.author = author;
	}

	/**
	 * @return the bookcode
	 */
	public int getBookcode() {
		return bookcode;
	}

	/**
	 * @param bookcode the bookcode to set
	 */
	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	/**
	 * @return the bookname
	 */
	public String getBookname() {
		return bookname;
	}
	
	
	/**
	 * @param bookname the bookname to set
	 */
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BookModel [bookcode=" + bookcode + ", bookname=" + bookname + ", author=" + author + ", date=" + date
				+ "]";
	}

}
