package com.spring.service;

import com.spring.model.ProductOrder;

public interface OrderService {

	public void sendOrderConfirmation(ProductOrder productOrder);
	
}
