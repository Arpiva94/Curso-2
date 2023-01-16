package com.mx.mex.ServicesImplement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.mex.Dto.CursoDTO;
import com.mx.mex.Repository.ICursoRepository;
import com.mx.mex.Services.ICursoService;

@Service
public class CursoServiceImpl implements ICursoService {
	
	@Autowired
	private ICursoRepository cursoRepo;

	
	@Override
	public List<CursoDTO> getCurso() {
		return cursoRepo.getCurso();
	}

	@Override
	public String insertCurso(CursoDTO nuevoCurso) {		
			Integer respuesta = cursoRepo.insertCurso(nuevoCurso); 
			String respuestaInsert;
			
			if(respuesta==0)
				respuestaInsert="　No se inserto correctamente!!";
			else
				respuestaInsert="　Se inserto correctamente!!";
		
			return respuestaInsert;
	}
	
	@Override
	public String updateCurso(CursoDTO updateCurso) {
    Integer respuesta = cursoRepo.updateCurso(updateCurso); 
		
		
		if(respuesta==0)
		return "　No se actualizo correctamente!!";
		else
			return "　Se actualizo correctamente!!";
}
	

	@Override
	public String deleteCurso(CursoDTO deleteCurso) {
    Integer respuesta = cursoRepo.deleteCurso(deleteCurso); 
		
		
		if(respuesta==0)
		return "　No se elimino correctamente!!";
		else
			return "　se elimino Correctamente!!";
	}

}
