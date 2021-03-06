package com.cms.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cms.exception.CustomerIdNotFoundException;
import com.cms.model.Customer;
import com.cms.model.User;
import com.cms.service.CustomerService;

@RestController
public class CustomerController {
	
	private CustomerService csi;
	@Autowired
	public CustomerController(CustomerService csi) {
		super();
		this.csi = csi;
	}
	@RequestMapping(value = "/customer",method = RequestMethod.POST)
	public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customer) {
		ResponseEntity<Customer> re = new ResponseEntity<>(csi.createCustomer(customer),HttpStatus.CREATED);
		return re;
	}
	@RequestMapping(value="/customers",method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> getCustomer(){
		ResponseEntity<List<Customer>> re = new ResponseEntity<>(csi.getCustomers(),HttpStatus.CREATED);
		return re;
	}
	@RequestMapping(value="/customer/{custId}",method = RequestMethod.GET)
	public ResponseEntity<?> getCustomerById(@PathVariable("custId") int cId){
		Optional<Customer> cust = csi.getCustomerById(cId);
//		if(cust.isPresent()) {
//			return new ResponseEntity<Customer>(cust.get(),HttpStatus.FOUND);
//		}
//		return new ResponseEntity<String>("The ID does not exist",HttpStatus.NOT_FOUND);
		//rewriting for exceptional handling
		if(!cust.isPresent()) {
			throw new CustomerIdNotFoundException("Id does not exist");
		}
		return new ResponseEntity<Customer>(cust.get(),HttpStatus.FOUND);
	}
	@RequestMapping(value ="/customer/update",method = RequestMethod.PUT)
	public Customer updateCustomer(@RequestBody Customer customer) {
		return csi.updateCustomer(customer);
	}
	
	@RequestMapping(value="/customer/delete/{custId}", method = RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable("custId") int cId) {
		csi.deleteCustomer(cId);
		if(csi.getCustomerById(cId).isPresent()) {
			return "The customer is not deleted";
			
		}
		return "The customer details got deleted";
	}
	@RequestMapping("/greet")
	public String greet() {
		return "Hello hii";
	}
	
	//Rest template demo
	@RequestMapping("/customer/user/{uid}")
	public User perform(@PathVariable int uid) {
		return csi.getUser(uid);
	}

}
