package com.mx.mex.ServicesImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mx.mex.Dto.CatEstadosDTO;
import com.mx.mex.Dto.empleadosDTO;
import com.mx.mex.Entities.CatEstados;
import com.mx.mex.Entities.empleados;
import com.mx.mex.Repository.CatEstadosDAO;
import com.mx.mex.Repository.empleadosDAO;
import com.mx.mex.Services.IempleadosService;

public class empleadosServiceImpl implements IempleadosService{
	
	@Autowired
	private empleadosDAO EmpladosDAO;

	@Override
	public List<empleados> getAllEmpleados() {
	
		List<empleados> empleados = EmpladosDAO.obtieneEmpleados();
		return empleados;
	}



	@Override
	public String insertarEmpleado(empleadosDTO estado) {
		
		CatEstados catEstados = new CatEstados();  //entidad setearlos valores dto
		
	
	
	
			return "No se pudo insertar el registo";
		}
	}


