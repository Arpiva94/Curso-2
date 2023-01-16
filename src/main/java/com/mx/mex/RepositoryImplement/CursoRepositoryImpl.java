package com.mx.mex.RepositoryImplement;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.mx.mex.Dto.CursoDTO;
import com.mx.mex.Mapper.CursoMapper;
import com.mx.mex.Repository.ICursoRepository;

@Repository
public class CursoRepositoryImpl implements ICursoRepository {

	
	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	@Override
	public List<CursoDTO> getCurso() {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query("SELECT * FROM CURSO", new CursoMapper<CursoDTO>());
	}

	
	
	@Override
	public Integer insertCurso(CursoDTO nuevoCurso) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("INSERT INTO CURSO (NOMBRE_MATERIA, DESCRIPCION,FECHA_CREACION)"
				+ "VALUES (?,?,?)",nuevoCurso.getNombreMateria(),nuevoCurso.getDescripcion(),
				nuevoCurso.getFechaCreacion());	 
	}

	
	
	
	@Override
	public Integer updateCurso(CursoDTO updateCurso) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("UPDATE CURSO SET NOMBRE_MATERIA = ?, DESCRIPCION = ? WHERE ID_CURSO = ?"
				,updateCurso.getNombreMateria(),updateCurso.getDescripcion(),updateCurso.getIdCurso());
	}
	
	

	@Override
	public Integer deleteCurso(CursoDTO deleteCurso) {
    jdbcTemplate.setDataSource(getDataSource());
		
		return  jdbcTemplate.update("DELETE FROM CURSO WHERE ID_CURSO = ? "
				,deleteCurso.getIdCurso());
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

	
	
	
}
