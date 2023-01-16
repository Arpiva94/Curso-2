package com.mx.mex.Services;

import java.util.List;

import com.mx.mex.Dto.MaestrosDTO;


public interface IMaestrosService {
	List<MaestrosDTO> getMaestro();// ESTE METODO OBTIENE ASPIRANTES
	String insertMaestro(MaestrosDTO nuevoMaestro);
	String updateMaestro(MaestrosDTO updateMaestro);
	String deleteMaestro(MaestrosDTO deleteMaestro);
}//FIN DE LA CLASE
