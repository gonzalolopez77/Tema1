package parte2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num
		int num;
		
		//Crea la variable resto
		int resto;
		
		//La consola te pide un numero entero
		System.out.println("Indica un numero entero:");
		num = sc.nextInt();
		
		//Usamos el terciario para que nos diga cuanto 
		//le falta para ser multiplo de 7
		resto = num % 7;
		num = (resto == 0) ? 0 : (7 - resto);
		
		//Imprime en la consola cuanto le falta al numero 
		//que hemos indicado para ser multiplo de 7
		System.out.println("Le falta " +num  + " para ser multiplo de 7");
		
		//Cierra el scanner
		sc.close();

	}

}
