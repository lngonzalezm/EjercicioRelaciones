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
public class Category extends DomainObject{
    private String name;
    private String description;
    ArrayList <Product> products;

    public Category(String name, String description, ArrayList <Product> products, String id) {
        super(id);
        this.name = name;
        this.description = description;
        this.products= new ArrayList<>();
    }
    public void MostrarProductos(){
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Producto: "+ products.get(i)); 
        }
        
    }

    @Override
    public String toString() {
        return "Category{" + "name=" + name + ", description=" + description + ", products=" + products + '}';
    }
    
    
}
