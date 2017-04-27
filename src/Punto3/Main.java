/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.ArrayList;
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
        Segmento segSem1Sala1 = new Segmento("1:00 PM","2:30 PM");
	Segmento segSem2Sala1 = new Segmento("3:00 PM","5:00 PM");
	Segmento segSem1Sala2= new Segmento("6:10 AM", "7:50 AM");
	Segmento segSem2Sala2 = new Segmento("6:00 AM" , "10:00 AM");	
	ArrayList<Segmento>S= new ArrayList<Segmento>();
	S.add(segSem1Sala1);
	S.add(segSem2Sala1);
	S.add(segSem1Sala2);
	S.add(segSem2Sala2);	
	GregorianCalendar diaSem0Sala0= new GregorianCalendar(2020,4,17);
	GregorianCalendar diaSem1Sala1= new GregorianCalendar(2032,3,2);
	GregorianCalendar diaSem1Sala2= new GregorianCalendar(2010,2,3);
	GregorianCalendar diaSem2Sala1= new GregorianCalendar(2018,1,26);
	GregorianCalendar diaSem2Sala2= new GregorianCalendar(2016,12,9);	
	Dia[] diasHabiles = new Dia[5];
	diasHabiles[4]= new Dia(diaSem0Sala0,"lunes",S);
        diasHabiles[3]= new Dia(diaSem2Sala2,"Martes",S);
        diasHabiles[2]= new Dia(diaSem2Sala1,"Miercoles",S);
	diasHabiles[1]= new Dia(diaSem1Sala2,"Jueves",S);
        diasHabiles[0]= new Dia(diaSem1Sala1, "Viernes", S);
	ArrayList<Semana>semana= new ArrayList<Semana>();
	ArrayList<Sala>Sala= new ArrayList<Sala>();
	Sala sala1 = new Sala("Sala1",semana);
	Sala sala2 = new Sala("Sala2",semana);
	Sala.add(sala1);
	Sala.add(sala2);	
        Semana semana1= new Semana(1,Sala,diasHabiles);
	Semana semana2= new Semana(2,Sala,diasHabiles);
	semana.add(semana1);
	semana.add(semana2);
        Planning p = new Planning(Sala);
        p.informacion();
        
    }
    
}
