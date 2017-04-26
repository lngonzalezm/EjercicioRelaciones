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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <Product> products = new ArrayList <>();
       ArrayList <Item> items = new ArrayList <>();
       Item item1=new Item("Arroz", 200, "1212");
       Category categoria1=new Category("Alimentos", "Comidas",products,"12");
       Product producto1= new Product("Arroz","Diana, 1kg,blanco",items,"1212");
       items.add(item1);
       categoria1.products.add(producto1);
       categoria1.MostrarProductos();
       producto1.getItems();
    }
    
}
