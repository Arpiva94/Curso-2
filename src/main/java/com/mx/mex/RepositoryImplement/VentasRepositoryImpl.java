package com.mx.mex.RepositoryImplement;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mex.Dto.Ventas;
import com.mx.mex.Mapper.VentasMapper;
import com.mx.mex.Repository.IVentasRepository;

import oracle.net.aso.s;

@Repository
public class VentasRepositoryImpl implements IVentasRepository {
	
	@Autowired
	private  DataSource dataSource;  //NUESTRA CONEXION A BASE DE DATOS
	
	private  JdbcTemplate jdbcTemplate = new JdbcTemplate(); //PARA EJECUTAR LAS CONSULTAS

	@Override
	public List<Ventas> VENTAS() {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query("SELECT v.ID_VENTA AS ID_VENTA, u.NOMBRE AS NOMBRE, v.SUBTOTAL AS SUBTOTAL, v.DESCUENTO AS DESCUENTO, v.TOTAL AS TOTAL, v.PAGO AS PAGO, v.ESTADO AS ESTADO,v.CAMBIO AS CAMBIO,v.FECHA AS FECHA FROM VENTA v  "
				+ "INNER JOIN USUARIOS u on v.USUARIO = u.ID_USUARIO",
				new VentasMapper<Ventas>());
		
		
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}//fin de la clase
