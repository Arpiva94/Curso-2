package com.mx.mex.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.mex.Dto.UsuariosAdminDTO;
import com.mx.mex.Entities.UsuariosAdmin;
import com.mx.mex.Services.UsuariosAdminService;

@Controller
@RequestMapping(value = "UsuariosAdmin")
public class UsuariosAdminController {

	@Autowired
	private UsuariosAdminService usuariosAdminService;
//	@Autowired
//	private
	
	
	@ResponseBody
	@RequestMapping(value="/getUsuariosAdmin", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <List <UsuariosAdminDTO>> getUsuariosAdmin(){
	final HttpHeaders httpHeaders = new HttpHeaders();
    List <UsuariosAdminDTO> lista = usuariosAdminService.getAllUsuariosAdmin();
		
		
//		for(Aspirantes run : lista) {
//			System.out.println("ID_ALUMNO: "+run.getIdAlumno());
//	    	System.out.println("Nombe Alumno: "+run.getNombreAlumno());
//	    	System.out.println("Edad: "+run.getEdad());
//	    	System.out.println("Fecha: "+run.getFechaInscripcion());
//	    	System.out.println("Materia: "+run.getCurso());
//	    	System.out.println("Mestro: "+run.getMaestro());
//			
//			
//		}
    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <List<UsuariosAdminDTO>> (lista, httpHeaders, HttpStatus.OK );
    }
	
	
	
	@ResponseBody
	@RequestMapping(value="/getUsuariosAdmin_hibernate", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <List <UsuariosAdmin>> getUsuariosAdmin_hibernete(){
	final HttpHeaders httpHeaders = new HttpHeaders();
    List <UsuariosAdmin> lista = usuariosAdminService.getAllUsuariosAdmin_hibernate();
		
		
    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <List<UsuariosAdmin>> (lista, httpHeaders, HttpStatus.OK );
    }
	
	
	
	
	@ResponseBody
	@RequestMapping(value="/addUsuariosAdmin_hibernate", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <String> insertUsuariosAdmin_hibernete(@RequestBody UsuariosAdminDTO datos){
	final HttpHeaders httpHeaders = new HttpHeaders();
	
     String respuesta = usuariosAdminService.insertarUsAdmin_hibernate(datos);
		
		
    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK );
    }
	
	
	
	@ResponseBody
	@RequestMapping(value="/eliminarUsuariosAdmin_hibernate", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <String> eliminartUsuariosAdmin_hibernete(@RequestBody UsuariosAdminDTO datos){
	final HttpHeaders httpHeaders = new HttpHeaders();
	
     String respuesta = usuariosAdminService.eliminarUsAdmin_hibernate(datos);
		
		
    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK );
    }
	
	
	@ResponseBody
	@RequestMapping(value="/actualizarUsuariosAdmin_hibernate", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <String> actualizarUsuariosAdmin_hibernete(@RequestBody UsuariosAdmin datos){
	final HttpHeaders httpHeaders = new HttpHeaders();
	
     String respuesta = usuariosAdminService.actualizarUserAdmin_hibernate(datos);
		
		
    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK );
    }
	
	
	
	
}//fin dela clse
