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
		System.out.println("¿Cuántos valores aleatorios deseas generar?");
		cantidadNumerosGenerados = input.nextInt();
		numAleatorio1 = new int[cantidadNumerosGenerados];
		numAleatorio2 = new int[cantidadNumerosGenerados];
		System.out.println("Necesitamos dos valores para marcar el rango de los números "
				+ "aleatorios que vamos a generar, ambos inclusive.\nIntroduce el primer valor:");
		valorRango1 = input.nextInt();
		System.out.println("Introduce el segundo valor:");
		valorRango2 = input.nextInt();
		
		//Llamada a método para generar los números aleatorios
		for (int i = cantidadNumerosGenerados; i > 0; i--) {
			numAleatorio1[cantidadNumerosGenerados - i] = numeroAleatorio(valorRango1, valorRango2);
		}
		
		//Pasamos los números de un array a otro y los mezclamos
		int[] vectorAux = numAleatorio1.clone();	//Muy importante, si no
													//el método modificará el
													//vector numAleatorio1 original
		numAleatorio2 = mezclarValoresDeVector(vectorAux);
		
		//Calculamos el resultado de multiplicar los valores del vector numAleatorio1 por
		//los valores del vector numAleatorio2 por posición y los guardamos en el vector
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
	
	//Método para generar un número aleatorio (entre los valores parámetros que se le pasen)
	public static int numeroAleatorio (int valor1, int valor2) {
		//Generamos un número aleatorio entre los valores valor1 y (valor2 + 1) porque
		//el segundo valor del método no está incluido
		int	numeroGenerado = ThreadLocalRandom.current().nextInt(valor1, valor2 + 1);
		
		return numeroGenerado;
	}
	
	//Método para mezclar los valores de un vector
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
	
	//Método para multiplicar los valores de un array por los valores de otro por posición
	public static int[] multiplicarValoresVectoresPorPosicion (int[] vector1, int[] vector2) {
		//Variables
		int[] vectorMultiplicado = new int[vector1.length];
		
		//Multiplicamos valores por posición (v1.0 por v2.0, v1.1 por v2.1, etc.)
		for (int i = 0; i < vector1.length; i++) {
			vectorMultiplicado[i] = vector1[i] * vector2[i];
		}
		
		return vectorMultiplicado;
	}
	
	//Método para mostrar el contenido de un vector
	public static void contenidoVector (int vector[]) {
		for (int i = 0; i < vector.length; i++)		//Bucle para mostrar posición y valor
			System.out.println("Posición " + (i + 1) + ". " + vector[i] + " ");
	}

}
