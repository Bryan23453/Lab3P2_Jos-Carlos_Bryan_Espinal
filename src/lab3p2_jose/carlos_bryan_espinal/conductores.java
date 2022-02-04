
package lab3p2_jose.carlos_bryan_espinal;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author bryan
 */
public class conductores extends personas {
    static Scanner lea = new Scanner(System.in);
    ArrayList<conductores>listaconductores=new ArrayList<conductores>();
    public int experiencia;

    public static void registrarConductor(){
        System.out.println("ingrese años de experiencia");
        int experiencia = lea.nextInt();
        System.out.println("Ingrese apodo");
        String nombre = lea.nextLine();
        
        listaconductores.add(new conductores(experiencia,nombre));
    }
    
}
