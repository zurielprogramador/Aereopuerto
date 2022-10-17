package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pasajero {
    @Id
	@Column(length = 10)
	int id;
	
	@Column(length = 32)
	@Required
	String nombre;

	@Embedded @NoFrame
	Direccion direccion;
}
