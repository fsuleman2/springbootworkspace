package com.pms.service;

import com.pms.model.Payment;

public interface PaymentService {
	public Payment makePayment(int orderId);
}
