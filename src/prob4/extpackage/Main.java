package prob4.extpackage;

import prob4.CustOrderFactory;
import prob4.Customer;
import prob4.Order;

import java.time.LocalDate;



public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		Order order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());

		System.out.println("--------------------------------------");
		System.out.println("Using factory");
		Customer customer = CustOrderFactory.createCustomer("Bob");
		Order orderFactory = CustOrderFactory.newOrder(customer, LocalDate.now());
		orderFactory.addItem(CustOrderFactory.newItem("Shirt").getName());
		orderFactory.addItem(CustOrderFactory.newItem("Laptop").getName());

		orderFactory = CustOrderFactory.newOrder(customer, LocalDate.now());
		orderFactory.addItem(CustOrderFactory.newItem("Pants").getName());
		orderFactory.addItem(CustOrderFactory.newItem("Knife set").getName());
		System.out.println(customer.getOrders());

	}
}

		
