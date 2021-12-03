package com.cms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.model.Customer;
import com.cms.service.CustomerService;

@RestController
public class CustomerController {
	
	private CustomerService csi;
	@Autowired
	public CustomerController(CustomerService csi) {
		super();
		this.csi = csi;
	}
	@PostMapping("/customer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		ResponseEntity<Customer> re=new ResponseEntity<>(csi.createCustomer(customer),HttpStatus.CREATED);
		return re; 
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomer(){ 
		return csi.getCustomers();
	}
	@GetMapping("/customer/{custId}")
	public Customer getCustomerById(@PathVariable("custId") int cId){
		Optional<Customer> cust = csi.getCustomerById(cId);
		return cust.get();
	}
	@PutMapping("/customer/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return csi.updateCustomer(customer);
	}
	
	@DeleteMapping(value="/customer/delete/{custId}")
	public String deleteCustomer(@PathVariable("custId") int cId) {
		csi.deleteCustomer(cId);
		if(csi.getCustomerById(cId).isPresent()) {
			return "The customer is not deleted";
			
		}
		return "The customer details got deleted";
	}
	@PutMapping(value="/customer/deposit/{customerId}/{amount}")
	public Customer customerDeposit(@PathVariable("customerId") int cId,
			@PathVariable long amount) {
		return csi.updateBalance(cId,amount);
	}
	
	
	
}
