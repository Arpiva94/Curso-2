package com.mx.mex.Controllers;

import java.util.Date;
import java.util.List;
import javax.print.attribute.standard.Media;
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
import com.mx.mex.Services.ICursoService;



@Controller
@RequestMapping(value="Curso")
public class CursoController {

	
	@Autowired 
	private ICursoService curso;

	
	@ResponseBody
	@RequestMapping(value="/getCurso", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <List <CursoDTO>> getCurso(){
	final HttpHeaders httpHeaders = new HttpHeaders ();
    List <CursoDTO> lista = curso.getCurso();
		
		

    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <List<CursoDTO>> (lista, httpHeaders, HttpStatus.OK );
    }
	
	
	@ResponseBody
	@RequestMapping(value="/insertCurso", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <String> insertCurso(@RequestBody CursoDTO c){
		final HttpHeaders httpHeaders = new HttpHeaders ();
		
    System.out.println("Id Curso: "+c.getIdCurso());
  	System.out.println("Nombre de la materia: "+c.getNombreMateria());
	System.out.println("Descripccion : "+c.getDescripcion());
  	System.out.println("Fecha de Creacion: "+c.getFechaCreacion());

		
			
			String respuesta = curso.insertCurso(c);
			   httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK );
    }
		

		
	
	@ResponseBody//permite mandar respuesta como valores
	@RequestMapping(value="/updateCurso", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <String> updateCurso(@RequestBody CursoDTO c){
		final HttpHeaders httpHeaders = new HttpHeaders ();
		
    System.out.println("Id Curso: "+c.getIdCurso());
  	System.out.println("Nombre de la materia: "+c.getNombreMateria());
	System.out.println("Descripcion : "+c.getDescripcion());
  	System.out.println("Fecha de creacion: "+c.getFechaCreacion());

		
			
			String respuesta = curso.updateCurso(c);
			   httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK );
    }
	

	
	
	@ResponseBody//permite mandar respuesta como valores
	@RequestMapping(value="/deleteCurso", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <String> deleteCurso(@RequestBody CursoDTO c){
		final HttpHeaders httpHeaders = new HttpHeaders ();
		
		 System.out.println("Id Curso: "+c.getIdCurso());
		  	System.out.println("Nombre de la materia: "+c.getNombreMateria());
			System.out.println("Descripcion : "+c.getDescripcion());
		  	System.out.println("Fecha de creacion: "+c.getFechaCreacion());
		
			
			String respuesta = curso.deleteCurso(c);
			   httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK );
    }
	
}// FIN DE LA CLASE