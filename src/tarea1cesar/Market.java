package tarea1cesar;

public class Market {

	public String ciudad, direccion;
	public static int num_empleados = 0;

	// Constructor basico
	public Market() {
		this.ciudad = "Sevilla";
		this.direccion = "C/Pizarro 5000";
	}

	// Muestra la informacion del objeto
	public void mostrar() {
		System.out.println("ciudad=" + ciudad + ", direccion=" + direccion + ", numero de empleados="
				+ Market.num_empleados);
	}

	public static void main(String[] args) {

		Lacteos L1 = new Lacteos((byte) 7, (byte) 10);
		L1.mostrar();
		Lacteos L2 = new Lacteos((byte) 4, (byte) 10);
		L2.mostrar();
		Congelados C1 = new Congelados((byte) 4);
		C1.mostrar();
		Congelados C2 = new Congelados((byte) 3);
		C2.mostrar();

		Lacteos L3 = new Lacteos((byte) 4, (byte) 10);
		L3.mostrar();
		Congelados C3 = new Congelados("Zaragoza", "C/Magallanes 6000", (byte) 8);
		C3.mostrar();

	}

}
