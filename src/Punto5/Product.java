/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Product extends DomainObject{
    private String name;
    private String description;
    ArrayList <Item> items;

    public Product(String name, String description, ArrayList <Item> items,String id) {
        super(id);
        this.name = name;
        this.description = description;
        this.items= new ArrayList<>();
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", description=" + description + ", items=" + items + '}';
    }

    
    
}
