/**
 * 
 */
package com.nagarro.webservices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nagarro.webservices.entity.BookModel;
import com.nagarro.webservices.services.IBookService;

/**
 * This class is use for as a Book Controller
 * 
 * @author ravikumar05
 *
 */
@RestController
public class BookController {

	@Autowired
	private IBookService bookService;

	/**
	 * Get the all book listed
	 * 
	 * @return get
	 */
	@GetMapping("/books")
	public ResponseEntity<List<BookModel>> getBooks() {
		List<BookModel> list = this.bookService.getBooks();
		if(list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}

	/**
	 * Get the book by id
	 * 
	 * @param bookcode
	 * @return
	 */
	
	@GetMapping("/books/{bookcode}")
	public ResponseEntity<BookModel> getBookById(@PathVariable int bookcode) {
		BookModel bookmodel = bookService.getBookById(bookcode);
		if(bookmodel == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(bookmodel));
	}

	/**
	 * Add the book
	 * 
	 * @param book
	 * @return
	 */
	@PostMapping("/books")
	public BookModel addBook(@RequestBody BookModel book) {
		return this.bookService.addBook(book);
	}

	/**
	 * Update book details
	 * 
	 * @param book
	 * @return
	 */
	@PutMapping("/books")
	public BookModel updateBookDetails(@RequestBody BookModel book) {
		return this.bookService.updateBookDetails(book);
	}

	@DeleteMapping("/books/{bookcode}")
	public ResponseEntity<HttpStatus> deleteBook(@PathVariable int bookcode) {
		System.out.println("bookcode"+bookcode);
		try {
			this.bookService.deleteBook(bookcode);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
