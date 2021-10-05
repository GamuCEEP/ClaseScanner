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
public class Portero extends Jugador{
    public static short media_goles_encajados, total_goles_encajados, total_porteros;
    public boolean en_extranjero;
    
    public Portero(short goles_encajados, boolean en_extranjero){
        Portero.total_porteros ++;
        Portero.total_goles_encajados += goles_encajados;
        Portero.media_goles_encajados = (short)(Portero.total_goles_encajados / Portero.total_porteros);
        
        this.en_extranjero = en_extranjero;
    }
    public Portero(String nombre_equipo, short goles_encajados, boolean en_extranjero){
        this(goles_encajados, en_extranjero);
        
        this.nombre_equipo = nombre_equipo;
    }
    public void mostrarP(){
        mostrar();
        System.out.println("media_goles_encajados="+Portero.media_goles_encajados);
        System.out.println("en_extranjero="+en_extranjero);
        System.out.println("");
    }
}
