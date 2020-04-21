package uy.edu.fing.tsig.negocio.webservices.backend;

import javax.xml.ws.Endpoint;

import edu.fing.tsig.negocio.log.Loguear;
import uy.edu.fing.tsig.negocio.implementaciones.backend.CalculadoraImpl;

//******************************************************************************
//		CREA EL WSDL; QUE ES EL CONTRATO DONDE SE EXPONEN LOS SERVICIOS CREADOS 
//******************************************************************************

public class CalculadoraPublish {

	public static void main(String[] args) {
		Loguear.logTitulo("CREADO EL WSDL...");

		String address = "http://localhost:8081/AplicacionBackend/WS/Calculadora";

		Endpoint.publish(address, new CalculadoraImpl());

	}

}
