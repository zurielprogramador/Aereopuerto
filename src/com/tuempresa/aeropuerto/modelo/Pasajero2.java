package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Setter @Getter
public class Pasajero2 {

	 @Id
	 @Column(length=6)
	 int id;
	 
	 @Column(length=32)
	 @Required
	 String nombre;
	 
	 @Embedded @NoFrame
	 Direccion direccion;
}
