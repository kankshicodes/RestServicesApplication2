/**
 * 
 */
package com.nagarro.webservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nagarro.webservices.entity.BookModel;

/**
 * This class is use for Data Access Object for book entity
 * 
 * @author ravikumar05
 *
 */
public interface IBookDao extends JpaRepository<BookModel, Integer> {

	List<BookModel> findAll();

}
