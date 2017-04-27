/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.ArrayList;


/**
 *
 * @author Estudiante
 */


/**
 * Esta clase representa un banco 
 * corriente y una cuenta de ahorro
 */
public class Banco    //CuentaBancaria
{
    // Atributos
    private String codigo;
    
    private ArrayList<Tipo> tipos;
    private ArrayList<Cuenta> cuentas;
    
    //Constructor

    public Banco(String codigo, ArrayList<Tipo> cantidades, ArrayList<Cuenta> cuentas) {
	super();
	this.codigo = codigo;
	this.tipos = cantidades;
	this.cuentas= cuentas;
    }
    
    // Gets and Sets

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Tipo> getCantidades() {
        return tipos;
    }

    public void setCantidades(ArrayList<Tipo> cantidades) {
        this.tipos = cantidades;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    
    // Métodos
    
    /*
    public String  datosCuenta(){
        
	for(int i=0 ,j=1;i<cuentas.size();i++,j--){
	System.out.println("banco: "+getCodigo()+" datos de la cuenta:\nNombre: "+cuentas.get(i).getNombreCliente()+
		" # cuenta: "+cuentas.get(i).getNumeroCuenta()+" fecha de creacion: "+cuentas.get(i).getFechaCreacion().getTime()+
		" saldo actual: "+cuentas.get(i).getSaldoActual()+"\n"+"tipo: "+cuentas.get(i).getMovimientos().get(i).getTipo().getCodigo()+
		" fecha: "+cuentas.get(i).getMovimientos().get(i).getFecha().getTime()+" saldo anterior: "+cuentas.get(i).getMovimientos().get(i).getSaldoAnterior()+
		" cantidad"+cuentas.get(i).getMovimientos().get(i).getCantidad()+" \ntipo: "+cuentas.get(i).getMovimientos().get(j).getTipo().getCodigo()+
		" fecha: "+cuentas.get(i).getMovimientos().get(j).getFecha().getTime()+" saldo anterior:"+
		cuentas.get(i).getMovimientos().get(j).getSaldoAnterior()+" cantidad: "+cuentas.get(i).getMovimientos().get(j).getCantidad());
}
	return" ";
}
    
    */
    
    
    /**
     
    public void inicializar( String cedulaP, String nombreP )
    {
        // Inicializa los atributos personales del cliente
        nombre = nombreP;
        cedula = cedulaP;
        
        // Inicializa las cuentas en vacío
        corriente = new CuentaCorriente( );
        corriente.inicializar( );
        ahorros = new CuentaAhorros( );
        ahorros.inicializar( );
        
    }

    
    public double saldoTotal( )
    {
        return corriente.darSaldo( ) + ahorros.darSaldo( ) + inversion.valorPresente( mesActual );
    }

       */
    

    
}
