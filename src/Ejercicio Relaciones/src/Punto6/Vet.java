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
public class Vet {
    ArrayList<Pet> pets= new ArrayList<>();
    public void removePet(Pet pet){
        for (int i = 0; i < pets.size(); i++) {
            pets.remove(i);
        }
    }
    public void showPetsByType(){
        String Clase;
        for (int j = 0; j < 3; j++){
            if (j==0){
                System.out.println("Perros:");  
            }else if(j==2){
                System.out.println("Gatos:");
            }else{
                System.out.println("Hamster:");
            }
            Clase = pets.getClass().getSimpleName();
            for (int i = 0; i < pets.size(); i++) {
                while(Clase=="ArrayList"){ 
                   System.out.println(pets.get(i)); 
                }
                while(Clase=="Cat"){ 
                    
                   System.out.println(pets.get(i)); 
                }
                while(Clase=="Hamster"){ 
                   System.out.println(pets.get(i)); 
                }
            }
        }  
        
    }
    
    public void ShowPets(){
      for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i)); 
        }  
    }
    public void RegistrarPet(Pet pet){
      pets.add(pet); 
    }
}
