package com.mx.mex.ServicesImplement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mex.Dto.Ventas;
import com.mx.mex.Repository.IVentasRepository;
import com.mx.mex.Services.IVentas;

@Service
public class VentasImpl implements IVentas  {

	@Autowired
	private IVentasRepository VenTas;
	
	@Override
	public List<Ventas> VENTAS() {
		return VenTas.VENTAS();

	}

}//fin de la clase
