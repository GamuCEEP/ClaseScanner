package cesar.interfaces;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		//Creamos un escaner
		Scanner scanner = new Scanner(System.in);
		
		//Creamos los objetos para guardar informacion
		DiscoDuro discoDuro = new DiscoDuro();// -disco duro
		SSD ssd = new SSD();	// -ssd
		USB usb = new USB();	// -usb
		Nube nube = new Nube();	// -nube
		
		//Array con todos los metodos de guardado
		//								1		2    3     4
		MetodoGuardado[] metodos = {discoDuro, ssd, usb, nube};
		
		System.out.println("Como quieres guardarlo?\n"+
				"1-disco duro\n"+
				"2-ssd\n"+
				"3-usb\n"+
				"4-nube");
		//Restamos 1 porque los arrays empiezan en 0
		int metodo = scanner.nextInt() - 1;
		
		//Llamamos a guardar del objeto elegido
		metodos[metodo].guardar();
		
		
		
		
		

	}
}
