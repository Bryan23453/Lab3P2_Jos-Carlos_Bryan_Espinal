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
public class clases {
    String nom;
    int cod;

    public clases() {
    }

    public clases(String nom, int cod) {
        this.nom = nom;
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "  nombre de la clase: " + nom + " , Codigo de la clase: " + cod + "\n";
    }
    
}
