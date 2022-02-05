/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_jose.carlos_bryan_espinal;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */

public class transportes {
     String placa;
     String color;
     String conductores;
 ArrayList<String> pasajeros = new ArrayList();
    public transportes(String placa, String color, String conductores) {
        this.placa = placa;
        this.color = color;
        this.conductores = conductores;
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConductores() {
        return conductores;
    }

    public void setConductores(String conductores) {
        this.conductores = conductores;
    }

    public ArrayList<String> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<String> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return  "placa=" + placa + ", color=" + color + ", conductores= " + conductores ;
    }
     
}
