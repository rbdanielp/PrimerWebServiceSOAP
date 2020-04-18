package uy.edu.fing.tsig.negocio.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;

//************************************************************
//INTERFAZ QUE DEFINE LOS METODOS (SERVICIOS) A SER EXPUESTOS
//************************************************************


@WebService()
public interface Calculadora {

	@WebMethod
	public double operacion(int opcion, int valor1, int valor2);
}
