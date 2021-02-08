package tarea6;

import java.util.Scanner;	//Captura de datos por teclado

public class Ejerc08App {
			
	public static void main(String[] args) {
		//Variables
		double[] vectorDeValores = new double[10];
				
		//Llamamos a los métodos para llenar el vector de valores y mostrarlo
		capturaValores(vectorDeValores);
		muestraValores(vectorDeValores);
		
	}
	
	//Método para solicitar al usuario que dé valores para llenar un vector
	public static void capturaValores (double vectorDeValores[]) {
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
		
		//Entrada de datos por teclado
		for (int i = 0; i < vectorDeValores.length; i++) {
			System.out.println("Introduzca un valor numérico (quedan "
					+ (vectorDeValores.length - i) + "):");
			vectorDeValores[i] = input.nextDouble();
		}
	}
	
	//Método para mostrar los valores de un vector double
	public static void muestraValores (double vectorDeValores[]) {
		//Salida por consola
		for (int i = 0; i < vectorDeValores.length; i++) {
			System.out.println("Posición " + (i + 1) + ". " + vectorDeValores[i]);
		}
	}

}
