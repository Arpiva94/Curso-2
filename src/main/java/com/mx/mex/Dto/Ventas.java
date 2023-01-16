package com.mx.mex.Dto;

import java.math.BigDecimal;
import java.sql.Date;

public class Ventas {

	private BigDecimal idVenta;
	private String usuario;
	private BigDecimal subtotal;
	private BigDecimal descuento;
	private BigDecimal total;
	private BigDecimal pago;
	private BigDecimal cambio;
	private String estado;
	private Date fecha;
	
	public BigDecimal getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(BigDecimal idVenta) {
		this.idVenta = idVenta;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public BigDecimal getDescuento() {
		return descuento;
	}
	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public BigDecimal getPago() {
		return pago;
	}
	public void setPago(BigDecimal pago) {
		this.pago = pago;
	}
	public BigDecimal getCambio() {
		return cambio;
	}
	public void setCambio(BigDecimal cambio) {
		this.cambio = cambio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
}



