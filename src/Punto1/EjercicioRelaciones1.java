/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 */
package Punto1;
import java.util.ArrayList;

/**
 *main de Carro
 * @author Estudiante
 */
public class EjercicioRelaciones1 {

    /**
     * @param args the command line arguments
     */
     
    
    public static void main(String[] args) {
        // Instancias del Carro
        
        
    Moteur motor1 = new Moteur("1597 C.C. ", 120);
    Moteur motor2 = new Moteur("999 C.C. ", 125);
    Roue[] rueda1 = new Roue [4];

    for (int i = 0; i < rueda1.length; i++) {
	rueda1[i] = new Roue("Dunlop", 38);
        }
        
    
    Voiture miCarro1 = new Voiture("Ford", "Gris", motor1, rueda1, "RCN-723");
    Voiture miCarro2 = new Voiture("Kia","Azúl", motor2, rueda1, "SYM-387");
    
    ArrayList<Voiture> coleccion = new ArrayList<Voiture>();

    coleccion.add(miCarro1);
    coleccion.add(miCarro2);

    Personne cliente = new Personne("William Morales",coleccion);
    cliente.datosPersona();
        
             
    }
    
}