package com.mx.mex.RepositoryImplement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mx.mex.Dto.UsuariosAdminDTO;
import com.mx.mex.Entities.UsuariosAdmin;
import com.mx.mex.Repository.UsuariosAdminDAO;

@Repository
public class UsuariosAdminDAOImpl implements UsuariosAdminDAO {

	//consutlas son con JDBC TEMPLATE
	
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	
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
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UsuariosAdminDAOImpl() {
	}
	public UsuariosAdminDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked") // Esta anotacion es para -> @Suprimir advertencias (lineas amarillas - PUEDEN COMENTAR ESTA LINEA PARA QUE VEAN A QUE ME REFIERO)	
	@Override
	public List<UsuariosAdminDTO> obtenerAllUsuariosAdmin(){
	jdbcTemplate.setDataSource(getDataSource()); //ASIGNAMOS LA CONEXIÓN AL OBJETO JDBCTEMPLATE
	
	StringBuilder sb = new StringBuilder("SELECT ID_USER, NOMBRE_COMPLETO, EDAD, DIRECCION FROM CURSOADMIN.USUARIOS_ADMIN");
	
	 return (List<UsuariosAdminDTO>) jdbcTemplate.query(sb.toString(), new Object[] {}, new RowMapper() {
         @Override
         public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        	 UsuariosAdminDTO datos = new UsuariosAdminDTO();
		   
//           datos.setIdUser(rs.getBigDecimal("ID_USER"));
           datos.setIdUser(rs.getLong("ID_USER"));
		   datos.setNombreCompleto(rs.getString("NOMBRE_COMPLETO"));
		   datos.setEdad(rs.getString("EDAD"));
		   datos.setDireccion(rs.getString("DIRECCION"));
		  
		   return datos;
	   }
   });
	
}//fin del metodo
	
	
	
	//esta es la consulta por hibernate
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<UsuariosAdmin> obtenerAllUsuariosAdmin_hibernate() {
		final Session session = sessionFactory.getCurrentSession(); //obtener la session actual
		final Criteria criteria = session.createCriteria(UsuariosAdmin.class);
		
		//criteria.add(Restrictions.eq("ID_USER",1)); // ESTE ES EL WHERE
		//criteria.addOrder(Order.asc("EDAD"));//CONSULTAR POR ORDEN ASC
		
		return (List<UsuariosAdmin>) criteria.list();
	}//fin del metodo
	
	
	
	
	//INSERTAR CON HIBERNATE
	@Override
	@Transactional
	public Integer insertarUsuarios(UsuariosAdmin usuariosAdmin) {
		
		sessionFactory.getCurrentSession().save(usuariosAdmin);// insertamos con hibernate
		
		return 1;
	}//fin del metod
	
	
	@Override
	@Transactional
	public Integer eliminarUsuarioAdmin(Long idUser) {
		
		UsuariosAdmin idUserAdmin = new UsuariosAdmin();
		idUserAdmin.setIdUser(idUser);
		
		sessionFactory.getCurrentSession().delete(idUserAdmin);
		return 1;
	}
	@Override
	@Transactional
	public Integer actualizarUsuarioAdmin(UsuariosAdmin datos) {
		sessionFactory.getCurrentSession().update(datos);//siempre va actualizar
		//sessionFactory.getCurrentSession().saveOrUpdate(datos);//va a actualzar si ya existe el regstro y s no lo va  creae
		return 1;
	}
	
}//fin de la clase
	   

