package com.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pms.model.Customer;
import com.pms.model.Order;
import com.pms.model.Payment;
import com.pms.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Payment makePayment(int orderId) {
		Order foundOrder=restTemplate.getForObject("http://ORDER-SERVICE/order/"+orderId,Order.class);
		Customer foundCustomer = restTemplate.getForObject("http://CUSTOMER-SERVICE/customer/"+foundOrder.getCustomerId(),Customer.class);
		Payment payment=new Payment();
		Payment payment1=null;
		if(foundCustomer.getBalance()>foundOrder.getCost()) {
			
			payment.setCost(foundOrder.getCost());
			payment.setCustomerId(foundCustomer.getCustomerId());
			payment.setCustomerName(foundCustomer.getCustomerName());
			payment.setCustomerPhone(foundCustomer.getCustomerPhone());
			payment.setOrderId(foundOrder.getOrderId());
			payment.setProductId(foundOrder.getProductId());
			payment.setProductName(foundOrder.getProductName());
			payment.setPaymentStatus("Completed");
			payment1 = paymentRepository.save(payment);
			restTemplate.put("http://CUSTOMER-SERVICE/customer/deposit/"+foundOrder.getCustomerId()+"/"+foundOrder.getCost(),Customer.class);
			
		}
		return payment1; 
	}
	
}
