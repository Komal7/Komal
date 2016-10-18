package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.pojos.Books;
import com.spring.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	/*@RequestMapping("/javatest")
	public ModelAndView showRegistration()

	{
		System.out.println("inside javatest");
		ModelAndView mav;
		JavaTestPojo command = new JavaTestPojo();
		mav = new ModelAndView("java_test", "command", command);
		return mav;
	}*/
	
	@RequestMapping("/getBooks")
	public @ResponseBody List<Books> getBooks(){
		List<Books> bookList = null;
		System.out.println("inside getquestions");

		try {
			bookList = service.getBooks();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
		
	}
     
}
