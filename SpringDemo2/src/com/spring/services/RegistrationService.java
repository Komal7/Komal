package com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.daos.RegistrationDao;
import com.spring.pojos.Users;

@Service
public class RegistrationService {
	
	@Autowired
	private  RegistrationDao dao;

	public String validate(Users user) {
		String success= null;
		System.out.println(user.getEmail());
		try {
			Users dbLogin = dao.checkLogin(user);
			//String str=dbLogin.getRole();
			if(dbLogin!=null && dbLogin.getPassword().equals(user.getPassword()))
				return success="s";
			else 
				return  success="f";
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return success;
	}
	
	
	
	
	public boolean RegisterStudent(Users user) {
		boolean success = false;
		try {
			System.out.println("inside service");
			dao.RegisterStudent(user);
			success = true;
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return success;
	}

}
