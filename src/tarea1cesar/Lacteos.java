package tarea1cesar;

public class Lacteos extends Market {

	public byte num_proveedores, num_repartidores;

	// Constructor basico
	public Lacteos(byte num_empleados, byte num_proveedores) {
		// Llama al constructor de market
		super();

		// Inicializa los atributos del objeto
		this.num_repartidores = (byte) (Math.random() * 3 + 3);
		this.num_proveedores = num_proveedores;

		// A�ade el numero de empleados a la variable de market
		Market.num_empleados += num_empleados;
	}

	// Muestra toda la informacion del objeto (Sobrescritura)
	public void mostrar() {
		System.out.println("num_empleados=" + num_empleados + ", num_proveedores=" + num_proveedores
				+ ", num_repartidores=" + num_repartidores + ", ciudad=" + ciudad + ", direccion=" + direccion);

	}

}
