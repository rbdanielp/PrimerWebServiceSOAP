package uy.edu.fing.tsig.negocio.backend;

import java.util.Scanner;

public class Consola {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int opcion;
		while(true) {
			System.out.println("/////////////////////");
			System.out.println("TSIG - 2020 - Grupo X");
			System.out.println("/////////////////////");
			System.out.println("1-           Opcion A");
			System.out.println("2-           Opcion B");
			System.out.println("3-           Opcion C");
			System.out.println("4-           Opcion D");
			System.out.println("/////////////////////");
			opcion = Integer.parseInt(entrada.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("Ha seleccinado: 1- Opcion A");
				break;

			case 2:
				System.out.println("Ha seleccinado: 2- Opcion B");
				break;
				
			case 3:
				System.out.println("Ha seleccinado: 3- Opcion C");
				break;
				
			case 4:
				System.out.println("Ha seleccinado: 4- Opcion D");
				break;
			}
			
		}

	}

}
