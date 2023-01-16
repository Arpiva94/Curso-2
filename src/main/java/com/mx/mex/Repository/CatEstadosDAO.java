package com.mx.mex.Repository;

import java.util.List;

import com.mx.mex.Entities.CatEstados;

public interface CatEstadosDAO extends DAO<CatEstados, Long> {

	List<CatEstados> obtieneEstados();

}
