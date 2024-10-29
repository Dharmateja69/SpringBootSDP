package com.klef.service;

import java.util.List;

import com.klef.model1.Admin;
import com.klef.model1.Customer;

public interface AdminService  {

	public List<Customer> viewalldata();
	
	public Admin checkAdminLogin(String usename,String pass);
}
