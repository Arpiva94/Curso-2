package com.mx.mex.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CAT_ROLES", schema = "ARTURO10")//indcas el nombrede la tabla y elesquema en que se encuentre 
public class CatRoles {
	
	private Long idRol;
	private String nombre;
	private String descripccion;
	
	
	
	@Id
	@Column(name = "ID_ROL", unique = true, nullable= false, precision = 11)
	public Long getIdRol() {
		return idRol;
	}
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	
	@Column(name = "NOMBRE", length = 100)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name = "DESCRIPCION", length = 100)
	public String getDescripccion() {
		return descripccion;
	}
	public void setDescripccion(String descripccion) {
		this.descripccion = descripccion;
	}
	
	

}
