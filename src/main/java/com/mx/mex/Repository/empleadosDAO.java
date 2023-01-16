package com.mx.mex.Repository;

import java.util.List;

import com.mx.mex.Entities.empleados;

public interface empleadosDAO {

	List<empleados> obtieneEmpleados();
	
	
	int obtenerSecuenciaEmpleados();

}
