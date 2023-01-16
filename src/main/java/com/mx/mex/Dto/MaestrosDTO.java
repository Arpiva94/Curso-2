package com.mx.mex.Dto;

import java.math.BigDecimal;
import java.util.Date;

public class MaestrosDTO {

	private BigDecimal idMaestro;
	private String nombreMaestro;
	private int edad;
	private Date fechaCreacion;
	
	
	public BigDecimal getIdMaestro() {
		return idMaestro;
	}
	public void setIdMaestro(BigDecimal idMaestro) {
		this.idMaestro = idMaestro;
	}
	public String getNombreMaestro() {
		return nombreMaestro;
	}
	public void setNombreMaestro(String nombreMaestro) {
		this.nombreMaestro = nombreMaestro;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}	
	
	
}
