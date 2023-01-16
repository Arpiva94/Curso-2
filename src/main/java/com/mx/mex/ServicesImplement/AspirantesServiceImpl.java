package com.mx.mex.ServicesImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mex.Dto.Aspirantes;
import com.mx.mex.Repository.IAspirantesRepository;
import com.mx.mex.Services.IAspirantes;

@Service
public class AspirantesServiceImpl implements IAspirantes{

	@Autowired
	private IAspirantesRepository aspirantesRepo;
	
	@Override
	public List<Aspirantes> getAspirantes() {
		return aspirantesRepo.getAspirantes();
	}

	@Override
	public String insertAspirantes(Aspirantes nuevoAspirante) {
		Integer respuesta = aspirantesRepo.insertAspirantes(nuevoAspirante); 
		String respuestaInsert;
		
		if(respuesta==0)
			respuestaInsert="No se insertocorrectamente";
		else
			respuestaInsert="Se inserto correctamente";
	
		return respuestaInsert;
	}

	@Override
	public String updateAspirantes(Aspirantes aspirante) {
		Integer respuesta = aspirantesRepo.updatetAspirantes(aspirante); 
		
		System.out.println("hola"+respuesta);
		if(respuesta==0)
		return "nose actualizo";
		else
			return "se actualizo";
}

	@Override
	public String deleteAspirantes(Aspirantes aspirante) {
Integer respuesta = aspirantesRepo.deleteAspirantes(aspirante); 
		
		
		if(respuesta==0)
		return "no se borro exitosamente";
		else
			return "se borro exitosamente";
}

	@Override
	public Aspirantes getAspiranteById(Aspirantes aspirante) {
		// TODO Auto-generated method stub
		return aspirantesRepo.getAspiranteById(aspirante);
	}
}// FIN DE LA CLASE
