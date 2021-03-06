package com.cms.service;

import java.util.List;
import java.util.Optional;

import com.cms.model.Customer;


public interface CustomerService {
	public Customer createCustomer(Customer customer);
	public List<Customer> getCustomers();
	public Optional<Customer> getCustomerById(int cId); 
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(int cId);
	public Customer updateBalance(int cId, long amount);

	

}
