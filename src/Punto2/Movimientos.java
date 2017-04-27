/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;
import java.util.GregorianCalendar;

/**
 *Representa los movimientos
 * @author user
 */
public class Movimientos {
    
    //Atributos
    private GregorianCalendar fecha;
    private double saldoAnterior;
    private double monto;
    
    private Tipo tipo;

    //Constructor
    
    public Movimientos(GregorianCalendar fecha, double saldoAnterior, double monto, Tipo tipo) {
        this.fecha = fecha;
        this.saldoAnterior = saldoAnterior;
        this.monto = monto;
        this.tipo = tipo;
    }
    
    //Gets and Sets

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return (saldoAnterior+monto+tipo)+ fecha;
        
    }
           
    
    
}
