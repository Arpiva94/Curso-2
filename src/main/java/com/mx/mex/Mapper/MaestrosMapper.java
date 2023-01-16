package com.mx.mex.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.mx.mex.Dto.MaestrosDTO;


public class MaestrosMapper<T> implements RowMapper<MaestrosDTO>  {

	public MaestrosDTO mapRow(ResultSet ms, int rowNum) throws SQLException {
		MaestrosDTO objeto = new MaestrosDTO();
		objeto.setIdMaestro(ms.getBigDecimal("ID_MAESTRO"));
		 objeto.setNombreMaestro(ms.getString("NOMBRE"));		 
		    objeto.setEdad(ms.getInt("EDAD"));
		    objeto.setFechaCreacion(ms.getDate("FECHA_CREACION"));
		    
			return objeto;
}
}