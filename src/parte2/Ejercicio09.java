package parte2;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea el scanner
		Scanner sc = new Scanner(System.in);
		
		//Crea las variables problema y volumen
		int problema;
		int volumen;
		
		//La consola pide que indiques el numero de problema
		System.out.println("Indica tu numero de problema(100-999): ");
		problema = sc.nextInt();
		
		//Divide el numero de problema entre 100 ya que asi solo queda el numero del volumen
		volumen = (problema / 100);
		
		//La consola imprime en que volumen esta ese problema
		System.out.println("Ese problema se encuentra en el volumen " + volumen);
		
		//Cierra el scanner
		sc.close();
		
	}

}
