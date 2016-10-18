package com.spring.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;





import com.spring.pojos.Books;
import com.spring.pojos.Users;
import com.spring.services.BookService;
import com.spring.services.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	@Autowired
	private BookService service1;

	@RequestMapping("/showLogin")
	public ModelAndView showLogin() 
	
	{
		System.out.println("inside showLogin");
		ModelAndView mav;
		Users command = new Users();
		mav = new ModelAndView("login", "validate", command);
		return mav;
	}
	
	@RequestMapping("/validateStudent")
	public String validate(Users user,HttpSession session){
		System.out.println("inside validateStudent");
		System.out.println(user.toString());
		System.out.println(user.getEmail());
		String str=service.validate(user);
		session.setAttribute("email", user.getEmail());
		//session.setAttribute("firstname", user.getFirstname());
		//session.setAttribute("lastname", user.getLastname());
		
		List<Books> books=service1.getBooks();		
		session.setAttribute("books",books);
		for(Books str1: books)
		{
			System.out.println(str1);
			System.out.println(str1.getBookname()+str1.getBookimage());
		}
		//session.setAttribute("password",registration.getPassword());
		if(str.equals("s"))
		{
			/*List<Books> books=service1.getBooks();		
			session.setAttribute("books",books);
			for(Books str1: books)
			{
				System.out.println(str1);
			}*/
			return "welocme";	
		}
			
		else
			return "error";
			
	}
	
	@RequestMapping("/registration")
	public ModelAndView showRegistration()
	{
		System.out.println("inside registration");
		ModelAndView mav;
		Users command = new Users();
		mav = new ModelAndView("RegistrationForm", "command", command);
		return mav;
	}
	
	@RequestMapping("/registerStudent")
	public String RegisterStudent(Users user, HttpSession session) {
		System.out.println("inside registerStudent");
		System.out.println(user.toString() + user.getEmail() +user.getContactno()+user.getDateofbirth());
		if (service.RegisterStudent(user)) {
			return "login";
		}
		return null;
	}
}
