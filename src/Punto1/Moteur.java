/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *Representa el motor de un carro
 * @author Estudiante
 */
public class Moteur {
    
    //Atributos del motor
    private String cilindraje;
    private int potencia;
    
    
    public Moteur (String cilindraje, int potencia){
    
        this.cilindraje =  cilindraje;
        this.potencia = potencia;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return cilindraje + potencia;
    }   
}