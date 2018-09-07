package com.order;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
class ProductDbStore {
	
	private List<Product> product = new ArrayList<Product>();
	private List<Order> orderList = new ArrayList<Order>();

	public ProductDbStore()
	{
	product.add(new Product(101,"chicke wings", 15, 8));
	product.add(new Product(102,"chicken nuggets", 10,15 ));
	product.add(new Product(103,"chicke teriyaki", 16, 8));
	product.add(new Product(104,"chicke barbecue", 20, 10));
	
	}

	public List<Product> getProduct() {
		return product;
	}
}
	
	

