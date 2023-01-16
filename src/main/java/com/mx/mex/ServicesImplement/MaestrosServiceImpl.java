package com.mx.mex.ServicesImplement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.mex.Dto.MaestrosDTO;
import com.mx.mex.Repository.IMaestrosRepository;
import com.mx.mex.Services.IMaestrosService;

@Service
public class MaestrosServiceImpl implements IMaestrosService {

	@Autowired
	private IMaestrosRepository maestrosRepo;

	
	@Override
	public List<MaestrosDTO> getMaestro() {
		return maestrosRepo.getMaestro();
	}

	

	@Override
	public String insertMaestro(MaestrosDTO nuevoMaestro) {
		Integer respuesta = maestrosRepo.insertMaestro(nuevoMaestro); 
		String respuestaInsert;
		
		if(respuesta==0)
			respuestaInsert="　No se inserto correctamente!!";
		else
			respuestaInsert="　Se inserto correctamente!!";
	
		return respuestaInsert;
}




	@Override
	public String updateMaestro(MaestrosDTO updateMaestro) {
    Integer respuesta = maestrosRepo.updateMaestro(updateMaestro); 
		
		
		if(respuesta==0)
		return "　No se actualizo correctamente!!";
		else
			return "　Se actualizo correctamente!!";
}
	



	@Override
	public String deleteMaestro(MaestrosDTO deleteMaestro) {
    Integer respuesta = maestrosRepo.deleteMaestro(deleteMaestro); 
		
		
		if(respuesta==0)
		return "　No se elimino correctamente!!";
		else
			return "　se elimino Correctamente!!";
	}

}
