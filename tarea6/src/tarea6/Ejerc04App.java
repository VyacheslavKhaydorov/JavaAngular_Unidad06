package tarea6;

import java.util.Scanner;	//Captura de datos por teclado

public class Ejerc04App {

	public static void main(String[] args) {
		//Variables
		int valor = 0, factorial = 0;
		
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
				
		//Entrada de datos por teclado
		System.out.println("Introduzca un valor natural para calcular su factorial:");
		valor = input.nextInt();
		factorial = numeroFactorial(valor);
		
		//Salida por consola
		System.out.println("El factorial de " + valor + " es " + factorial);
		
	}
	
	//Método para calcular el factorial de un número (ejemplo: factorial de 5 = 5 * 4 * 3 * 2 * 1)
	public static int numeroFactorial (int valor) {
		int factorial = valor;
		while (valor > 1) {
			valor--;
			factorial = factorial * valor;
		}
		
		return factorial;
	}

}
