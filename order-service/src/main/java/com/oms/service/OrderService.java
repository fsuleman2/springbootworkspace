package com.oms.service;

import com.oms.model.Order;

public interface OrderService {
public Order createOrder(Order order);

public Order getOrderById(int orderId);
}
