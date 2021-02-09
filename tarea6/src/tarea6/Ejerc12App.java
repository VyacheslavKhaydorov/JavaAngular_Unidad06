package tarea6;

import java.util.Scanner;						//Captura de datos por teclado
import java.util.concurrent.ThreadLocalRandom;	//Para generar valores aleatorios

public class Ejerc12App {

	public static void main(String[] args) {
		//Variables y constantes
		final int RANGO_MIN = 1;
		final int RANGO_MAX = 300;
		int cantidadNumerosGenerados = 0;
		int[] numAleatorio, numSolicitado;

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
		contenidoVector(numAleatorio);
		numSolicitado = mostrarValoresAcabadosEnX(numAleatorio);
		//No usamos el método contenidoVector porque queremos eliminar los valores nulos
		for (int i = 0; i < numSolicitado.length; i++) {
			if (numSolicitado[i] == 0)
				break;
			else
				System.out.println("Posición " + (i + 1) + ". " + numSolicitado[i] + " ");
		}
		
	}
	
	//Método para generar un número aleatorio (entre los valores parámetros que se le pasen)
	public static int numeroAleatorio (int valor1, int valor2) {
		//Generamos un número aleatorio entre los valores valor1 y (valor2 + 1) porque
		//el segundo valor del método no está incluido
		int	numeroGenerado = ThreadLocalRandom.current().nextInt(valor1, valor2 + 1);
		
		return numeroGenerado;
	}
	
	//Método para mostrar el contenido de un vector
	public static void contenidoVector (int vector[]) {
		for (int i = 0; i < vector.length; i++)		//Bucle para mostrar posición y valor
			System.out.println("Posición " + (i + 1) + ". " + vector[i] + " ");
	}
	
	//Método para mostrar, de entre los valores de un vector, los que acaban con un número concreto
	public static int[] mostrarValoresAcabadosEnX (int[] vector) {
		//Variables y constantes
		final int NUMERO_MIN = 0;
		final int NUMERO_MAX = 9;
		int numeroBuscado = 0, contador = 0;
		int[] vectorRetorno = new int[vector.length];
		boolean error = false;
		
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
				
		//Captura de datos por teclado (con control)
		do {
			System.out.println("¿Valores acabados con qué número desea que se le muestren?\n"
					+ "Introduzca un número entre " + NUMERO_MIN + " y " + NUMERO_MAX + ":");
			if (input.hasNextInt()) {
				numeroBuscado = input.nextInt();
				if (numeroBuscado >= NUMERO_MIN && numeroBuscado <= NUMERO_MAX)
					error = false;
				else {
					System.out.println("¡El valor introducido no es correcto! Inténtelo de nuevo.");
					input.nextLine();	//Para limpiar el Scanner
					error = true;
				}
			}
			else {
				System.out.println("¡El valor introducido no es correcto! Inténtelo de nuevo.");
				input.nextLine();	//Para limpiar el Scanner
				error = true;
			}
		} while (error);
		
		//Buscamos los valores acabados en numeroBuscado
		for (int i = 0; i < vector.length; i++) {
			if (cifraFinalDeValor(vector[i]) == numeroBuscado) {
				vectorRetorno[contador] = vector[i];
				contador++;
			}
		}
		
		return vectorRetorno;
	}
	
	//Método que devuelve la cifra final de un valor
	public static int cifraFinalDeValor (int valor) {
		String valorCadena = Integer.toString(valor);	//Pasamos el valor int a cadena
		char charAux = (valorCadena.charAt(valorCadena.length() - 1));	//Identificamos el
																		//caracter final
		
		int cifraFinal = Character.getNumericValue(charAux);	//Cogemos el valor numérico
		
		return cifraFinal;
	}

}
