package tareascesar;

import java.util.Scanner;

public class Tarea1_congelados extends Tarea1_market {

	public String ano_fundacion;
	private Scanner scan = new Scanner(System.in);

	// Constructor basico
	public Tarea1_congelados(byte num_empleados) {
		// LLama al constructor de market
		super();

		// Pide el año de fundacion y lo guarda
		System.out.println("Escribe el año de fundación");
		this.ano_fundacion = scan.nextLine();

		// Añade el numero de empleados a la variable de market
		Tarea1_market.num_empleados += num_empleados;
	}

	// Constructor para sobreescribir los datos del market (Sobrecarga)
	public Tarea1_congelados(String ciudad, String direccion, byte num_empleados) {
		// Sobreescribe los datos de market
		this.ciudad = ciudad;
		this.direccion = direccion;

		// Pide el año de fundacion y lo guarda
		System.out.println("Escribe el año de fundación");
		this.ano_fundacion = scan.nextLine();

		// Añade el numero de empleados a la variable de market
		Tarea1_market.num_empleados += num_empleados;
	}

	// Muestra toda la informacion del objeto (Sobrescritura)
	public void mostrar() {
		System.out.println("ano_fundacion=" + ano_fundacion + ", num_empleados=" + num_empleados + ", ciudad=" + ciudad
				+ ", direccion=" + direccion);
	}
}
