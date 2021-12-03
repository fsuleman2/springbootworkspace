package com.ps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ps.model.Customer;
import com.ps.model.Order;
import com.ps.model.Payment;
import com.ps.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Payment makePayment(int orderId) {
		// Rest Template - > orderservice
		// RestTemplate -> CustomerService
		Payment payment = new Payment();
		Order foundOrder = restTemplate.getForObject("http://localhost:9999/order/"+orderId, Order.class);
		System.out.println(foundOrder.getOrderId());
		Customer foundCustomer = restTemplate.getForObject("http://localhost:8081/customer/" + foundOrder.getCustomerId(), Customer.class);
		Payment payment1=null;
		if (foundCustomer.getAmount() > foundOrder.getCost()) {

			payment.setCost(foundOrder.getCost());
			payment.setCustomerId(foundCustomer.getCustomerId());
			payment.setCustomerName(foundCustomer.getCustomerName());
			payment.setCustomerPhone(foundCustomer.getCustomerPhone());
			payment.setOrderId(foundOrder.getOrderId());
			payment.setProductId(foundOrder.getProductId());
			payment.setProductName(foundOrder.getProductName());
			payment.setPaymentStatus("Completed");
			payment1= paymentRepository.save(payment);
			restTemplate.put("http://localhost:8081/customer/deposit/" + foundOrder.getCustomerId()+"/"+foundOrder.getCost(), Customer.class);
		}

		return payment1;
	}
}
