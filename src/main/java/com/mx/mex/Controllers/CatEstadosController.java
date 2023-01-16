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

import com.mx.mex.Dto.CatEstadosDTO;
import com.mx.mex.Dto.MensajeDTO;
import com.mx.mex.Dto.UsuariosAdminDTO;
import com.mx.mex.Entities.CatEstados;
import com.mx.mex.Services.CatEstadosService;

@Controller
@RequestMapping(value = "CatEstados")
public class CatEstadosController {

	@Autowired
	private CatEstadosService catEstadosService;
	
	@ResponseBody
	@RequestMapping(value="/getAllEstados", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <List <CatEstados>> getAllEstados(){
	final HttpHeaders httpHeaders = new HttpHeaders();
    List <CatEstados> lista = catEstadosService.getAllCatEstados();
		
		

    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <List<CatEstados>> (lista, httpHeaders, HttpStatus.OK );
    }
	
	
	
	//obtener estado por id
	
	@ResponseBody
	@RequestMapping(value="/getEstadosPorId", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	public String  obtenerEstadoId(@RequestBody CatEstadosDTO id){
	String respuesta = catEstadosService.consultarEstadoPorId(id);
		

    
		return respuesta;
    }

	//insertar estado 
	
	@ResponseBody
	@RequestMapping(value="/insertEstado", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	public String  insertarEstado(@RequestBody CatEstadosDTO estado){
	String respuesta = catEstadosService.insertarEstado(estado);
		

    
		return respuesta;
    }
	
	
	
	//eliminar estado
	
	@ResponseBody
	@RequestMapping(value="/eliminarEstados", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <String> eliminarEstadoPorId(@RequestBody CatEstadosDTO id){
	final HttpHeaders httpHeaders = new HttpHeaders();
    String respuesta = catEstadosService.eliminarEstado(id);
		
		

    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK );
    }
	
	
	
	
	//eliminar estados con dto
	
	@ResponseBody
	@RequestMapping(value="/eliminarEstadosDTO", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	public MensajeDTO eliminarEstado(@RequestBody CatEstadosDTO id){
		
		return catEstadosService.eliminarEstadoPorMensajeDTO(id);
    }
	
	
}
