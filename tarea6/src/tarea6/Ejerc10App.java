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
		System.out.println("�Cu�ntos valores aleatorios primos deseas generar?");
		cantidadNumerosGenerados = input.nextInt();
		numAleatorio = new int[cantidadNumerosGenerados];
		System.out.println("Necesitamos dos valores para marcar el rango de los n�meros "
				+ "aleatorios que vamos a generar, ambos inclusive.\nIntroduce el primer valor:");
		valorRango1 = input.nextInt();
		System.out.println("Introduce el segundo valor:");
		valorRango2 = input.nextInt();
		
		//Llamada a m�todo para generar los n�meros aleatorios, �que adem�s deben ser primos!
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
		System.out.println("El valor mayor de entre los n�meros primos mostrados es: "
				+ valorMayor(numAleatorio));
		
	}
	
	//M�todo para generar un n�mero aleatorio (entre los valores par�metros que se le pasen)
	public static int numeroAleatorio (int valor1, int valor2) {
		//Generamos un n�mero aleatorio entre los valores valor1 y (valor2 + 1) porque
		//el segundo valor del m�todo no est� incluido
		int	numeroGenerado = ThreadLocalRandom.current().nextInt(valor1, valor2 + 1);
		
		return numeroGenerado;
	}
	
	//M�todo para calcular si un n�mero es primo o no
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
	
	//M�todo para ver cual es el valor mayor de un vector
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
	
	//M�todo para mostrar el contenido de un vector
	public static void contenidoVector (int vector[]) {
		for (int i = 0; i < vector.length; i++)		//Bucle para mostrar posici�n y valor
			System.out.println("Posici�n " + (i + 1) + ". " + vector[i] + " ");
	}

}
