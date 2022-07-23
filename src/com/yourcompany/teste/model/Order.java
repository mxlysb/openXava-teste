package com.yourcompany.teste.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@View(extendsView="super.DEFAULT",
members="invoice{invoice}"
)
@View(name="NoCustomerNoInvoice",
		members=
			"year, number, date;"
			+ "details;"
			+ "remarks"
)
public class Order extends CommercialDocument{
	
	@ManyToOne
	@ReferenceView("NoCustomerNoOrders")
	Invoice invoice;

}
