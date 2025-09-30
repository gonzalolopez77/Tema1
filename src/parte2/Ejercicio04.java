package parte2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable a
		double a;
		
		//Creamos la variable b
		double b;
		
		//Creamos la variable c
		double c;
		
		//Creamos la variable x
		double x;	
		
		//Creamos la variable y
		double y;
		
		//La consola te pide que indiques el valor de a 
		System.out.println("Indica el valor de a: ");
		a = sc.nextDouble();
		
		//La consola te pide que indiques el valor de b 
		System.out.println("Indica el valor de b: ");
		b = sc.nextDouble();
		
		//La consola te pide que indiques el valor de c 
		System.out.println("Indica el valor de c: ");
		c = sc.nextDouble();
		
		//La consola te pide que indiques el valor de x 
		System.out.println("Indica el valor de x: ");
		x = sc.nextDouble();		
		
		//Añadimos cada variable a la formula y la calculamos
		y = (a * Math.pow(x, 2)) + (b * x) + (c);
		
		//Imprime por pantalla el resultado de la ecuacion
		System.out.println("El resultado de la ecuacion es. " + y);
		
		//Cerramos el scanner
		sc.close();
	}

}
