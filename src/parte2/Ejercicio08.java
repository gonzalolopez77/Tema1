package parte2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea las variables longitudM y longitudCM
		double longitudM;
		int longitudCM;
		
		//La consola te pide que indiques la longitud en metros
		System.out.println("Indica la longitud en metros con cuantos decimales como desees: ");
		longitudM = sc.nextDouble();
		
		//Pasa los metros a centimetros y lo convierte en int para que no tenga decimales
		longitudCM = (int) (longitudM / 100);
		
		//Muestra por consola los centimetros que valen para la competicion
		System.out.println("Serian: " + longitudCM + "cm");
		
		//Cierra el scanner
		sc.close();
		
	}

}
