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
public class taxis extends transportes{
    
    int numeroTaxi;
    int cantidad;
    String a="taxi";
        ArrayList<String> pasajeros = new ArrayList();
    public taxis(int numeroTaxi, String placa, String color, String conductores,int can) {
        super(placa, color, conductores);
        this.numeroTaxi = numeroTaxi;
        this.cantidad=can;
    }

    @Override
    public String toString() {
        return super.toString()
        + " numeroTaxi=" + numeroTaxi + " tipo de unidad= "+ a;
    }

    public ArrayList<String> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<String> pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    
    
}
