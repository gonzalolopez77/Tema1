package parte2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc =new Scanner(System.in);
		
		//Crea la variable distancia1
		double distancia1;
		
		//Crea la variable distancia2
		double distancia2;
		
		//Crea la variable distancia3
		double distancia3;	
		
		//Crea la variable suma
		double suma;
		
		//La consola te pide que indiques una medida en milimetros
		System.out.println("Indica una medida en milimetros:");
		distancia1 = sc.nextDouble();
		
		//La consola te pide que indiques una medida en centimetros
		System.out.println("Indica una medida en centimetros:");
		distancia2 = sc.nextDouble();
		
		//La consola te pide que indiques una medida en metros
		System.out.println("Indica una medida en metros:");
		distancia3 = sc.nextDouble();
		
		//Pasamos todo a centimetros y lo sumamos
		suma = (distancia1 / 10) + distancia2 + (distancia3 * 100);
		
		//La consola indica la suma de las distancias en centimetros
		System.out.println("La suma de las distancias es: " + suma + " cm");
		
		//Cierra el scanner
		sc.close();
		
	}

}
