package com.mx.mex.ServicesImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mex.Dto.CatEstadosDTO;
import com.mx.mex.Dto.MensajeDTO;
import com.mx.mex.Entities.CatEstados;
import com.mx.mex.Repository.CatEstadosDAO;
import com.mx.mex.Services.CatEstadosService;

@Service
public class CatEstadosImpl implements CatEstadosService {

	@Autowired
	private CatEstadosDAO catEstadosDAO;
	
	@Override
	public List<CatEstados> getAllCatEstados() {
	
		List<CatEstados> estados = catEstadosDAO.obtieneEstados();
		return estados;
	}

	
	
	//CONSULTAR ESTADO POR ID
	@Override
	public String consultarEstadoPorId(CatEstadosDTO id) {
		String resp = null;
		CatEstados estado = catEstadosDAO.read(id.getIdEstado());//SELEC O CONSULTA SELECT
		System.out.println("Nombre>"+estado.getNombre() +"ABREV->>" + estado.getAbreviatura());
		if(estado !=null || !estado.toString().isEmpty() ){
			resp = "si existeel estado";}
		else {
			resp = "el registro no existe"; }
	
		

		return resp;
	}


//agregar estado
	
	@Override
	public String insertarEstado(CatEstadosDTO estado) {
		
		CatEstados catEstados = new CatEstados();  //entidad setearlos valores dto
		catEstados.setIdEstado(estado.getIdEstado());
		catEstados.setNombre(estado.getNombre());
		catEstados.setAbreviatura(estado.getAbreviatura());
		
		Long agregoReg = catEstadosDAO.create(catEstados); //INSERTANDO ENLATABLA DE LA ENTIDAD CON HIBERNATE
		if(agregoReg != 0) {
		return "Inserto De forma correcta";}
		else {
			return "No se pudo insertar el registo";
		}
	}


	
	
	//Eliminar estado por ID

	@Override
	public String eliminarEstado(CatEstadosDTO id) {  // Eliminar porid - Hibernate
		
		catEstadosDAO.delete(id.getIdEstado()); // especificar el id con getIdEstado
		
		return "Si elimino el registro";
	}



	// metodo eliminar estado por MENSAJEDTO
	
	@Override
	public MensajeDTO eliminarEstadoPorMensajeDTO(CatEstadosDTO id) {
		MensajeDTO mensajeDTO = new MensajeDTO();
		
		try {
			
			if(id.getIdEstado() != null || id.getIdEstado() != 0) { // que no venga nulo o diferent e 0
				
				CatEstados estado = catEstadosDAO.read(id.getIdEstado());//consultamos si existe
				
				if(estado != null) {
					catEstadosDAO.delete(id.getIdEstado());
					
					mensajeDTO.setMensaje("El stado ha sido elimindo Correctamente");
				}else {
					mensajeDTO.setMensaje("El estado no existe en labase dedaos");
				}
				
			}else {
				mensajeDTO.setMensaje("Los datos enviados paralaconsulta son erroneos");
			}
			
			
		} catch (Exception e) {
			mensajeDTO.setMensaje("Ocurrio un error al intenta eliminar la informacon");
			// TODO: handle exception
		}
		
		return mensajeDTO ;
		

}//fin de la clase
	
}
