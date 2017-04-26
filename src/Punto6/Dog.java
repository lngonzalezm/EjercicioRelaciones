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
public class Dog extends Pet{
    private String breed;

    public Dog(String breed, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + ", id=" + id + ", name=" + name + ", hairColor=" + hairColor + '}';
    }
    
}
