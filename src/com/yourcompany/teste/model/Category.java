package com.yourcompany.teste.model;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Category {
	
	@Id @Hidden @Column(length = 32)
	@GeneratedValue(generator="system-uuid") @GenericGenerator(name="system-uuid", strategy="uuid")
	private String oid;
	
	@Column(length=50)
	String description;
}
