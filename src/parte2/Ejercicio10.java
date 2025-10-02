package parte2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea las variables año y siglo
		int año;
		int siglo;
		
		//La consola pide que indiques un año
		System.out.println("Indica un año: ");
		año = sc.nextInt();
		
		//Divide el año entre 100 y le sume 1 para que de el siglo al que pertenece
		//Y a año le restamos uno para que por ejemplo 2000 no indique que es del siglo 21
		siglo = (año - 1) / 100 + 1;
		
		//La consola imprime en que volumen esta ese problema
		System.out.println("Ese año pertenece al siglo " + siglo);
		
		//Cierra el scanner
		sc.close();		
	}

}
