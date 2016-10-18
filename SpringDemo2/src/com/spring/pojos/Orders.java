package com.spring.pojos;
import java.awt.print.Book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="ORDERS")
//@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Orders {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderid;

	//bi-directional many-to-one association to Book
	@ManyToOne
	@JoinColumn(name="BOOKID")
	private Books book;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USERID")
	private Users user;

	public void Order() {
	}

	public long getOrderid() {
		return this.orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}

	public Books getBook() {
		return this.book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	public Users getUser() {
		return this.user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	

}
