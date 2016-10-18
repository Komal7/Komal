package com.spring.pojos;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGISTRATION")
public class Registration implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "REGID", length = 10)
	private int Id;

	@Column(name = "FIRSTNAME", length = 15)
	private String firstname;

	@Column(name = "LASTNAME", length = 15)
	private String lastname;

	@Column(name = "GENDER", length = 10)
	private String gender;

	@Column(name = "DATEOFBIRTH", length = 15)
	private String dateofBirth;

	@Column(name = "CONTACT_NO", length = 15)
	private String contact_no;

	@Column(name = "EMAIL", length = 20)
	private String email;

	@Column(name = "PASSWORD", length = 20)
	private String password;


	public Registration() {

	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}


	public String getContact_no() {
		return contact_no;
	}


	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Registration [Id=" + Id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", dateofBirth=" + dateofBirth + ", contact_no=" + contact_no + ", email=" + email + ", password=" + password + "]";
	}

	
}
