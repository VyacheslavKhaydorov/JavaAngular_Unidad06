package tarea6;

import java.util.Scanner;	//Captura de datos por teclado
import java.util.concurrent.ThreadLocalRandom;	//Para generar valores aleatorios

public class Ejerc09App {
	
	public static void main(String[] args) {
		//Variables y constantes
		final int RANGO_MIN = 0;
		final int RANGO_MAX = 9;
		int cantidadNumerosGenerados = 0;
		int[] numAleatorio;

		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
		
		//Captura de datos por teclado
		System.out.println("¿Cuántos valores aleatorios deseas generar?");
		cantidadNumerosGenerados = input.nextInt();
		numAleatorio = new int[cantidadNumerosGenerados];
		for (int i = cantidadNumerosGenerados; i > 0; i--) {
			
			//Llamada a método para generar el número aleatorio
			numAleatorio[cantidadNumerosGenerados - i] = numeroAleatorio(RANGO_MIN, RANGO_MAX);
		}
		
		//Salida por consola
		System.out.println("Los " + cantidadNumerosGenerados + " valores aleatorios "
				+ "que se han generado son:");
		contenidoVectorYSumatorio(numAleatorio);
		
	}
	
	//Método para generar un número aleatorio (entre los valores parámetros que se le pasen)
	public static int numeroAleatorio (int valor1, int valor2) {
		//Generamos un número aleatorio entre los valores valor1 y (valor2 + 1) porque
		//el segundo valor del método no está incluido
		int	numeroGenerado = ThreadLocalRandom.current().nextInt(valor1, valor2 + 1);
		
		return numeroGenerado;
	}
	
	//Método para mostrar el contenido de un vector y su sumatorio
	public static void contenidoVectorYSumatorio (int vector[]) {
		int sumatorio = 0;
		for (int i = 0; i < vector.length; i++) {		//Bucle para mostrar posición y valor
			System.out.println("Posición " + (i + 1) + ". " + vector[i] + " ");
			sumatorio += vector[i];
		}
		
		//Mostramos el sumatorio
		System.out.println("El sumatorio de todos los valores es de " + sumatorio);
	}
	
}
