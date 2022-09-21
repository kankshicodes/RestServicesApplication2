/**
 * 
 */
package com.nagarro.webservices.services;

import java.util.List;
import com.nagarro.webservices.entity.BookModel;

/**
 * This class is use for services interface
 * @author ravikumar05
 *
 */

public interface IBookService {

	public List<BookModel> getBooks();

	public BookModel getBookById(Integer bookcode);

	public BookModel addBook(BookModel book);

	public BookModel updateBookDetails(BookModel book);

	public void deleteBook(Integer book);
}
