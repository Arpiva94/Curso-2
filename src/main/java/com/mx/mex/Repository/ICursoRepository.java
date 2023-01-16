package com.mx.mex.Repository;

import java.util.List;

import com.mx.mex.Dto.CursoDTO;

public interface ICursoRepository {

	List<CursoDTO> getCurso();// ESTE METODO OBTIENE ASPIRANTES
	Integer insertCurso(CursoDTO nuevoCurso);
	Integer updateCurso(CursoDTO updateCurso);
	Integer deleteCurso(CursoDTO deleteCurso);
}
