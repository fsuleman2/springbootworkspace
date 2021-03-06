package com.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cms.model.Customer;
import com.cms.model.User;
import com.cms.repository.CustomerRepository;
@Service
public class CustomerServiceImplementation implements CustomerService{
	
	private CustomerRepository customerRespository;
		
	@Autowired
	public CustomerServiceImplementation(CustomerRepository customerRespository) {
		super();
		this.customerRespository = customerRespository;
	}
	public Customer createCustomer(Customer customer) {
		return customerRespository.save(customer);
	}
	@Override
	public List<Customer> getCustomers() {
		return customerRespository.findAll();
	}
	@Override
	public Optional<Customer> getCustomerById(int cId) {
		return customerRespository.findById(cId);
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRespository.save(customer);
	}
	@Override
	public void deleteCustomer(int cId) {
		customerRespository.deleteById(cId);
		
	}
	@Override
	public User getUser(int uid) {
		RestTemplate restTemplate = new RestTemplate();
		User user = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/"+uid, User.class);
		return user;
	}
	
}
