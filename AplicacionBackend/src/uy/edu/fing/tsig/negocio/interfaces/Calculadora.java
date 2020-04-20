package uy.edu.fing.tsig.negocio.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;

//************************************************************
//INTERFAZ QUE DEFINE LOS METODOS (SERVICIOS) A SER EXPUESTOS
//************************************************************

@WebService(serviceName = "CalculadoraWS")
public interface Calculadora {

	@WebMethod(operationName = "operacion")
	public double operacion(int opcion, int valor1, int valor2);
}
