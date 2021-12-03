package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.model.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	public Payment findByProductName(String productName);
}
