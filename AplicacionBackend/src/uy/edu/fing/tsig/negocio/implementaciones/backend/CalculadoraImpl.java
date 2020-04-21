package uy.edu.fing.tsig.negocio.implementaciones.backend;

import javax.jws.WebService;

import edu.fing.tsig.negocio.log.Loguear;
import uy.edu.fing.tsig.negocio.interfaces.backend.Calculadora;

//***************************************************
//IMPLEMENTA LOS METODOS DEFINIDOS EN  LA INTERFAZ
//***************************************************

@WebService(endpointInterface = "uy.edu.fing.tsig.negocio.interfaces.backend.Calculadora")
public class CalculadoraImpl implements Calculadora {

	@Override
	public double operacion(int opcion, int valor1, int valor2) {
		Loguear.logTitulo("CalculadoraImpl: operacion: opcion: " + opcion);
		double resultado = 0;

		switch (opcion) {
		case 1:
			Loguear.logTitulo("CalculadoraImpl: SUMA ");
			resultado = valor1 + valor2;
			break;
		case 2:
			Loguear.logTitulo("CalculadoraImpl: RESTA ");
			resultado = valor1 - valor2;
			break;
		case 3:
			Loguear.logTitulo("CalculadoraImpl: MULTIPLICACION ");
			resultado = valor1 * valor2;
			break;
		case 4:
			Loguear.logTitulo("CalculadoraImpl: DIVISION ");
			resultado = valor1 / valor2;
			break;

		default:
			resultado = 0;
			break;
		}
		return resultado;
	}

}
