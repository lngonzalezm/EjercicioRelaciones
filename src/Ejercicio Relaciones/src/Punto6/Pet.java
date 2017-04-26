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
public class Pet {
  protected String id;
  protected String  name;
  protected String hairColor;

  public String sound(){
      return " ";
  }

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public void nombreClase(){
        this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", name=" + name + ", hairColor=" + hairColor + '}';
    }
  
}
