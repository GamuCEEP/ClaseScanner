package tarea1cesar;

import java.util.Scanner;

public class Congelados extends Market {

	public String ano_fundacion;
	public byte num_empleadosC;
	private Scanner scan = new Scanner(System.in);

	// Constructor basico
	public Congelados(byte num_empleados) {
		// LLama al constructor de market
		super();

		// Pide el año de fundacion y lo guarda
		System.out.println("Escribe el año de fundación");
		this.ano_fundacion = scan.nextLine();
		this.num_empleadosC = num_empleados
		// Añade el numero de empleados a la variable de market
		Market.num_empleados += num_empleados;
	}

	// Constructor para sobreescribir los datos del market (Sobrecarga)
	public Congelados(String ciudad, String direccion, byte num_empleados) {
		// Sobreescribe los datos de market
		this.ciudad = ciudad;
		this.direccion = direccion;

		// Pide el año de fundacion y lo guarda
		System.out.println("Escribe el año de fundación");
		this.ano_fundacion = scan.nextLine();

		// Añade el numero de empleados a la variable de market
		Market.num_empleados += num_empleados;
	}

	// Muestra toda la informacion del objeto (Sobrescritura)
	public void mostrar() {
		System.out.println("ano_fundacion=" + ano_fundacion + ", num_empleados=" + num_empleados + "num_empleadosC=" + num_empleadosC + ", ciudad=" + ciudad
				+ ", direccion=" + direccion);
	}
}
