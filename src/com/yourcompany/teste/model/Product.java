package com.yourcompany.teste.model;

import java.math.*;

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
	Category category;
	
	@Stereotype("MONEY")
	BigDecimal price;
	
	@Stereotype("IMAGES_GALLERY")
	@Column(length = 32)
	String photos;
	
	@Stereotype("MEMO")
	String remarks;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@DescriptionsList
	Author author;
}
