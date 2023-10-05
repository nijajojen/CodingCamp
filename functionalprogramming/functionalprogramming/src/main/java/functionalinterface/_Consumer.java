package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		greetCustomer(new Customer("alfie", "4089871767"));
		
		Customer customer = new Customer("Elsa","4089871767");
		greetCustomerConsumer.accept(customer);
		System.out.println("****biconsumer***");
		greetCustomerConsumerv2.accept(customer,true);
		

	}
	
	static BiConsumer<Customer,Boolean> greetCustomerConsumerv2 = 
			(customer, showPhoneNumber) -> System.out.println("Hello " 
	+customer.customerName+ " thanks for registering phone number "
					+(showPhoneNumber?customer.customerPhoneNumber:"*********"));
	
	
	//Consumer takes one argument and returns no result
	static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " +customer.customerName+ " thanks for "
			+ "registering phone number "+ customer.customerPhoneNumber);
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hello " +customer.customerName+ " thanks for "
				+ "registering phone number "+ customer.customerPhoneNumber);
	}
	
	static class Customer{
		private final String customerName;
		private final String customerPhoneNumber;
		
		Customer(String customerName, String customerPhoneNumber){
			this.customerName= customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
		
	}

}
