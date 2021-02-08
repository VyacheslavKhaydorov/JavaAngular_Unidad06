package tarea6;

import java.util.Scanner;	//Captura de datos por teclado

public class Ejerc05App {

	public static void main(String[] args) {
		//Variables
		int valor = 0;
		String numeroBinarioCadena = "";
		
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
				
		//Entrada de datos por teclado
		System.out.println("Introduzca un valor natural para pasarlo a binario:");
		valor = input.nextInt();
		numeroBinarioCadena = deDecimalABinario(valor);
		
		//Salida por consola
		System.out.println("Su número decimal: " + valor
				+ "\nSu número en base binaria: " + numeroBinarioCadena);

	}
	
	//Método para pasar de decimal a binario
	public static String deDecimalABinario (int valor) {
		String numeroBinarioCadena = "";
		int numeroBinario = 0;
		
		while (valor != 0) {
			numeroBinario = valor % 2;
			numeroBinarioCadena = numeroBinario + numeroBinarioCadena;
			valor = valor / 2;
		}
		return numeroBinarioCadena;
	}

}
