package com.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.model.Payment;
import com.pms.service.PaymentService;
@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/payment/doPayment/{oId}")
	public Payment makePayment(@PathVariable("oId") int orderId) {
		return paymentService.makePayment(orderId) ;
	}
}
