package tarea6;

import java.util.Scanner;	//Captura de datos por teclado

public class Ejerc08App {
			
	public static void main(String[] args) {
		//Variables
		double[] vectorDeValores = new double[10];
				
		//Llamamos a los m�todos para llenar el vector de valores y mostrarlo
		capturaValores(vectorDeValores);
		muestraValores(vectorDeValores);
		
	}
	
	//M�todo para solicitar al usuario que d� valores para llenar un vector
	public static void capturaValores (double vectorDeValores[]) {
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
		
		//Entrada de datos por teclado
		for (int i = 0; i < vectorDeValores.length; i++) {
			System.out.println("Introduzca un valor num�rico (quedan "
					+ (vectorDeValores.length - i) + "):");
			vectorDeValores[i] = input.nextDouble();
		}
	}
	
	//M�todo para mostrar los valores de un vector double
	public static void muestraValores (double vectorDeValores[]) {
		//Salida por consola
		for (int i = 0; i < vectorDeValores.length; i++) {
			System.out.println("Posici�n " + (i + 1) + ". " + vectorDeValores[i]);
		}
	}

}
