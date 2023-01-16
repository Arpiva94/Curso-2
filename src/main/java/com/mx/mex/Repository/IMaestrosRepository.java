package com.mx.mex.Repository;

import java.util.List;

import com.mx.mex.Dto.MaestrosDTO;

public interface IMaestrosRepository {
	List<MaestrosDTO> getMaestro();// ESTE METODO OBTIENE ASPIRANTES
	Integer insertMaestro(MaestrosDTO nuevoMaestro);
	Integer updateMaestro(MaestrosDTO updateMaestro);
	Integer deleteMaestro(MaestrosDTO deleteMaestro);
}
