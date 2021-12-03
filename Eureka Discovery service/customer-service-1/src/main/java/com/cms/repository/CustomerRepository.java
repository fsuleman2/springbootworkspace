package com.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.model.Customer;
@Repository
public interface CustomerRepository 
extends JpaRepository<Customer, Integer> {
	//28 methods
}
