package com.mx.mex.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS_ADMIN", schema = "ARTURO10")//indcas el nombrede la tabla y elesquema en que se encuentre 

public class empleados {
	
	
	private Long nombreCompleto;
	private String rfc;
	private int edad;
	private String sexo;
	private String direcccion;
	private int telefono;
	private int activo;
	
	@Id
	@Column(name = "NOMBRE_COMPLETO", unique = true, nullable= false, length = 30)
	public Long getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(Long nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	@Column(name = "RFC", length = 100)
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	@Column(name = "EDAD", length = 3)
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Column(name = "SEXO", length = 30)
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Column(name = "DIRECCION", length = 30)
	public String getDirecccion() {
		return direcccion;
	}
	public void setDirecccion(String direcccion) {
		this.direcccion = direcccion;
	}
	
	@Column(name = "TELEFONO", length = 30)
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	@Column(name = "ACTIVO", length = 30)
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}

	
	

}


