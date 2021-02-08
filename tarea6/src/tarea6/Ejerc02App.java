package tarea6;

import java.util.Scanner;	//Captura de datos por teclado
import java.util.concurrent.ThreadLocalRandom;	//Para generar valores aleatorios

public class Ejerc02App {

	public static void main(String[] args) {
		//Variables
		int valorRango1 = 0, valorRango2 = 0, cantidadNumerosGenerados = 0;
		int[] numAleatorio;

		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
		
		//Captura de datos por teclado
		System.out.println("¿Cuántos valores aleatorios deseas generar?");
		cantidadNumerosGenerados = input.nextInt();
		numAleatorio = new int[cantidadNumerosGenerados];
		System.out.println("Necesitamos dos valores para marcar el rango de los números "
				+ "aleatorios que vamos a generar, ambos inclusive.\nIntroduce el primer valor:");
		valorRango1 = input.nextInt();
		System.out.println("Introduce el segundo valor:");
		valorRango2 = input.nextInt();
		
		//Llamada a método para generar los números aleatorios
		for (int i = cantidadNumerosGenerados; i > 0; i--) {
			numAleatorio[cantidadNumerosGenerados - i] = numeroAleatorio(valorRango1, valorRango2);
		}
		
		//Salida por consola
		System.out.println("Los " + cantidadNumerosGenerados + " valores aleatorios "
				+ "que se han generado son:");
		for (int i = 0; i < numAleatorio.length; i++)
			System.out.print(numAleatorio[i] + " ");
		
	}
	
	//Método para generar un número aleatorio (entre los valores parámetros que se le pasen)
	public static int numeroAleatorio (int valor1, int valor2) {
		//Generamos un número aleatorio entre los valores valor1 y (valor2 + 1) porque
		//el segundo valor del método no está incluido
		int	numeroGenerado = ThreadLocalRandom.current().nextInt(valor1, valor2 + 1);
		
		return numeroGenerado;
	}
	
}
