package parte2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un scanner
		Scanner sc = new Scanner(System.in);	
		
		//Crea la variable num1
		double num;
	
		int resultado;
		
		//La consola te pide un numero con decimales
		System.out.println("Indica un numero con decimales");
		num = sc.nextDouble();
		
		resultado = (int) (+ 0.5);
		//Te dice tu numero redondeado
		System.out.println("Se redondea a: " + resultado);
		
		//Cierra el scanner
		sc.close(); 
	}

}
