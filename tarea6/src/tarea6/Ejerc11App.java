package tarea6;

import java.util.Random;						//Para reordenar los valores de un array
import java.util.Scanner;						//Captura de datos por teclado
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
		int[] vectorAux = numAleatorio1.clone();	//Muy importante, si no
													//el m�todo modificar� el
													//vector numAleatorio1 original
		numAleatorio2 = mezclarValoresDeVector(vectorAux);
		
		//Calculamos el resultado de multiplicar los valores del vector numAleatorio1 por
		//los valores del vector numAleatorio2 por posici�n y los guardamos en el vector
		//vectorMultiplicado
		vectorMultiplicado = multiplicarValoresVectoresPorPosicion(numAleatorio1, numAleatorio2);
		
		//Salida por consola
		System.out.println("Vector original:");
		contenidoVector(numAleatorio1);
		System.out.println("Vector mezclado:");
		contenidoVector(numAleatorio2);
		System.out.println("Multiplicamos el primer valor del primer vector por "
				+ "el primer valor del segundo vector,\nel segundo valor del primer "
				+ "vector por el segundo valor del segundo vector. etc.");
		contenidoVector(vectorMultiplicado);
		
	}
	
	//M�todo para generar un n�mero aleatorio (entre los valores par�metros que se le pasen)
	public static int numeroAleatorio (int valor1, int valor2) {
		//Generamos un n�mero aleatorio entre los valores valor1 y (valor2 + 1) porque
		//el segundo valor del m�todo no est� incluido
		int	numeroGenerado = ThreadLocalRandom.current().nextInt(valor1, valor2 + 1);
		
		return numeroGenerado;
	}
	
	//M�todo para mezclar los valores de un vector
	public static int[] mezclarValoresDeVector (int vector[]) {
		//Creamos un aleatorizador
		Random aleatorizador = ThreadLocalRandom.current();
		
		//Usamos un bucle para aleatorizar los valores del vector pasado
		//como parametro (Durstenfeld)
		for (int i = vector.length - 1; i > 0; i--) {
			int posicionEnVector = aleatorizador.nextInt(i + 1);
			//Hacemos el intercambio de valores
			int variableTemporal = vector[posicionEnVector];
			vector[posicionEnVector] = vector[i];
		    vector[i] = variableTemporal; 
		}
		
		return vector;
	}
	
	//M�todo para multiplicar los valores de un array por los valores de otro por posici�n
	public static int[] multiplicarValoresVectoresPorPosicion (int[] vector1, int[] vector2) {
		//Variables
		int[] vectorMultiplicado = new int[vector1.length];
		
		//Multiplicamos valores por posici�n (v1.0 por v2.0, v1.1 por v2.1, etc.)
		for (int i = 0; i < vector1.length; i++) {
			vectorMultiplicado[i] = vector1[i] * vector2[i];
		}
		
		return vectorMultiplicado;
	}
	
	//M�todo para mostrar el contenido de un vector
	public static void contenidoVector (int vector[]) {
		for (int i = 0; i < vector.length; i++)		//Bucle para mostrar posici�n y valor
			System.out.println("Posici�n " + (i + 1) + ". " + vector[i] + " ");
	}

}
