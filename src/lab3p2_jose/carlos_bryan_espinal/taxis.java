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
public class taxis extends transportes{
    
    int numeroTaxi;

    public taxis(int numeroTaxi, String placa, String color, String conductores) {
        super(placa, color, conductores);
        this.numeroTaxi = numeroTaxi;
        this.cantidad=4;
    }

    @Override
    public String toString() {
        return "taxis{" + "numeroTaxi=" + numeroTaxi + '}';
    }
    
    
    
}
