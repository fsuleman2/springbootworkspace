package com.ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
