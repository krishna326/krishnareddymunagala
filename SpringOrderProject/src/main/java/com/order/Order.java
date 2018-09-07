package com.order;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Order {
	
	private int orderId;
	private int orderQuantity;
	private int ProductId;
	
	public Order(int orderId, int orderQuantity, int productId) {
		super();
		this.orderId = orderId;
		this.orderQuantity = orderQuantity;
		ProductId = productId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ProductId;
		result = prime * result + orderId;
		result = prime * result + orderQuantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (ProductId != other.ProductId)
			return false;
		if (orderId != other.orderId)
			return false;
		if (orderQuantity != other.orderQuantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderQuantity=" + orderQuantity + ", ProductId=" + ProductId + "]";
	}
		
}
	 
	
	