/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *Representa un chasis de un carro
 * Los tipos de chasis pueden ser monocasco, escalera, columna vertebral, multitubular, cercha
 * @author Estudiante
 */
public class Chassis {
    // Atributos
    
    
    private String tipoCh;
    
    // Constructor: Crea un nuevo chasis con los datos introducidos

    public Chassis(String tipoCh) {
        
        this.tipoCh = tipoCh;
    }
    // Getter and Setter
    
    public String gettipoCh() {
        return tipoCh;
    }

    public void settipoCh(String tipoCh) {
        this.tipoCh = tipoCh;
    }

    @Override
    public String toString() {
        return tipoCh;
    }  
    
}
