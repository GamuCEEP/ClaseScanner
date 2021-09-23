package clasecesar;

import java.util.Scanner;

public class Persona {

	public String nombre, ciudad;
	public int edad, peso;

	public String argumentos_constructor;
	Scanner entrada = new Scanner(System.in);

	public Persona() {
		argumentos_constructor = "vacio";
		nombre = "pepe";
		ciudad = "Madrid";
		edad = 15;
		peso = 67;
	}

	// Sobrecarga del constructor con parametros
	public Persona(String nombre, String ciudad, int edad, int peso) {
		argumentos_constructor = "String, String, int, int";
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.edad = edad;
		this.peso = peso;

	}

	// Sobrecarga del constructor cambiando el orden
	public Persona(String nombre, int edad, String ciudad, int peso) {
		argumentos_constructor = "String, int, String, int";
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.edad = edad;
		this.peso = peso;

	}

	// Sobrecarga del contructor usando el scanner
	public Persona(String ciudad) {
		argumentos_constructor = "String";
		System.out.println("Introduce tu nombre");
		this.nombre = entrada.nextLine();
		this.ciudad = ciudad;
		setEdad(56);
		setPeso(35);
	}

	// Setters
	public void setEdad(int edad) {
		this.edad = edad < 100 ? edad : 100;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	// Getters

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getEdad() {
		return edad;
	}

	public int getPeso() {
		return peso;
	}
	
	//Muestra la información del objeto
	public void mostrar() {
		System.out.println("Argumentos de constructor:" + argumentos_constructor);
		System.out.println("Nombre:" + nombre);
		System.out.println("Ciudad:" + ciudad);
		System.out.println("Edad:" + edad);
		System.out.println("Peso:" + peso);

	}
}
