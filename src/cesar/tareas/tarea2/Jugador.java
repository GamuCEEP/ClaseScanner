/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesar.tareas.tarea2;

/**
 *
 * @author Alumno Mañana
 */
public class Jugador {

    public String nombre_equipo;
    public short num_jugador, anio_nacimiento;

    public Jugador() {
        this.nombre_equipo = "CD Horche";
        this.num_jugador = (short) Math.round(Math.random() * 24);
        this.anio_nacimiento = (short) Math.round(Math.random() * (2000 - 1975) + 1975);

    }

    public void mostrar() {
        System.out.println("nombre_equipo=" + nombre_equipo);
        System.out.println("num_jugador=" + num_jugador);
        System.out.println("anio_nacimiento" + anio_nacimiento);
    }

    public static void main(String[] args) {
        Delantero D1 = new Delantero((short) 1, true);
        D1.mostrarD();
        Delantero D2 = new Delantero((short) 27, false);
        D2.mostrarD();
        Portero P1 = new Portero((short) 25, true);
        P1.mostrarP();

        Portero P2 = new Portero("CD Guadalajara", (short) 39, true);

        P2.mostrarP();
        Delantero D3 = new Delantero((short) 15, true);
        D3.mostrarD();
        Delantero D4 = new Delantero((short) 20, true);
        D4.mostrarD();
    }
}
