/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_jose.carlos_bryan_espinal;

import java.util.ArrayList;

public class personas {
String nom; 
String fecha;
int id;
String clas;
ArrayList<clases> clase = new ArrayList();
    public personas() {
    }

    public personas(String nom, String fecha, int id) {
        this.nom = nom;
        this.fecha = fecha;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<clases> getpasaje() {
        return clase;
    }

    public void setclase(ArrayList<clases> clase) {
        this.clase = clase;
    }

    
    @Override
    public String toString() {
        if (clase.size()<1) {
            return " nombre= " + nom + " , fecha de nacimiento= " + fecha + " , id= " + id ;
        }
        else{
            String r=" ";
            for (int i = 0; i < clase.size(); i++) {
                int t = i + 1;
                r+=clase.get(i)+" , ";
            }
            return " nombre= " + nom + " , fecha de nacimiento= " + fecha + " , id= " + id+ r ;
        }
    }

    
}
