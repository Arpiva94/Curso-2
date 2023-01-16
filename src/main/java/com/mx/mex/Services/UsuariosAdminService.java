package com.mx.mex.Services;

import java.util.List;

import com.mx.mex.Dto.UsuariosAdminDTO;
import com.mx.mex.Entities.UsuariosAdmin;

public interface UsuariosAdminService {

	List<UsuariosAdminDTO> getAllUsuariosAdmin();

	
	
	
	List<UsuariosAdmin> getAllUsuariosAdmin_hibernate();




	String insertarUsAdmin_hibernate(UsuariosAdminDTO datos);


	
	


	String eliminarUsAdmin_hibernate(UsuariosAdminDTO datos);




	String actualizarUserAdmin_hibernate(UsuariosAdmin datos);






}//fin de la clase
