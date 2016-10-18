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

import com.spring.pojos.Books;

@Transactional
@Repository
public class BookDao {
	
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
	
	public List<Books> getBooks() {
		System.out.println("inside getquestions dao");
		@SuppressWarnings("unused")
		boolean userFound = false;
		String SQL_QUERY = "SELECT * FROM BOOKS";
		SQLQuery query = session.createSQLQuery(SQL_QUERY);
		query.addEntity(Books.class);
		@SuppressWarnings("unchecked")
		List<Books> list = query.list();
		/*for(Books str1: list)
		{
			System.out.println("inside for each");
			System.out.println(str1.toString());
		}*/
		if ((list != null) && (list.size() > 0)) {
			userFound = true;
			System.out.println(list.get(0));
			return list;
		}
		return null;

	}
}
