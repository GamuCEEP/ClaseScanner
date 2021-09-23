package claseescaner;

import java.util.Scanner;


public class Prueba_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bienvenido, ¿Cual es tu color favorito?");
		
		String color_favorito = scan.nextLine();
		
		System.out.println("Tu color favorito es el "+color_favorito);
		
		scan.close();

	}

}
