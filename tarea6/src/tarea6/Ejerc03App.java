package tarea6;

import java.util.Scanner;	//Captura de datos por teclado

public class Ejerc03App {

	public static void main(String[] args) {
		//Variables
		int valor = 0;
		boolean primo = true;
		
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
				
		//Entrada de datos por teclado
		System.out.println("Introduzca un valor natural para realizar "
				+ "la comprobación de si es primo o no:");
		valor = input.nextInt();
		primo = numeroPrimo(valor);
		
		//Salida por consola
		if (primo)
			System.out.println(valor + " es un número primo.");
		else
			System.out.println(valor + " NO es un número primo.");
		
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

}
