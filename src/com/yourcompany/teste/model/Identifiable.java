package com.yourcompany.teste.model;

import javax.persistence.*;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@MappedSuperclass
@Getter @Setter
public class Identifiable {

	@Id @Hidden @Column(length = 32)
	@GeneratedValue(generator="system-uuid") @GenericGenerator(name="system-uuid", strategy="uuid")
	String oid;
}
