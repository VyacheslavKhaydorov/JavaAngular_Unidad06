package tarea6;

import java.util.Scanner;	//Captura de datos por teclado
import java.math.*;			//Para la potenciación

public class Ejerc01App {

	public static void main(String[] args) {
		//Variables y constantes
		double radio = 0, base = 0, altura = 0, lado = 0, area = 0;
		int figuraElegida = 0;
		
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
		
		//Captura de datos por teclado
		System.out.println("¿Cual es la figura geométrica de la que desea calcular el área?\n"
				+ "1. Círculo.\n"
				+ "2. Triángulo.\n"
				+ "3. Cuadrado.");
		figuraElegida = input.nextInt();
		
		//Llamada a métodos externos para calcular el área de la figura escogida
		switch (figuraElegida) {
			case 1:		//Círculo
				System.out.println("Introduzca el radio del círculo:");
				radio = input.nextDouble();
				area = areaCirculo(radio);
				break;
			case 2:		//Triángulo
				System.out.println("Introduzca la base del triángulo:");
				base = input.nextDouble();
				System.out.println("Introduzca la altura del triángulo:");
				altura = input.nextDouble();
				area = areaTriangulo(base, altura);
				break;
			case 3:		//Cuadrado
				System.out.println("Introduzca la longitud del lado del cuadrado:");
				lado = input.nextDouble();
				area = areaCuadrado(lado);
				break;
			default:
		}
		
		//Salida por consola
		System.out.println("El área de la figura geométrica escogida es de " + area);

	}
	
	//Métodos para calcular áreas
	//Área del círculo
	public static double areaCirculo (double radio) {
		final double PI = 3.14;		//Constante pi
		double area = Math.pow(radio, 2) * PI;
		/*Utilizamos la librería java.math para la potenciación, aunque
		también se podría hacer sin recurrir a ella:
		double area = radio * radio * PI;*/
		return area;
	}
	
	//Área del triángulo
	public static double areaTriangulo (double base, double altura) {
		double area = base * altura / 2;
		return area;
	}

	//Área del cuadrado
	public static double areaCuadrado (double lado) {
		double area = lado * lado;
		return area;
	}

}
