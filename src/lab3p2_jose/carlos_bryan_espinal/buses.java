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
public class buses extends transportes{
    int depie;
    int cent;
    String a="bus";
        ArrayList<String> pasajeros = new ArrayList();
    public buses(String placa, String color, String conductores,int par,int sen) {
        super(placa, color, conductores);
        this.depie=par;
        this.cent=sen;
    }

    @Override
    public String toString() {
       return super.toString()
               + " capacidad de pie=" + depie + ", capacidad centado=" + cent + " tipo de unidad= "+ a;
    }
    
    
}
