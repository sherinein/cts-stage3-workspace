package com.cts.employee.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue
	private int empid;
	@Column(name="emp_name")
	private String empName;
	private String designation;
	private double salary;
	@Column(name="mobile_number")
	private long mobileNumber;
	private String email;
	// getter & setter 
	public Employee(String empName, String designation, double salary, long mobileNumber, String email) {
		super();
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	
}
