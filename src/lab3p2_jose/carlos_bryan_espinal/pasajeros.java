/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_jose.carlos_bryan_espinal;


public class pasajeros extends personas{
  int id_est ;


    public pasajeros() {
    }

    public pasajeros(int id_est, String nom, String fecha, int id) {
        super(nom, fecha, id);
        this.id_est = id_est;
    }

    @Override
    public String toString() {
        return super.toString()
        + " id de estudiante: " + id_est ;
    }
    
  
}
