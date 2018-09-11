package com.order;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{  
	@Autowired
	private ProductDbStore dbStore;
	
    @Autowired
	List<Order> orderList = new ArrayList<Order>();

	public boolean processOrder(Order order)
	{

		if (order.getProductId()== dbStore.product().getId() && order.getOrderQuantity()<=dbStore.product().getQuantity()) {
			System.out.println("order is placd sucessfully");
			dbStore.add.product((order.getOrderId(),order.getOrderQuantity(),order.getProductId());
			dbStore.product().setQuantity(dbStore.product().getQuantity()-order.getOrderQuantity());
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
