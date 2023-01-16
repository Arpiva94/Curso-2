package com.mx.mex.Dto;

public class empleadosDTO {

	private Long nombreCompleto;
	private String rfc;
	private int edad;
	private String sexo;
	private String direcccion;
	private int telefono;
	private int activo;
	
	
	public Long getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(Long nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDirecccion() {
		return direcccion;
	}
	public void setDirecccion(String direcccion) {
		this.direcccion = direcccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
	
}
