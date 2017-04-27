/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Sala {
    private String nombreSala;
    private ArrayList<Semana>semanas;

    public Sala(String nombreSala,ArrayList<Semana> semanas) {
            super();
            this.semanas = semanas;
            this.nombreSala= nombreSala;
    }

    public ArrayList<Semana> getSemanas() {
            return semanas;
    }

    public void setSemanas(ArrayList<Semana> semanas) {
            this.semanas = semanas;
    }

    public String getNombreSala() {
            return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
            this.nombreSala = nombreSala;
    }
}


