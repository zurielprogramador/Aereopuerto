package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Direccion {
	
	
	@Column(length = 20000)
	String calle;
	
	@Column(length = 20)
	String colonia;
	
	@Column(length = 20)
	String ciudad;
	
	@Column(length = 15)
	String pais;
	
	@Column(length=32)
	String nombre;
	
	
	@Column(length=6)
	int id;
}
