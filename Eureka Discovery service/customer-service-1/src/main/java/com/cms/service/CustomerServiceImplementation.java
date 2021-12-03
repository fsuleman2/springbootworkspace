package com.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cms.model.Customer;

import com.cms.repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {

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
	public Customer updateBalance(int cId, long amount) {
		// TODO Auto-generated method stub
		Customer customer = customerRespository.getById(cId);
		customer.setBalance(customer.getBalance()-amount);
		return customerRespository.save(customer);
		
	}

}
