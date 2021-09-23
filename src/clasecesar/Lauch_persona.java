package clasecesar;

public class Lauch_persona {

	public static void main(String[] args) {
		
		Persona constructor_vacio = new Persona();
		constructor_vacio.mostrar();
		
		Persona constructor_entero = new Persona("Maria", "Segovia",25,40);
		constructor_entero.mostrar();
		
		Persona constructor_desordenado = new Persona("Marcos",25,"Malaga",50);
		constructor_desordenado.mostrar();
		
		Persona constructor_scanner = new Persona("Santander");
		constructor_scanner.mostrar();
		
		
	}
}
