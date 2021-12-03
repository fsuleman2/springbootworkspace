package com.oms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.model.Order;
import com.oms.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	public OrderServiceImpl(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}
	@Override
	public Order createOrder(Order order) {
		return orderRepository.save(order) ;
	}
	@Override
	public Order getOrderById(int orderId) {
		return orderRepository.findById(orderId).get();
	}

}
