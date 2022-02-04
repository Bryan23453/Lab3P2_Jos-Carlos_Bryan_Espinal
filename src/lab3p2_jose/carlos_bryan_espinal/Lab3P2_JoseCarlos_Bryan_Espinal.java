/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_jose.carlos_bryan_espinal;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab3P2_JoseCarlos_Bryan_Espinal {
static Scanner lea = new Scanner(System.in);
    public static void main(String[] args) {
        boolean a=true;
        ArrayList<clases> clas = new ArrayList();
        ArrayList<transportes> trans = new ArrayList();
        ArrayList<personas> per = new ArrayList();
        while (a==true) {
            System.out.println("0. Salir\n" +
            "1. Crear Clase\n" +
            "2. Crear Ruta\n" +
            "3. Crear Alumno\n" +
            "4. Agregar Clase a Alumno\n" +
            "5. Crear Transportista\n" +
            "6. Crear Transporte\n" +
            "7. Simulación\n" +
            "8. Listar Clases\n" +
            "9. Listar Rutas\n" +
            "10. Listar Alumnos\n" +
            "11. Listar Transportistas\n" +
            "12. Listar Transportes");
            int op=lea.nextInt();
            switch (op){
                case 0:{
                    a=false;
                }
                break;
                case 1:{
                    System.out.println("ingrese nombre de la clase");
                    String n=lea.nextLine();
                    n=lea.nextLine();
                    System.out.println("ingrese id unico de clase");
                    int b=lea.nextInt();
                    clas.add(new clases(n, b));
                }
                break;
                case 2:{
                    System.out.println("ingrese punto x");
                    int x=lea.nextInt();
                    System.out.println("ingrese punto y");
                    int y=lea.nextInt();
                }
                break;
                case 3:{
                    System.out.println("ingrese nombre");
                    String nom= lea.nextLine();
                    nom= lea.nextLine();
                    System.out.println("ingrese identidad");
                    int iden=lea.nextInt();
                    System.out.println("fecha de nacimiento");
                    String fecha= lea.nextLine();
                    fecha= lea.nextLine();
                    System.out.println("ingrese codigo de estudiante");
                    int codes=lea.nextInt();
                    personas p=new personas(nom, fecha, iden);
                    per.add(new pasajeros(codes,p.nom,p.fecha,p.id));
                }
                break;
                case 4:{

                }
                break;
                case 5:{

                }
                break;
                case 6:{

                }
                break;
                case 7:{

                }
                break;
                case 8:{
                    for (int i = 0; i < clas.size(); i++) {
                        int t = i + 1;
                        System.out.println("clase " + t + ":" + clas.get(i));
                    }
                }
                break;
                case 9:{

                }
                break;
                case 10:{
                    for (int i = 0; i < per.size(); i++) {
                        int t = i + 1;
                        System.out.println("persona " + t + ":" + per.get(i));
                    }
                }
                break;
                case 11:{

                }
                break;
                case 12:{

                }
                break;


            }
        } 
    }
}
