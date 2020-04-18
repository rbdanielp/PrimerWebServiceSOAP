package uy.edu.fing.tsig.negocio.implementaciones;

import javax.jws.WebService;

import edu.fing.tsig.negocio.log.Loguear;
import uy.edu.fing.tsig.negocio.interfaces.Calculadora;

//***************************************************
//IMPLEMENTA LOS METODOS DEFINIDOS EN  LA INTERFAZ
//***************************************************

@WebService(endpointInterface="uy.edu.fing.tsig.negocio.interfaces.Calculadora")
public class CalculadoraImpl implements Calculadora{

	
	
	
	@Override
	public double operacion(int opcion, int valor1, int valor2) {
		Loguear.logTitulo("CalculadoraImpl: operacion: opcion: " + opcion);
		double resultado =0;
		
		
		switch (opcion) {
		case 1:
			resultado = valor1+valor2;
			break;
		case 2:
			resultado = valor1-valor2;
			break;
		case 3:
			resultado = valor1*valor2;
			break;
		case 4:
			resultado = valor1/valor2;
			break;

		default:
			resultado =0;
			break;
		}
		return resultado;
	}

}
