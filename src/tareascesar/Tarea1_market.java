package tareascesar;

public class Tarea1_market {

	public String ciudad, direccion;
	public static int num_empleados = 0;

	// Constructor basico
	public Tarea1_market() {
		this.ciudad = "Sevilla";
		this.direccion = "C/Pizarro 5000";
	}

	// Muestra la informacion del objeto
	public void mostrar() {
		System.out.println("ciudad=" + ciudad + ", direccion=" + direccion + ", numero de empleados="
				+ Tarea1_market.num_empleados);
	}

	public static void main(String[] args) {

		Tarea1_lacteos L1 = new Tarea1_lacteos((byte) 7, (byte) 10);
		L1.mostrar();
		Tarea1_lacteos L2 = new Tarea1_lacteos((byte) 4, (byte) 10);
		L2.mostrar();
		Tarea1_congelados C1 = new Tarea1_congelados((byte) 4);
		C1.mostrar();
		Tarea1_congelados C2 = new Tarea1_congelados((byte) 3);
		C2.mostrar();

		Tarea1_lacteos L3 = new Tarea1_lacteos((byte) 4, (byte) 10);
		L3.mostrar();
		Tarea1_congelados C3 = new Tarea1_congelados("Zaragoza", "C/Magallanes 6000", (byte) 8);
		C3.mostrar();

	}

}
