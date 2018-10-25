package com.websystique.spring.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.model.CustomerInfo;
import com.websystique.spring.model.ProductOrder;
import com.websystique.spring.service.OrderService;

public class SampleEmailApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		OrderService orderService = (OrderService) context.getBean("orderService");
		orderService.sendOrderConfirmation(getDummyOrder());
		((AbstractApplicationContext) context).close();
	}
	
	public static ProductOrder getDummyOrder(){
		ProductOrder order = new ProductOrder();
		order.setOrderId("9999");
		order.setProductName("Apple MacBookPro");
		order.setStatus("confirmed");
		
		CustomerInfo customerInfo = new CustomerInfo();
		customerInfo.setName("Apple Inc.");
		customerInfo.setAddress("WallStreet");
		customerInfo.setEmail("test@gmail.com");
		order.setCustomerInfo(customerInfo);
		return order;
	}

}
