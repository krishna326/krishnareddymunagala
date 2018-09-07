package com.order;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
	private Product p;
	@Autowired
	 List<Order> orderList = new ArrayList<Order>();
	
	public boolean processOrder(Order order)
	{
		
		if ((order.getProductId()==p.getId() && order.getOrderQuantity()<=p.getQuantity())) {
			System.out.println("order is placd sucessfully");
			orderList.add(new Order(order.getOrderId(),order.getOrderQuantity(),order.getProductId()));
			p.setQuantity(p.getQuantity()-order.getOrderQuantity());
		    printOrderList();
		    
			
		} else {

			System.out.println("there is no sufficient quantity the order is not placed successfully");
			
		}
		return true;
		
	}
		
	
	public void printOrderList()
	{
		System.out.println(orderList);
	}

	
}
