package com.yourcompany.teste.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Product {
	
	@Id
	@Column(length=9)
	int number;
	
	@Required
	@Column(length=50)
	String description;
	
	@ManyToOne
	(fetch=FetchType.LAZY,
	optional=true)
	@DescriptionsList
	Categoria categoria;
}
