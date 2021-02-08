package tarea6;

import java.util.Arrays;	//Para reordenar los valores de un array
import java.util.Scanner;	//Captura de datos por teclado
import java.util.concurrent.ThreadLocalRandom;	//Para generar valores aleatorios

public class Ejerc11App {

	public static void main(String[] args) {
		//Variables
		int valorRango1 = 0, valorRango2 = 0, cantidadNumerosGenerados = 0;
		int[] numAleatorio1, numAleatorio2, vectorMultiplicado;

		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
		
		//Captura de datos por teclado
		System.out.println("Vamos a generar dos vectores y los vamos a "
				+ "llenar con valores aleatorios.");
		System.out.println("�Cu�ntos valores aleatorios deseas generar?");
		cantidadNumerosGenerados = input.nextInt();
		numAleatorio1 = new int[cantidadNumerosGenerados];
		numAleatorio2 = new int[cantidadNumerosGenerados];
		System.out.println("Necesitamos dos valores para marcar el rango de los n�meros "
				+ "aleatorios que vamos a generar, ambos inclusive.\nIntroduce el primer valor:");
		valorRango1 = input.nextInt();
		System.out.println("Introduce el segundo valor:");
		valorRango2 = input.nextInt();
		
		//Llamada a m�todo para generar los n�meros aleatorios
		for (int i = cantidadNumerosGenerados; i > 0; i--) {
			numAleatorio1[cantidadNumerosGenerados - i] = numeroAleatorio(valorRango1, valorRango2);
		}
		
		//Pasamos los n�meros de un array a otro y los mezclamos
		mezclarValoresDeVector(numAleatorio2);
		
		//Calculamos el resultado de multiplicar los valores del vector numAleatorio1 por
		//los valores del vector numAleatorio2 por posici�n y los guardamos en el vector
		//vectorMultiplicado
		vectorMultiplicado = multiplicarValoresVectoresPorPosicion(numAleatorio1, numAleatorio2);
		
		//Salida por consola
		System.out.println("Los " + cantidadNumerosGenerados + " valores aleatorios "
				+ "que se han generado son:");
		for (int i = 0; i < numAleatorio.length; i++)
			System.out.print(numAleatorio[i] + " ");
		
	}
	
	//M�todo para generar un n�mero aleatorio (entre los valores par�metros que se le pasen)
	public static int numeroAleatorio (int valor1, int valor2) {
		//Generamos un n�mero aleatorio entre los valores valor1 y (valor2 + 1) porque
		//el segundo valor del m�todo no est� incluido
		int	numeroGenerado = ThreadLocalRandom.current().nextInt(valor1, valor2 + 1);
		
		return numeroGenerado;
	}
	
	//M�todo para mezclar los valores de un vector y pasarlos a otro
	public static int[] mezclarValoresDeVector (int vector[]) {
		int[] vectorMezclado;
		Arrays.sort(vector);
		vectorMezclado = vector;
		return vectorMezclado;
	}
	
	//
	public static int[] multiplicarValoresVectoresPorPosicion (int vector1, int vector2) {
		int[] vectorMultiplicado;
		for (int i = 0) {
			
		}
		
		return vectorMultiplicado;
	}

}
