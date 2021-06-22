package com.cts.employee;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cts.employee.entity.Employee;
import com.cts.employee.service.EmployeeService;
import com.cts.employee.service.EmployeeServiceImpl;


//@ComponentScan(basePackages = "com.cts")
@SpringBootApplication
public class SpringbootHibernateDemoApplication {
	
	private static EmployeeService employeeService;
	private static final Logger LOGGER=LoggerFactory.getLogger(SpringbootHibernateDemoApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("inside main");
		ApplicationContext context=SpringApplication.run(SpringbootHibernateDemoApplication.class, args);
		employeeService=context.getBean(EmployeeServiceImpl.class);
		// Save Employee Object 
		LOGGER.info("recieved service object from IOC container");
		//Employee employee=new Employee("Shivani","Software Trainee",40000D, 984965748545L,"manoj@gmail.com");
		//employeeService.save(employee);
		//List<Employee> listOfEmployee=employeeService.findAll();
		//listOfEmployee.stream().forEach(l->System.out.println(l.getEmpName()));
		
		List<Employee> list = employeeService.getEmployeeByDesignation("Software Trainee");
		Iterator<Employee> iterator = list.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.println(employee.getEmpid() + " " + employee.getEmpName() + " " + employee.getDesignation());
		}
		
		//employeeService.deleteById(4);
		
		// add
		
		// findAll
		// findById
		// update
		// delete
		
	}

}
