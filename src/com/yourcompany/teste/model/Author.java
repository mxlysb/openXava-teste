package com.yourcompany.teste.model;

import java.util.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Author {

	@Id @Hidden @Column(length = 32)
	@GeneratedValue(generator="system-uuid") @GenericGenerator(name="system-uuid", strategy="uuid")
	private String oid;
	
	@Required
	@Column(length=50)
	String name;
	
	@OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE)
	@ListProperties("number, description, price")
	Collection<Product> products;
}
