package com.spring.pojos;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="BOOKS")
//@NamedQuery(name="Book.findAll", query="SELECT b FROM Book b")
public class Books {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookid;

	private String author;

	private String bookname;

	private String category;

	private BigDecimal price;

	private BigDecimal quantity;
	
	private String bookimage;

/*	//bi-directional many-to-one association to Order
	@OneToOne(mappedBy="book")
	private List<Orders> orders;*/

	public void Book() {
	}

	public long getBookid() {
		return this.bookid;
	}

	public void setBookid(long bookid) {
		this.bookid = bookid;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookname() {
		return this.bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	

	public String getBookimage() {
		return bookimage;
	}

	public void setBookimage(String bookimage) {
		this.bookimage = bookimage;
	}

	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", author=" + author + ", bookname="
				+ bookname + ", category=" + category + ", price=" + price
				+ ", quantity=" + quantity + ", bookimage=" + bookimage + "]";
	}

	
	
/*	public List<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Orders addOrder(Orders orders) {
		getOrders().add(orders);
		orders.setBook(this);

		return orders;
	}

	public Orders removeOrder(Orders orders) {
		getOrders().remove(orders);
		orders.setBook(null);

		return orders;
	}*/

	
}
