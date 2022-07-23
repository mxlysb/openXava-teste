package com.yourcompany.teste.model;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Order extends CommercialDocument{
	
	@ManyToOne
	Invoice invoice;

}
