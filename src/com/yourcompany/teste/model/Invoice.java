package com.yourcompany.teste.model;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.yourcompany.teste.calculator.*;

import lombok.*;

@Entity @Getter @Setter
@View(members = "year, number, date;" + "customer;" + "details;" + "remarks")
public class Invoice extends Identifiable {
	
	@Column(length = 4)
	@DefaultValueCalculator(CurrentYearCalculator.class)
	int year;
	
	@Column(length = 6)
	@DefaultValueCalculator(value = NextNumberForYearCalculator.class, properties = @PropertyValue(name = "year"))
	int number;
	
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	LocalDate date;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("Simple")
	Customer customer;
	
	@ElementCollection
	@ListProperties("product.number, product.description, quantity")
	Collection<Detail> details;
	
	@Stereotype("MEMO")
	String remarks;
}
