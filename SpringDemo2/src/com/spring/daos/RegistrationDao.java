package com.spring.daos;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.spring.pojos.Users;

@Transactional
@Repository
public class RegistrationDao {

	
	@Autowired
	private SessionFactory factory;
	private Session session;

	@PostConstruct
	public void open() throws Exception {
		session = factory.openSession();
	}

	// close connection
	@PreDestroy
	public void close() {
		if (session != null)
			session.close();
	}

	public void RegisterStudent(Users user) {
		System.out.println("inside dao");
		//Session session = factory.getCurrentSession();
		/*Login login=new Login();
		login.setEmail(register.getEmail());
		login.setPassword(register.getPassword());
		session.save(login);*/
		session.save(user);
		session.flush();
		// transaction.commit();
		
	}
	
	public Users checkLogin(Users user) throws Exception{
		//Session session = m_sessionFactory.openSession();
		
			@SuppressWarnings("unused")
			boolean userFound = false;
			String email = user.getEmail();
			String password = user.getPassword();
			System.out.println(email+" "+password);
			String SQL_QUERY ="SELECT * FROM users r WHERE r.email='"+ email 
					+"' and r.password='"+password+"'";
			SQLQuery query = session.createSQLQuery(SQL_QUERY);
			query.addEntity(Users.class);
			@SuppressWarnings("unchecked")
			List<Users> list = query.list();
	        if ((list != null) && (list.size() > 0)) {
	            userFound= true;
	            System.out.println(list.get(0));
	            return list.get(0);
	        }
		
        return null;
    }
}
