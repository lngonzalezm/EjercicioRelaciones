/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

/**
 *
 * @author USER
 */
public class Item extends DomainObject{
    private String name;
    private double unitCost;
    

    public Item(String name, double unitCost, String id) {
        super(id);
        this.name = name;
        this.unitCost = unitCost;
        
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", unitCost=" + unitCost + '}';
    }

    
    
}
