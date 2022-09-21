/**
 * 
 */
package com.nagarro.webservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nagarro.webservices.dao.IBookDao;
import com.nagarro.webservices.entity.BookModel;

/**
 * @author ravikumar05
 *
 */
@Service
public class BookServiceImp implements IBookService {

	@Autowired
	private IBookDao bookDao;

	@Override
	public List<BookModel> getBooks() {
		return bookDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public BookModel getBookById(Integer bookcode) {
		BookModel singlebook = null;
		try {
			singlebook = bookDao.getOne(bookcode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return singlebook;
	}

	@Override
	public BookModel addBook(BookModel book) {
		bookDao.save(book);
		return book;
	}

	@Override
	public BookModel updateBookDetails(BookModel book) {
		bookDao.save(book);
		return book;
	}

	@Override
	public void deleteBook(Integer parseInt) {
		BookModel bookentity = bookDao.getOne(parseInt);
		bookDao.delete(bookentity);
	}
}
