package com.mx.mex.Services;

import java.util.List;

import com.mx.mex.Dto.CatEstadosDTO;
import com.mx.mex.Dto.MensajeDTO;
import com.mx.mex.Entities.CatEstados;

public interface CatEstadosService {

	List<CatEstados> getAllCatEstados();

	String consultarEstadoPorId(CatEstadosDTO id);

	
	
	String insertarEstado(CatEstadosDTO estado);

	String eliminarEstado(CatEstadosDTO id);


	MensajeDTO eliminarEstadoPorMensajeDTO(CatEstadosDTO id);


}
