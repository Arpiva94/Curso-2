package com.mx.mex.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.mx.mex.Dto.CursoDTO;


public class CursoMapper<T> implements RowMapper<CursoDTO>  {

	public CursoDTO mapRow(ResultSet cs, int rowNum) throws SQLException {
		CursoDTO objeto = new CursoDTO();
		objeto.setIdCurso(cs.getBigDecimal("ID_CURSO"));
		 objeto.setNombreMateria(cs.getString("NOMBRE_MATERIA"));		 
		    objeto.setDescripcion(cs.getString("DESCRIPCION"));
		    objeto.setFechaCreacion(cs.getDate("FECHA_CREACION"));


		    
	    
	   
	   
		return objeto;
	}
}//fin de la clase
