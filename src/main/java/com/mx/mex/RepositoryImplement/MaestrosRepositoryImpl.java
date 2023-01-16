package com.mx.mex.RepositoryImplement;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mex.Dto.CursoDTO;
import com.mx.mex.Dto.MaestrosDTO;
import com.mx.mex.Mapper.MaestrosMapper;
import com.mx.mex.Repository.IMaestrosRepository;

@Repository
public class MaestrosRepositoryImpl implements IMaestrosRepository {

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	@Override
	public List<MaestrosDTO> getMaestro() {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query("SELECT * FROM MAESTROS", new MaestrosMapper<CursoDTO>());
	}

	@Override
	public Integer insertMaestro(MaestrosDTO nuevoMaestro) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("INSERT INTO MAESTROS (NOMBRE, EDAD,FECHA_CREACION)"
				+ "VALUES (?,?,?)",nuevoMaestro.getNombreMaestro(),nuevoMaestro.getEdad(),
				nuevoMaestro.getFechaCreacion());	 
	}

	@Override
	public Integer updateMaestro(MaestrosDTO updateMaestro) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("UPDATE MAESTROS SET NOMBRE = ?, EDAD = ? WHERE ID_MAESTRO = ?"
				,updateMaestro.getNombreMaestro(),updateMaestro.getEdad(),updateMaestro.getIdMaestro());
	}

	@Override
	public Integer deleteMaestro(MaestrosDTO deleteMaestro) {
    jdbcTemplate.setDataSource(getDataSource());
		
		return  jdbcTemplate.update("DELETE FROM MAESTROS WHERE ID_MAESTRO = ? "
				,deleteMaestro.getIdMaestro());
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
