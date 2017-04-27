/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
//import java.util.Date;

/**
 *
 * @author user
 */
public class Cuenta {
    
    //Atributos
    private int numeroCuenta;
    private double saldoActual;
    private GregorianCalendar fechaCreacion;
    private String nombreCliente;
    
    private ArrayList <Movimientos> mouvement;
    
    GregorianCalendar calendario= new GregorianCalendar();

    public Cuenta(int numeroCuenta, double saldoActual, GregorianCalendar fechaCreacion, String nombreCliente) {
        super();
        
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.fechaCreacion = fechaCreacion;
        this.nombreCliente = nombreCliente;
        
        //mouvement = new Movimientos (Date fecha, double saldoAnt, double valor);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public GregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(GregorianCalendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Movimientos> getMouvement() {
        return mouvement;
    }

    public void setMouvement(ArrayList<Movimientos> mouvement) {
        this.mouvement = mouvement;
    }
    
    
    //Métodos de la clase
    
   /* 
    public void adicionarMovimientos(){
	this.mouvement = new ArrayList<Movimientos>();
    }
    
    
    */
    
    // Registra fechas a cada cuenta
    public void fechas(){
	for(int i=0;i<mouvement.size();i++){
		System.out.println(mouvement.get(i).getTipo().getCodigo());
	}
    }
    
    /*
    public void consignar (double monto){
        
        saldoActual = mouvement.tipo.getsaldoActual+monto;
            
    }*/
    
    
    
        
    
}
