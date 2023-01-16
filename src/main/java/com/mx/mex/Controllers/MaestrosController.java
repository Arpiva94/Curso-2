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

import com.mx.mex.Dto.CursoDTO;
import com.mx.mex.Dto.MaestrosDTO;
import com.mx.mex.Services.IMaestrosService;

@Controller
@RequestMapping(value="Maestros")
public class MaestrosController {

	@Autowired 
	private IMaestrosService maestro;
	
	
	@ResponseBody
	@RequestMapping(value="/getMaestro", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <List <MaestrosDTO>> getMaestro(){
	final HttpHeaders httpHeaders = new HttpHeaders ();
    List <MaestrosDTO> lista = maestro.getMaestro();
		
		

    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <List<MaestrosDTO>> (lista, httpHeaders, HttpStatus.OK );
    }
	
	
	@ResponseBody
	@RequestMapping(value="/insertMaestro", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <String> insertMaestro(@RequestBody MaestrosDTO m){
		final HttpHeaders httpHeaders = new HttpHeaders ();
		
    System.out.println("Id maestro: "+m.getIdMaestro());
  	System.out.println("Nombre del maestro: "+m.getNombreMaestro());
	System.out.println("Edad : "+m.getEdad());
  	System.out.println("Fecha de Creacion: "+m.getFechaCreacion());

		
			
			String respuesta = maestro.insertMaestro(m);
			   httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK );
    }
		

		
	
	@ResponseBody//permite mandar respuesta como valores
	@RequestMapping(value="/updateMaestro", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <String> updateMaestro(@RequestBody MaestrosDTO m){
		final HttpHeaders httpHeaders = new HttpHeaders ();
		
		System.out.println("Id maestro: "+m.getIdMaestro());
	  	System.out.println("Nombre del maestro: "+m.getNombreMaestro());
		System.out.println("Edad : "+m.getEdad());
	  	System.out.println("Fecha de Creacion: "+m.getFechaCreacion());

		
			
			String respuesta = maestro.updateMaestro(m);
			   httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK );
    }
	

	
	
	@ResponseBody//permite mandar respuesta como valores
	@RequestMapping(value="/deleteMaestro", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <String> deleteMaestro(@RequestBody MaestrosDTO m){
		final HttpHeaders httpHeaders = new HttpHeaders ();
		
		System.out.println("Id maestro: "+m.getIdMaestro());
	  	System.out.println("Nombre del maestro: "+m.getNombreMaestro());
		System.out.println("Edad : "+m.getEdad());
	  	System.out.println("Fecha de Creacion: "+m.getFechaCreacion());
		
			
			String respuesta = maestro.deleteMaestro(m);
			   httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK );
    }
	
}
