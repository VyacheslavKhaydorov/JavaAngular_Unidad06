package tarea6;

import java.util.Scanner;	//Captura de datos por teclado
import java.math.*;			//Para la potenciaci�n

public class Ejerc01App {

	public static void main(String[] args) {
		//Variables y constantes
		double radio = 0, base = 0, altura = 0, lado = 0, area = 0;
		int figuraElegida = 0;
		
		//Creamos un nuevo Scanner
		Scanner input = new Scanner(System.in);
		
		//Captura de datos por teclado
		System.out.println("�Cual es la figura geom�trica de la que desea calcular el �rea?\n"
				+ "1. C�rculo.\n"
				+ "2. Tri�ngulo.\n"
				+ "3. Cuadrado.");
		figuraElegida = input.nextInt();
		
		//Llamada a m�todos externos para calcular el �rea de la figura escogida
		switch (figuraElegida) {
			case 1:		//C�rculo
				System.out.println("Introduzca el radio del c�rculo:");
				radio = input.nextDouble();
				area = areaCirculo(radio);
				break;
			case 2:		//Tri�ngulo
				System.out.println("Introduzca la base del tri�ngulo:");
				base = input.nextDouble();
				System.out.println("Introduzca la altura del tri�ngulo:");
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
		System.out.println("El �rea de la figura geom�trica escogida es de " + area);

	}
	
	//M�todos para calcular �reas
	//�rea del c�rculo
	public static double areaCirculo (double radio) {
		final double PI = 3.14;		//Constante pi
		double area = Math.pow(radio, 2) * PI;
		/*Utilizamos la librer�a java.math para la potenciaci�n, aunque
		tambi�n se podr�a hacer sin recurrir a ella:
		double area = radio * radio * PI;*/
		return area;
	}
	
	//�rea del tri�ngulo
	public static double areaTriangulo (double base, double altura) {
		double area = base * altura / 2;
		return area;
	}

	//�rea del cuadrado
	public static double areaCuadrado (double lado) {
		double area = lado * lado;
		return area;
	}

}
