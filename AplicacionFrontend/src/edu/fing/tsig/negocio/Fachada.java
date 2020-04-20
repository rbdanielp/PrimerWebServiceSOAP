package edu.fing.tsig.negocio;

import java.util.logging.Logger;

import edu.fing.tsig.negocio.beans.CalculadoraBean;
import edu.fing.tsig.negocio.log.Loguear;
import uy.edu.fing.tsig.negocio.interfaces.CalculadoraProxy;


public class Fachada {
	private static final Logger logger = Logger.getLogger("Fachada.class");

	public static double ProcesarOperacion(CalculadoraBean cb) {
		Loguear.logTitulo("Fachada: Procesar_Operacion");
		
		logger.info("ProcesarOperacion: Operacion : " + cb.getO() );
		logger.info("ProcesarOperacion: Valor1    : " + cb.getV1());
		logger.info("ProcesarOperacion: Valor2    : " + cb.getV2());
		double resultado = 0;

//		switch (cb.getO()) {
//		case 1:
//			cb.setR(cb.getV1() + cb.getV2());
//			break;
//		case 2:
//			cb.setR(cb.getV1() - cb.getV2());
//			break;
//		case 3:
//			cb.setR(cb.getV1() * cb.getV2());
//			break;
//		case 4:
//			cb.setR(cb.getV1() / cb.getV2());
//			break;
//
//		default:
//			cb.setR(0);
//			break;
//		}
//		logger.info("Resultado : " + cb.getR());
		
		try {
			CalculadoraProxy wsSoapCalculadora = new CalculadoraProxy();
			resultado = wsSoapCalculadora.operacion(cb.getO(),cb.getV1(),cb.getV2());
			logger.info("ProcesarOperacion: resultado    : " + resultado);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		cb.setR(resultado);
		return cb.getR();
		
		
	}
}
