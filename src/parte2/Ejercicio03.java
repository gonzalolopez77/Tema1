package parte2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num1
		int num1;
		
		//Crea la variable num2
		int num2;		
		
		//crea la variable resto
		int resto;
		
		//La consola te pide un numero entero
		System.out.println("Indica un numero entero:");
		num1 = sc.nextInt();
		
		//La consola te pide otro numero entero
		System.out.println("Indica otro numero entero:");
		num2 = sc.nextInt();
		
		//Usamos el ternario para que nos diga cuanto 
		//le falta para ser multiplo de num2
		resto = num1 % num2;
		num1 = (resto == 0) ? 0 : (num2 - resto);
		
		//Imprime en la consola cuanto le falta al numero 
		//que hemos indicado para ser multiplo de num2
		System.out.println("Le falta " +num1  + " para ser multiplo del segundo numero introducido");
				
		//Cierra el scanner
		sc.close();
	
	}

}
