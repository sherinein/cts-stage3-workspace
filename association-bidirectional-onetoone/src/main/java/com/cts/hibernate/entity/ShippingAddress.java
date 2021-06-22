package com.cts.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="shipping_address")
public class ShippingAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sid")
	private int sid;
	private String doorno;
	@Column(name="street_name")
	private String streetName;
	private String city;
	private String state;
	//@JsonManagedReference
	@OneToOne(targetEntity = Customer.class, mappedBy = "shippingAddress")
	private Customer customer;

}
