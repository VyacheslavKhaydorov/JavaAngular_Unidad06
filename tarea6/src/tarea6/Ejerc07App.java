package tarea6;

import java.util.Scanner;	//Captura de datos por teclado

public class Ejerc07App {

	public static void main(String[] args) {
		//Variables
		double euros = 0;
		String moneda = "";
		
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
				
		//Entrada de datos por teclado
		System.out.println("Introduzca el valor de euros que quiere convertir:");
		euros = input.nextDouble();
		input.nextLine();		//Para que el nextLine() que sigue no recoja el salto de carro
		System.out.println("Introduzca a qué moneda quiere convertir el valor introducido.\n"
				+ "1. Libra\n"
				+ "2. Dolar\n"
				+ "3. Yen");
		moneda = input.nextLine();
		cambioDeMoneda(euros, moneda);
		
	}
	
	//Métodos para el cambio de moneda
	public static void cambioDeMoneda (double euros, String moneda) {
		final double CAMBIO_LIBRA = 0.86;
		final double CAMBIO_DOLAR = 1.28611;
		final double CAMBIO_YEN = 129852;
		double cambio = 0;
		
		//Selección de la moneda
		moneda = moneda.toLowerCase();
		switch (moneda) {
			case "libra":
				cambio = euros * CAMBIO_LIBRA;
				if (cambio != 1)		//Puramente estético para la salida por consola posterior
					moneda += "s";
				break;	
			case "dolar":
				cambio = euros * CAMBIO_DOLAR;
				if (cambio != 1)
					moneda += "es";
				break;
			case "yen":
				cambio = euros * CAMBIO_YEN;
				if (cambio != 1)
					moneda += "es";
				break;
		}
		
		//Salida por consola
		System.out.printf("%.2f€ equivale a %.2f %s.", euros, cambio, moneda);
		
	}

}
