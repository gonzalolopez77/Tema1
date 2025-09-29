package parte2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea la variable num
		int num;
		int resto;
		
		//La consola te pide un numero entero
		System.out.println("Indica un numero entero:");
		num = sc.nextInt();
		
		resto = num % 7;
		num = (resto == 0) ? 0 : (7 - resto);
		
		//Cierra el scanner
		sc.close();

	}

}
