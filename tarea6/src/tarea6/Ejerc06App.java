package tarea6;

import java.util.Scanner;	//Captura de datos por teclado

public class Ejerc06App {

	public static void main(String[] args) {
		//Variables
		int valor = 0, numDeCifrasValor = 0;
		boolean error = false;
		
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
				
		//Entrada de datos por teclado con control de datos
		do {
			System.out.println("Introduzca un valor natural positivo. "
					+ "El programa le indicará cuántas cifras tiene.");
			if (input.hasNextInt()) {
				valor = input.nextInt();
				if (valor > 0)
					error = false;
				else {
					System.out.println("Los datos introducides no se ajustan "
							+ "a lo solicitado por el programa. ¡Volvamos a intentarlo!");
					input.nextLine();
					error = true;	
				}		
			}
			else {
				System.out.println("Los datos introducides no se ajustan "
						+ "a lo solicitado por el programa. ¡Volvamos a intentarlo!");
				input.nextLine();
				error = true;
			}
		} while (error);
		numDeCifrasValor = numeroDeCifras(valor);
		
		//Salida por consola
		System.out.println("Su número tiene " + numDeCifrasValor + " cifras.");

	}
	
	//Método que devuelve el número de cifras que tiene un valor
	public static int numeroDeCifras (int valor) {
		String numDeCifrasCadena = Integer.toString(valor);
		int numDeCifras = numDeCifrasCadena.length();
		
		return numDeCifras;
	}

}
