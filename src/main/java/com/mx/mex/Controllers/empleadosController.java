//package com.mx.mex.Controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.mx.mex.Dto.CatEstadosDTO;
//import com.mx.mex.Dto.empleadosDTO;
//import com.mx.mex.Entities.empleados;
//import com.mx.mex.Services.IempleadosService;
//
//@Controller
//@RequestMapping(value = "empleados")
//public class empleadosController {
//
//	@Autowired
//	private IempleadosService iEmpleadosService;
//	
//	
//	
//	@ResponseBody
//	@RequestMapping(value="/getAllEmpleados", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
//	ResponseEntity <List <empleados>> getAllEstados(){
//	final HttpHeaders httpHeaders = new HttpHeaders();
//    List <empleados> lista = iEmpleadosService.getAllEmpleados();
//		
//		
//
//    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//		return new ResponseEntity <List<empleados>> (lista, httpHeaders, HttpStatus.OK );
//    }
//	
//	
//	@ResponseBody
//	@RequestMapping(value="/insertEmpleado", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
//	public String  insertarEmpleado(@RequestBody empleadosDTO empleado){
//	String respuesta = iEmpleadosService.insertarEmpleado(empleado);
//		
//
//    
//		return respuesta;
//    }
//	
//	
//}
