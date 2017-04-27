/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *Clase que Representa un carro
 * @author Estudiante
 */
public class Voiture {
    
    // Atributos del carro
    
    private String marca;
    private String color;
    private Chassis chasis;
    private Moteur motor;
    private Roue [] ruedas;
    //private Roue marca;
    
    private String placa;
    
                     
    // Constructor
    
    public Voiture(){
        marca = "Desconocida";
        color = "Desconocido";
        chasis = new Chassis("Desconocido");
        motor = new Moteur("Desconocido",0);
        ruedas [0] = new Roue("Desconocida", 0.0);
        placa = "Desconocida";
    }
    
    //Constructor
    public Voiture(String marca, String color, Moteur motor, Roue[] ruedas, String placa) {
        this.marca = marca;
        this.color = color;
        
        this.chasis = new Chassis("monocasco");//relación de composición 
        this.motor = motor;//relación de agregación
        
        this.ruedas = ruedas;
        this.placa = placa;
    }

    //Gets and Sets

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Chassis getChasis() {
        return chasis;
    }

    public void setChasis(Chassis chasis) {
        this.chasis = chasis;
    }

    public Moteur getMotor() {
        return motor;
    }

    public void setMotor(Moteur motor) {
        this.motor = motor;
    }

    public Roue[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Roue[] ruedas) {
        this.ruedas = ruedas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    //Métodos 
    
    public String mostrarCarro(){
	return ("\nDATOS DEL CARRO: \nMarca: " + getMarca() + "\nColor: "+ getColor()+"\nChasis: "+ getChasis()+"\nMotor: "
                +"\nRuedas:  "+" "+ mostrarRuedas()+ getMotor()+ "\nPlaca: "+ getPlaca());
    }
    
    public String mostrarRuedas(){
        
	for (Roue rueda : ruedas) {
		System.out.println(rueda.getMarca() + " / " + rueda.getDiametro());
            }
            return " ";
    }
    
    
    
    
}