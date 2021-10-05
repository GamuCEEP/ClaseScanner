/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesar.tareas.tarea2;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Delantero extends Jugador {
    public static short total_goles, media_goles, total_delanteros;
    public boolean es_espanol;
    public float peso;
    
    private Scanner scan = new Scanner(System.in);
    
    public Delantero(short total_goles, boolean es_espanol){
        Delantero.total_delanteros ++;
        Delantero.total_goles += total_goles;
        Delantero.media_goles = (short)(Delantero.total_goles / Delantero.total_delanteros);
        
        this.es_espanol = es_espanol;
        
        System.out.println("Escriba el peso del delantero");
        this.peso = Float.parseFloat(scan.nextLine());
    }
    
    public void mostrarD(){
        mostrar();
        System.out.println("media_goles="+media_goles);
        System.out.println("es_espanol="+es_espanol);
        System.out.println("peso="+peso);
        System.out.println("");
        
    }
}
