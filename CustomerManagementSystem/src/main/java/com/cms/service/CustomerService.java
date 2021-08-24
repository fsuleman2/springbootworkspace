package com.cms.service;

import java.util.List;
import java.util.Optional;

import com.cms.model.Customer;
import com.cms.model.User;

public interface CustomerService {
	public Customer createCustomer(Customer customer);
	public List<Customer> getCustomers();
	public Optional<Customer> getCustomerById(int cId); 
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(int cId);
	public User getUser(int uid);
	

}
