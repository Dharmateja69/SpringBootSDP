package com.klef.model1;

import jakarta.persistence.*;

@Entity
@Table(name="Customer_details")
public class Customer {

	@Id//primary key = unique+not null
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
	@Column(name="Coustomer_id")
	private int id;
	@Column(name="Coustomer_name",nullable = false,length = 100)
	private String name;
	@Column(name="Coustomer_gen",nullable = false,length = 10)
	private String gen;
	@Column(name="Coustomer_dob",nullable = false,length = 10)
	private String dob;
	@Column(name="Coustomer_email",nullable = false,length = 100)
	private String email;
	@Column(name="Coustomer_pass",nullable = false,unique = true,length = 100)
	private String pass;
	@Column(name="Coustomer_loc",nullable = false,length = 100)

	private String loc;
	@Column(name="Coustomer_ctc",nullable = false,unique = true,length = 10)

	private String contacno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getContacno() {
		return contacno;
	}
	public void setContacno(String contacno) {
		this.contacno = contacno;
	}
	


	
	
	
	
}
