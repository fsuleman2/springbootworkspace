package com.oms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oms.model.Order;
import com.oms.service.OrderService;
@RestController
public class OrderController {
	@Autowired
	private OrderService os;
@PostMapping("/order")
public Order createOrder(@RequestBody Order order) {
	
	return os.createOrder(order);
}
@GetMapping("/order/{orderId}")
public Order getOrderById(@PathVariable int orderId) {
	return os.getOrderById(orderId);
}
}
