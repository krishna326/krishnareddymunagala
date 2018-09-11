package com.order;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
class ProductDbStore {
	private List<Product> product = new ArrayList<Product>();
	public ProductDbStore()
	{
		product.add(new Product(101,"chicken wings", 15, 8));
		product.add(new Product(102,"chicken nuggets", 10,15 ));
		product.add(new Product(103,"chicken teriyaki", 16, 8));
		product.add(new Product(104,"chicken barbecue", 20, 10));

	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Product product()
	{
		for(Product product1:product)
		{
			System.out.println(product1);
			return product1;
		}

		return null;

	}
	


}



