/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

/**
 *
 * @author USER
 */
public class Hamster extends Pet{
   private double weight;

    public Hamster(double weight, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hamster{" + "weight=" + weight + ". id=" + id + ", name=" + name + ", hairColor=" + hairColor + '}';
    }
   
}
