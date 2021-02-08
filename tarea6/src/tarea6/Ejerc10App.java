package tarea6;

import java.util.Scanner;	//Captura de datos por teclado
import java.util.concurrent.ThreadLocalRandom;	//Para generar valores aleatorios

public class Ejerc10App {

	public static void main(String[] args) {
		//Variables
		int valorRango1 = 0, valorRango2 = 0, cantidadNumerosGenerados = 0;
		int[] numAleatorio;
		boolean numPrimo = true;

		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
		
		//Captura de datos por teclado
		System.out.println("¿Cuántos valores aleatorios primos deseas generar?");
		cantidadNumerosGenerados = input.nextInt();
		numAleatorio = new int[cantidadNumerosGenerados];
		System.out.println("Necesitamos dos valores para marcar el rango de los números "
				+ "aleatorios que vamos a generar, ambos inclusive.\nIntroduce el primer valor:");
		valorRango1 = input.nextInt();
		System.out.println("Introduce el segundo valor:");
		valorRango2 = input.nextInt();
		
		//Llamada a método para generar los números aleatorios, ¡que además deben ser primos!
		for (int i = cantidadNumerosGenerados; i > 0; i--) {
			do {
				numAleatorio[cantidadNumerosGenerados - i] =
						numeroAleatorio(valorRango1, valorRango2);
				numPrimo = numeroPrimo(numAleatorio[cantidadNumerosGenerados - i]);
			} while (!numPrimo);
		}
		
		//Salida por consola
		System.out.println("Los " + cantidadNumerosGenerados + " valores aleatorios primos "
				+ "que se han generado son:");
		contenidoVector(numAleatorio);
		System.out.println("El valor mayor de entre los números primos mostrados es: "
				+ valorMayor(numAleatorio));
		
	}
	
	//Método para generar un número aleatorio (entre los valores parámetros que se le pasen)
	public static int numeroAleatorio (int valor1, int valor2) {
		//Generamos un número aleatorio entre los valores valor1 y (valor2 + 1) porque
		//el segundo valor del método no está incluido
		int	numeroGenerado = ThreadLocalRandom.current().nextInt(valor1, valor2 + 1);
		
		return numeroGenerado;
	}
	
	//Método para calcular si un número es primo o no
	public static boolean numeroPrimo (int valor) {
		boolean primo = true;
		int modulo = 0;
		
		for (int i = (valor - 1); i > 1 && primo; i--) {
			modulo = valor % i;
			if (modulo == 0)
				primo = false;
		}
		
		return primo;
	}
	
	//Método para ver cual es el valor mayor de un vector
	public static int valorMayor (int vector[]) {
		//Variables
		int mayor = vector[0];
		
		//Recorremos el vector y miramos si los valores siguientes son superiores a los anteriores
		for (int i = 1; i < vector.length; i++) {
			if (mayor < vector[i])
				mayor = vector[i];
		}
		
		return mayor;
	}
	
	//Método para mostrar el contenido de un vector
	public static void contenidoVector (int vector[]) {
		for (int i = 0; i < vector.length; i++)		//Bucle para mostrar posición y valor
			System.out.println("Posición " + (i + 1) + ". " + vector[i] + " ");
	}

}
