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
import com.mx.mex.Dto.Aspirantes;
import com.mx.mex.Dto.ResponseDto;
import com.mx.mex.Services.IAspirantes;

@Controller
@RequestMapping(value = "Aspirantes")
public class ControllerAspirantes {

	@Autowired
	private IAspirantes aspirantes;

	// UN METODO SE COMPONE POR
	// TIPO DE IDENTIFICADOR (PUBLIC, PRIVATE O PROTECTED)
	//

	/*
	 * { alumno: "Alumno", edad: 12, nombre: "Jorge" }
	 */

	@ResponseBody
	@RequestMapping(value = "/getAspirantes", method = RequestMethod.GET, produces = "application/json") // = select *
																											// from
																											// Aspirantes
	ResponseEntity<List<Aspirantes>> getAspirantes() {
		final HttpHeaders httpHeaders = new HttpHeaders();
		List<Aspirantes> lista = aspirantes.getAspirantes();


		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Aspirantes>>(lista, httpHeaders, HttpStatus.OK);
	}

	
	
	@ResponseBody
	@RequestMapping(value = "/insertAspirantes", method = RequestMethod.POST, produces = "application/json") // = select
																												// *
																												// from
																												// Aspirantes
	ResponseEntity<ResponseDto> insertAspirantes(@RequestBody Aspirantes p) {
		final HttpHeaders httpHeaders = new HttpHeaders();

		ResponseDto obj = new ResponseDto();
		
		System.out.println("Nombre: " + p.getIdAlumno());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Direccion : " + p.getNombreAlumno());
		System.out.println("Fecha: " + p.getFechaInscripcion());
		System.out.println("Materia: " + p.getCurso());
		System.out.println("Mestro: " + p.getMaestro());

		obj.setMessage(aspirantes.insertAspirantes(p));
		obj.setCode(0);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<ResponseDto>(obj, httpHeaders, HttpStatus.OK);
	}

//		List<Aspirantes> listaAspirantes = new ArrayList<>();
//		Aspirantes objeto = new Aspirantes(); // puede contener un registro
//		objeto.setCurso("1");
//	    objeto.setEdad(12);
//	    objeto.setFechaInscripcion(new Date());
//	    objeto.setIdAlumno(new BigDecimal(1));
//	    objeto.setMasestro("Jacinto");
//	    objeto.setNombreAlumno("Taboada");
//	    
//	 
//	  
//	    listaAspirantes.add(objeto); //PUEDES ASIGNAR UN OBJETO  , alexis
//		   
//	    objeto.setCurso("0001");
//		objeto.setEdad(12);
//		objeto.setFechaInscripcion(new Date());
//		objeto.setIdAlumno(new BigDecimal(1));
//		objeto.setMasestro("Jacinto");
//		objeto.setNombreAlumno("Taboada");
//		   
//		listaAspirantes.add(objeto); //PUEDES ASIGNAR UN OBJETO ,, arturo 
//		
//		// de los 1000 registros, solamente vas a ver el ultimo en el objeto

	@ResponseBody // permite mandar respuesta como valores
	@RequestMapping(value = "/updateAspirantes", method = RequestMethod.POST, produces = "application/json") // =																											// select																											// *																												// fro																												// Aspirantes
	ResponseEntity<ResponseDto> updateAspirantes(@RequestBody Aspirantes p) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		ResponseDto obj = new ResponseDto();
		System.out.println("Nombre: " + p.getIdAlumno());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Direccion : " + p.getNombreAlumno());
		System.out.println("Fecha: " + p.getFechaInscripcion());
		System.out.println("Materia: " + p.getCurso());
		System.out.println("Mestro: " + p.getMaestro());

		obj.setCode(0);//indicar si fue error 0 no tuvo error -1 si tuvo error 
		obj.setMessage(aspirantes.updateAspirantes(p));
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<ResponseDto>(obj, httpHeaders, HttpStatus.OK);
	}

	@ResponseBody // permite mandar respuesta como valores
	@RequestMapping(value = "/deleteAspirantes", method = RequestMethod.POST, produces = "application/json") // = select
																												// *
																												// from
																												// Aspirantes
	ResponseEntity<ResponseDto> deleteAspirantes(@RequestBody Aspirantes p) {
		final HttpHeaders httpHeaders = new HttpHeaders();
		
		ResponseDto obj = new ResponseDto();

		System.out.println("Nombre: " + p.getIdAlumno());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Direccion : " + p.getNombreAlumno());
		System.out.println("Fecha: " + p.getFechaInscripcion());
		System.out.println("Materia: " + p.getCurso());
		System.out.println("Mestro: " + p.getMaestro());
        
		obj.setCode(0);//indicar si fue error 0 no tuvo error -1 si tuvo error 
		obj.setMessage(aspirantes.deleteAspirantes(p));
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<ResponseDto>(obj, httpHeaders, HttpStatus.OK);
	}

	@ResponseBody // permite mandar respuesta como valores
	@RequestMapping(value = "/getAspiranteById", method = RequestMethod.POST, produces = "application/json") // =
																												// select
																												// *
																												// from
																												// Aspirantes
	ResponseEntity<Aspirantes> getAspiranteById(@RequestBody Aspirantes p) {
		final HttpHeaders httpHeaders = new HttpHeaders();

		System.out.println("Nombre: " + p.getIdAlumno());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Direccion : " + p.getNombreAlumno());
		System.out.println("Fecha: " + p.getFechaInscripcion());
		System.out.println("Materia: " + p.getCurso());
		System.out.println("Mestro: " + p.getMaestro());

		Aspirantes aspirante = aspirantes.getAspiranteById(p);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<Aspirantes>(aspirante, httpHeaders, HttpStatus.OK);
	}
	
	
}// FIN DE LA CLASE
