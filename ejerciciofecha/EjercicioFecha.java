/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofecha;


import static ejerciciofecha.Fecha.ano;
import static ejerciciofecha.Fecha.dia;
import static ejerciciofecha.Fecha.mes;
import static ejerciciofecha.Fecha.namesDay;
import static ejerciciofecha.Fecha.namesMonths;
import java.util.Scanner;

/**
 
 * @author Sergio y Camilo
 */
public class EjercicioFecha{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
                

        Person persona = new Person(dia, mes, ano, namesDay, namesMonths);
        int dia = 0;
        int mes = 0;
        int ano = 0;
        String  namesDay = null;
	String namesMonths = null;

               System.out.println("Ingrese el dia");
                dia = teclado.nextInt();
                System.out.println("Ingrese el mes");
                mes = teclado.nextInt();
                System.out.println("Ingrese el año");
                ano = teclado.nextInt();
                
                
        switch (mes)
        {
            case 1:
            namesMonths = "Enero";
            break;
            case 2:
            namesMonths = "Febrero";
            break;
            case 3:
            namesMonths = "Marzo";
            break;
            case 4:
            namesMonths = "Abril";
            break;
            case 5:
            namesMonths = "Mayo";
            break;
            case 6:
            namesMonths = "Junio";
            break;
            case 7:
            namesMonths = "Julio";
            break;
            case 8:
            namesMonths = "Agosto";
            break;
            case 9:
            namesMonths = "Septiembre";
            break;
            case 10:
            namesMonths = "Octubre";
            break;
            case 11:
            namesMonths = "Noviembre";
            break;
            case 12:
            namesMonths = "Diciembre";
            break;
        }
        
        switch (dia)
        {
            case 1: namesDay = "Uno";
            break;
            case 2:namesDay = "Dos";
            break;
            case 3:namesDay = "Tres";
            break;
            case 4:namesDay = "Cuatro";
            break;
            case 5:namesDay = "Cinco";
            break;
            case 6:namesDay = "Seis";
            break;
            case 7:namesDay = "Siete";
            break;
            case 8:namesDay = "Ocho";
            break;
            case 9:namesDay = "Nueve";
            break;
            case 10:
            namesDay = "Diez";
            break;
            case 11:
            namesDay = "Once";
            break;
            case 12:
            namesDay = "Doce";
            break;
            case 13:
            namesDay = "Trece";
            break;
            case 14:
            namesDay = "Catorce";
            break;
            case 15:
            namesDay = "Quince";
            break;
            case 16:
            namesDay = "Dieciseis";
            break;
            case 17:
            namesDay = "Diecisiete";
            break;
            case 18:
            namesDay = "Dieciocho";
            break;
            case 19:
            namesDay = "Diecinueve";
            break;
            case 20:
            namesDay = "Veinte";
            break;
            case 21:
            namesDay = "Ventiuno";
            break;
            case 22:
            namesDay = "Veintidos";
            case 23:
            namesDay = "Ventitres";
            break;
            case 24:
            namesDay = "Venticuatro";
            break;
            case 25:
            namesDay = "Veinticinco";
            break;
            case 26:
            namesDay = "Veintiseis";
            break;
            case 27:
            namesDay = "Ventisiete";
            break;
            case 28:
            namesDay = "Ventiocho";
            break;
            case 29:
            namesDay = "Ventinueve";
            break;
            case 30:
            namesDay = "Treinta";
            break;
            case 31:
            namesDay = "Teinta y uno";
            break;
            default:
            System.out.println("Día no valido");
        }
        System.out.println("Fecha de nacimiento: " + namesDay + " de " + namesMonths + " de " + ano);
    }
    
    
    
}