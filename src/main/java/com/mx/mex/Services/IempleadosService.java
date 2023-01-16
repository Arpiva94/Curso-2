package com.mx.mex.Services;

import java.util.List;

import com.mx.mex.Dto.empleadosDTO;
import com.mx.mex.Entities.empleados;

public interface IempleadosService {

	List<empleados> getAllEmpleados();

	String insertarEmpleado(empleadosDTO empleado);

}
