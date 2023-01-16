package com.mx.mex.Mapper;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.mx.mex.Dto.Ventas;

public class VentasMapper<T> implements RowMapper<Ventas> { 

public Ventas mapRow(ResultSet rs, int rowNum) throws SQLException {
	Ventas objeto = new Ventas();
	objeto.setIdVenta(rs.getBigDecimal("ID_VENTA"));
	objeto.setUsuario(rs.getString("NOMBRE"));
	objeto.setSubtotal(rs.getBigDecimal("SUBTOTAL"));
	objeto.setDescuento(rs.getBigDecimal("DESCUENTO"));
	objeto.setTotal(rs.getBigDecimal("TOTAL"));
	objeto.setPago(rs.getBigDecimal("PAGO"));
	objeto.setCambio(rs.getBigDecimal("CAMBIO"));
	objeto.setEstado(rs.getString("ESTADO"));
	objeto.setFecha(rs.getDate("FECHA"));
    
	
	return objeto;
}
}// fin de la clase
