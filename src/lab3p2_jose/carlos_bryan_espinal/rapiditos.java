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
public class rapiditos extends transportes{
    int cap;
    String a="taxi";
    public rapiditos(String placa, String color, String conductores,int cap) {
        super(placa, color, conductores);
        this.cap=cap;
    }

    @Override
    public String toString() {
        return super.toString()
                + " capacidad=" + cap + " tipo de unidad= "+ a;
    }
    
    
}
