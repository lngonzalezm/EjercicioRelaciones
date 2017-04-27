/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author USER
 */
public class Segmento {
  private String horaInicio;
private String horaFinalizacion;
public Segmento(String horaInicio, String horaFinalizacion) {
	
	this.horaInicio = horaInicio;
	this.horaFinalizacion = horaFinalizacion;
}
public String getHoraInicio() {
	return horaInicio;
}
public void setHoraInicio(String horaInicio) {
	this.horaInicio = horaInicio;
}
public String getHoraFinalizacion() {
	return horaFinalizacion;
}
public void setHoraFinalizacion(String horaFinalizacion) {
	this.horaFinalizacion = horaFinalizacion;
}  
}  

