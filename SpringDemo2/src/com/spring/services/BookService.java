package com.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.daos.BookDao;
import com.spring.pojos.Books;

@Service
public class BookService {
	@Autowired
	private BookDao dao;
	public List<Books> getBooks() {
		System.out.println("inside getquestions service");
		try {
			List<Books> bookList = dao.getBooks();
			if(bookList !=null )
				return bookList ;
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}