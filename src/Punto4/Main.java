/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

import java.util.GregorianCalendar;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Laura";
        int day=24;
        int month=5;
        int year=1998;
        Date fecha = new Date(day,month,year);
        Person P1 = new Person(fecha,nombre);
        GregorianCalendar C=new GregorianCalendar(year,month-1,day);
        System.out.println("La fecha de nacimiento de " + P1.getNombre());
        System.out.println(C.getTime());
        if(C.isLeapYear(year)==true){
            System.out.println("El año " + year + " es bisiesto");
        }
        else{
            System.out.println("El año " + year + " no es bisisesto");
        }
    }
}
