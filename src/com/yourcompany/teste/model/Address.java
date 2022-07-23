package com.yourcompany.teste.model;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter @Setter
public class Address {

	@Column(length = 30)
	String street;
	
	@Column(length = 5)
	int zipCode;
	
	@Column(length = 20)
	String city;
	
	@Column(length = 30)
	String state;
}
