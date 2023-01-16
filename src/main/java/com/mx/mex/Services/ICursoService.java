package com.mx.mex.Services;

import java.util.List;

import com.mx.mex.Dto.CursoDTO;


public interface ICursoService {

	List<CursoDTO> getCurso();// ESTE METODO OBTIENE ASPIRANTES
	String insertCurso(CursoDTO nuevoCurso);
	String updateCurso(CursoDTO updateCurso);
	String deleteCurso(CursoDTO deleteCurso);
}
