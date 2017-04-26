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
public class Starter {

    ArrayList<Pet> pets= new ArrayList<>();
    public void readPets (Vet v){
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i));
        }
    }
    public void manageVet(Vet v, String x){
        
    }
    public static void main(String[] args) {
      Vet v = new Vet();
      Pet Otto= new Dog("Boxer", "1213", "Otto", "Blanco");
      Pet Gato= new Cat(false, "1214", "bigotes", "negro");
      Pet H= new Hamster(4.3, "1215", "Raton", "Cafe");
      Person persona= new Person("Laura","1212",Otto);
      v.RegistrarPet(Otto);
      v.RegistrarPet(Gato);
      v.RegistrarPet(H);
      v.ShowPets();
      v.showPetsByType();
      
    }
}