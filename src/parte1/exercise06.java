package parte1;

import java.util.Scanner;

public class exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num1
		double num1;
		
		//Crea la variable num2
		double num2;
		
		//Crea la variable suma
		double suma;
		
		//Crea la variable resta
				double resta;
				
		//Crea la variable multiplicacion
		double multiplicacion;
				
		//Crea la variable division
		double division;
		
		//Imprime por pantalla que introduzcas un numero
		System.out.println("Introduce un numero");
				
		//La consola espera a que introduzcas un numero
		num1 = sc.nextInt();
		
		//Imprime por pantalla que introduzcas otro numero
		System.out.println("Introduce otro numero");
		
		//La consola espera a que introduzcas otro numero
		num2 = sc.nextInt();
				
		//Calcula la suma
		suma = (num1 + num2);
		
		//Calcula la resta
		resta = (num1 - num2);
		
		//Calcula la multiplicacion
		multiplicacion = (num1 * num2);
		
		//Calcula la division
		division = (num1 / num2);
		
		//La consola imprime la suma
		System.out.println("La suma es:" + suma);
		
		//La consola imprime la resta
		System.out.println("La resta es:" + resta);
				
		//La consola imprime la multiplicacion
		System.out.println("La multiplicacion es:" + multiplicacion);
				
		//La consola imprime la division
		System.out.println("La division es:" + division);
		
		//Cierra el scanner
		sc.close();
	}

}
