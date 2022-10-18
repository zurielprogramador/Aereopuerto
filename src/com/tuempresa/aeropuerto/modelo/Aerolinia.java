package com.tuempresa.aeropuerto.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Aerolinia {
	@Id
	@Column(length=32)
	String nombre;
	
	
	@Column(length=6)
	int id;
}
