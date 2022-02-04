/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_jose.carlos_bryan_espinal;

/**
 *
 * @author bryan
 */
public class mototaxis extends transportes{
    int tam;
    String a="mototaxi";
    public mototaxis(String placa, String color, String conductores,int tam) {
        super(placa, color, conductores);
        this.tam=tam;
    }

    @Override
    public String toString() {
       return super.toString() 
               + " capacidad=" + tam + " tipo de unidad= "+ a;
    }
    
}
