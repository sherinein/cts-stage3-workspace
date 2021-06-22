package com.cts.hibernate;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.hibernate.entity.Customer;
import com.cts.hibernate.entity.ShippingAddress;
import com.cts.hibernate.service.CustomerService;
import com.cts.hibernate.service.CustomerServiceImpl;



@SpringBootApplication
public class AssociationBidirectionalOnetooneApplication {
	private static CustomerService customerService;
	private static final Logger LOGGER=LoggerFactory.getLogger(AssociationBidirectionalOnetooneApplication.class);

	public static void main(String[] args) {
		LOGGER.info("inside main");
		ApplicationContext context=	SpringApplication.run(AssociationBidirectionalOnetooneApplication.class, args);
		customerService=context.getBean(CustomerServiceImpl.class);

		Customer customer = new Customer();
		customer.setCustomerName("Antony");
		customer.setEmail("tony@gmail.com");
		customer.setMobileNumber("9083878334");
		ShippingAddress address = new ShippingAddress();
		address.setDoorno("12B");
		address.setStreetName("4th Street, Kodambakkam");
		address.setCity("Chennai");
		address.setState("Tamil Nadu");
		customer.setShippingAddress(address);
		customerService.save(customer);
		 
		 
		
		List<Customer> customers=customerService.findAll();
		Iterator<Customer> iterator=customers.iterator();
		while(iterator.hasNext()) {
			Customer customer1=iterator.next();
			ShippingAddress address1=customer1.getShippingAddress();
			System.out.println(customer1.getCustomerName() + " "+ address1.getCity());
		}
		
	}

}
