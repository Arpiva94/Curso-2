package com.mx.mex.Controllers;



import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.mex.Dto.AlumnosNoviembre;
import com.mx.mex.Dto.Usuario;
import com.mx.mex.Dto.Ventas;
import com.mx.mex.Services.IAlumnosNoviembre;
import com.mx.mex.Services.IVentas;
import com.mx.mex.Services.InterfaceServicePrincipal;


//EL CONTROLADOR O CONTROLADORES NOS SIRVEN PARA 
//GESTIONAR LA COMUNICACIÓN ENTRE LAS DIFERENTES CAPAS
/*
 * SERVICIOS
 * DAO
 * DTO = AQUÍ SE ENCUENTRA LA INFORMACIÓN QUE SE USA DENTRO DEL PROYECTO
 * DTO PUEDE CONTENER TODO LO RELACIONADO A UNA ESCUELA
 * POR EJEMPLO; NOMBRE ESCUELA, DIRECCION, ESTADO, TELEFONO, ETC
 * FRONT = 
 */

//SPRINGFRAMEWORK  4.0

/*
 * ES UN FRAMEWORK DE DESARROLLO PARA RAPIDA INTEGRACIÓN, 
 * EL CUAL NOS PERMITE GRACIAS A SUS MODULOS,
 * DESARROLLAR DE MANERA MÁS RAPIDA
 * 
 * CORE
 * CONTEXT
 * DAO
 * MVC
 * ORM
 * SECURITY
 * JDBC
 * 
 */

//EL CONTROLADOR SE VA A ENCARGAR DE GESTIONAR LAS PETCIONES QUE HAGA EL USUARIO

@Controller //ANOTACIONES
@RequestMapping(value = "Principal")
public class ControllerPrincipal {
	
	
	
 //INYECCIÓN DE DEPENDENCIAS - LLAMAR O CONECTAR CON LAS CLASES DE SERVICIO @SERVICE

//PRIVATE = MODIFICADOR DE ACCESO
//InterfaceServicePrincipal = MI CLASE O INTERFACE
//servicio = MI OBJETO DE LA CLASE InterfaceServicePrincipal
//(EL CUAL PUEDE TENER EL NOMBRE QUE YO QUIERA)
@Autowired
private InterfaceServicePrincipal servicio;


@Autowired
private IAlumnosNoviembre alumnosNoviembre;

@Autowired
private IVentas VenTas;

//URL O SERVICIO DE MI CONTROLADOR
/*
 * @value = nombre de la URL
 * method  = GET, POST, PUT, DELETE
 * 
 * GET = RETORNA VALOR (CUALQUIER TIPO)
 * POST = RECIBE INFORMACIÓN Y RETORNA INFORMACIÓN (CUALQUIER TIPO)
 * PUT = ACTUALIZAR DATOS, RECIBE INFORMACIÓN Y RETORNA UNA RESPUESTA ESPECIFICA, SI SE ACTUALIZO O NO
 * DELET = ELIMINAR DATOS, RECIBE INFORMACIÓN Y RETORNA UNA RESPUESTA ESPECIFICA, SI SE ELIMINÓ O NO
 */
/*
{
	
  "NOMBRE":"ISAUL",
  "APELLIDO":"LUNA",
  "EDAD":27

}
@ResponseBody
@RequestMapping(value = "/Inventario", method = RequestMethod.GET, produces = "application/json")
public ResponseEntity<List<RegimenFiscal>> regimenFiscal() {
	final HttpHeaders httpHeaders = new HttpHeaders();
	httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	log.info("CONSULTANDO REGIMENES FISCALES");
	return new ResponseEntity<List<RegimenFiscal>>(service.obtenerRegimenFiscal(), httpHeaders, HttpStatus.OK);
}
*/

@RequestMapping(value = "/Login")
public String loggin(ModelMap model) {

    List<Usuario> usuarios = new ArrayList<Usuario>(); //DECLARADA E INICIALIZADA
    

     //usuarios= servicio.obtenerUsuarios(); //ASIGNANDO VALOR A LA LISTA
   
    for(Usuario datos : usuarios) {
    	System.out.println("Nombre: "+datos.getNombre());
    	System.out.println("Edad: "+datos.getEdad());
    	System.out.println("Direccion: "+datos.getDireccion());

    }
   
	model.addAttribute("Bienvenida", "¡Bienvenido!");//HACIENDO USO DEL OBJETO MODEL
	
	return "Login";//RETORN A LA VISTA DE LOGIN 
}

@RequestMapping(value = "/Inicio")
public String Inicio(ModelMap model) {

	return "Inicio";//RETORN A LA VISTA DE LOGIN 
}

@RequestMapping(value = "/Alumnos") //URL O SERVICIO
public String Alumnos(ModelMap model) {
  
 
	List<AlumnosNoviembre> alumnos =  alumnosNoviembre.alumnos();
	
	for(AlumnosNoviembre run : alumnos) {
		System.out.println("Nombre: "+run.getNombreAlumno());
    	System.out.println("Edad: "+run.getEdad());
    	System.out.println("Fecha de inscripcion: "+run.getFechaInscripcion());
    	System.out.println("Materia: "+run.getMateria());
    	System.out.println("Maestro: "+run.getMaestro());
    	System.out.println("Id alumno: "+run.getIdAlumno());
	}
	
	
	return "Inicio";//RETORN A LA VISTA DE LOGIN 
}

@RequestMapping(value = "/Ventas") //URL O SERVICIO
public String Ventas(ModelMap model) {
List<Ventas> ventas =  VenTas.VENTAS();
	
	for(Ventas ven : ventas) {
		System.out.println("Nombre: "+ven.getIdVenta());
    	System.out.println("Edad: "+ven.getUsuario());
    	System.out.println("Fecha de inscripcion: "+ven.getSubtotal());
    	System.out.println("Materia: "+ven.getDescuento());
    	System.out.println("Maestro: "+ven.getTotal());
    	System.out.println("Id alumno: "+ven.getPago());
    	System.out.println("Id alumno: "+ven.getCambio());
    	System.out.println("Id alumno: "+ven.getEstado());
    	System.out.println("Id alumno: "+ven.getFecha());
	}
	return "Ventas";
}


}//FIN DE LA CLASE




