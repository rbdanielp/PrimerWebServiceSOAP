package edu.fing.tsig.negocio;

import java.util.logging.Logger;

import edu.fing.tsig.negocio.beans.CalculadoraBean;
import edu.fing.tsig.negocio.log.Loguear;

public class Fachada {
	private static final Logger logger = Logger.getLogger("Fachada.class");

	public static double ProcesarOperacion(CalculadoraBean cb) {
		Loguear.logTitulo("Fachada: ProcesarOperacion");

		switch (cb.getO()) {
		case 1:
			cb.setR(cb.getV1() + cb.getV2());
			break;
		case 2:
			cb.setR(cb.getV1() - cb.getV2());
			break;
		case 3:
			cb.setR(cb.getV1() * cb.getV2());
			break;
		case 4:
			cb.setR(cb.getV1() / cb.getV2());
			break;

		default:
			cb.setR(0);
			break;
		}
		logger.info("Resultado : " + cb.getR());
		return cb.getR();
	}
}
