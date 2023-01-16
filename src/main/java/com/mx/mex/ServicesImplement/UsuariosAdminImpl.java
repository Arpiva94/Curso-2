package com.mx.mex.ServicesImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.mex.Dto.UsuariosAdminDTO;
import com.mx.mex.Entities.UsuariosAdmin;
import com.mx.mex.Repository.UsuariosAdminDAO;
import com.mx.mex.Services.UsuariosAdminService;

@Service
public class UsuariosAdminImpl implements UsuariosAdminService {
	
	@Autowired
private UsuariosAdminDAO usuariosAdminDAO;

@Override
public List<UsuariosAdminDTO> getAllUsuariosAdmin() {
	
	return usuariosAdminDAO.obtenerAllUsuariosAdmin() ;
}

@Override
@Transactional
public List<UsuariosAdmin> getAllUsuariosAdmin_hibernate() {
	System.out.println ("estoy ingresando en el metodo obtenerAllUsuariosAdmin_hibernate");
	List<UsuariosAdmin> listaUsuariosAdmin = usuariosAdminDAO.obtenerAllUsuariosAdmin_hibernate();
	System.out.println ("lista"+listaUsuariosAdmin.size());
	return listaUsuariosAdmin;
}


//inertardatos hibernate
@Override
public String insertarUsAdmin_hibernate(UsuariosAdminDTO datos) { //UsuariosAdminDTO para transportar informacion
// en este caso la informacion viene con el objeto datos
	
	UsuariosAdmin usuariosAdmin = new UsuariosAdmin();//inicializamos el objeto vacio
	usuariosAdmin.setIdUser(datos.getIdUser());
	usuariosAdmin.setNombreCompleto(datos.getNombreCompleto());
	usuariosAdmin.setEdad(datos.getEdad());
	usuariosAdmin.setDireccion(datos.getDireccion());
	usuariosAdmin.setEstado(datos.getEstado());
	usuariosAdmin.setRol(datos.getRol());
	
	Integer respuesta = usuariosAdminDAO.insertarUsuarios(usuariosAdmin);
	String respuestaInsert;
	
	if (respuesta ==0) {
		respuestaInsert = "No se pudo insertar los datos";
	}else {
			respuestaInsert = "Si se inserto los datos";
		}
	
	
	return respuestaInsert;
}

@Override
public String eliminarUsAdmin_hibernate(UsuariosAdminDTO datos) {
	Integer respuesta = usuariosAdminDAO.eliminarUsuarioAdmin(datos.getIdUser());	
	
String respuestaInsert;
	
	if (respuesta ==0) {
		respuestaInsert = "No se pudo eliminar los datos";
	}else {
			respuestaInsert = "Si se elimino los datos";
		}
	return respuestaInsert;
}



@Override
public String actualizarUserAdmin_hibernate(UsuariosAdmin datos) {
	Integer respuesta = usuariosAdminDAO.actualizarUsuarioAdmin(datos);	
String respuestaInsert;
	
	if (respuesta ==0) {
		respuestaInsert = "No se pudo eliminar los datos";
	}else {
			respuestaInsert = "Si se elimino los datos";
		}
	return respuestaInsert;


}
}//fin de la clase
