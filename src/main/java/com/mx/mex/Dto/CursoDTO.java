package com.mx.mex.Dto;

import java.math.BigDecimal;
import java.util.Date;

public class CursoDTO {

	
	private BigDecimal idCurso;
	private String nombreMateria;
	private String descripcion;
	private Date fechaCreacion;
	
	
	public BigDecimal getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(BigDecimal idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
}//fin de la clase
