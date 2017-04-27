/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;
import java.util.ArrayList;

/**
 *  
 * Representa un propietario de carro
 * @author Estudiante
 */
public class Personne {
    
    //Atributos
    private String nombre;
    private ArrayList<Voiture> listaCarros;
    
    
    //Constructor
    
    public Personne(){
        nombre = "Desconocdo";  // desconocido cuando no se le envian valores a los atributos...
        
    }
    
    public Personne(String nombre, ArrayList<Voiture> listaCarros) {
        this.nombre = nombre;
        this.listaCarros = listaCarros;
    }
    
// Gets and Sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      
    public ArrayList<Voiture> getlistaCarros() {
        return listaCarros;
    }

    
    public void setlistaCarros(ArrayList<Voiture> listaCarros) {
        this.listaCarros = listaCarros;
    }

    //Métodos
    
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", listaCarros=" + listaCarros + "]";
    }

    public void datosPersona(){
        for (int i = 0; i < listaCarros.size(); i++) {
                System.out.println("Cliente: "+getNombre()+ " " + listaCarros.get(i).mostrarCarro()); 	
        }

    }    
    //public java.util.Collection voitures = new java.util.TreeSet();
     
}
