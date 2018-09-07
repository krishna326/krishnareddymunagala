package com.order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestOrder {
	
	public static void main(String[]args)
	{
	ApplicationContext context = new AnnotationConfigApplicationContext("spring-beanorder.xml");
	OrderService orderService =context.getBean(OrderService.class);
	Order order = new Order(1,2,103);
	}
}
