/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Person {
   private String name;
   private String id;
   private Pet pet;
   ArrayList<Pet> pets= new ArrayList<>();

    public Person(String name, String id, Pet pet) {
        this.name = name;
        this.id = id;
        pet = new Pet(" ", " ", " ");
    }
   
   public void showPets(){
       for (int i = 0; i < pets.size(); i++) {
           System.out.println("Pet: "+ pets.get(i));
       }
   }
}
