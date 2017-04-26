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
public class Cat extends Pet{
  private boolean isHunter;

    public Cat(boolean isHunter, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
    }

    public boolean isIsHunter() {
        return isHunter;
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }

    @Override
    public String toString() {
        return "Cat{" + "isHunter=" + isHunter + ", id=" + id + ", name=" + name + ", hairColor=" + hairColor + '}';
    }
    
}
  
  