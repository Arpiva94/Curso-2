package com.mx.mex.Repository;

import java.util.List;

import com.mx.mex.Dto.UsuariosAdminDTO;
import com.mx.mex.Entities.UsuariosAdmin;

public interface UsuariosAdminDAO {

	List<UsuariosAdminDTO> obtenerAllUsuariosAdmin();

	List<UsuariosAdmin> obtenerAllUsuariosAdmin_hibernate();

	
	
	
	Integer insertarUsuarios(UsuariosAdmin usuariosAdmin);

	
	
	Integer eliminarUsuarioAdmin(Long idUser);
	
	

	Integer actualizarUsuarioAdmin(UsuariosAdmin datos);

}
