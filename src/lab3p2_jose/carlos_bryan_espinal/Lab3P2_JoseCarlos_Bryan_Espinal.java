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
        ArrayList<personas> alum = new ArrayList();
        ArrayList<personas> transportista = new ArrayList();
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
                    boolean A=false;
                    String n="";
                    int b=0;
                        while (A==false){
                            A=true;
                            System.out.println("ingrese nombre de la clase");
                            n=lea.nextLine();
                            n=lea.nextLine();
                            System.out.println("ingrese id unico de clase");
                            b=lea.nextInt();
                            for (clases cla : clas) {
                                if (b == cla.getCod()) {
                                    A=false;
                                    break;
                                }
                            }
                            if (A==false) {
                                System.out.println("no puede haber 2 id con el mismo numero"); 
                            }
                    }
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
                    boolean A=false;
                    int iden=0;
                        while (A==false){
                            A=true;
                            System.out.println("ingrese identidad");
                            iden=lea.nextInt();
                            for (personas per : alum) {
                                if (iden == per.getId()) {
                                    A=false;
                                    break;
                                }
                            }
                            if (A==false) {
                                System.out.println("no puede haber 2 id con el mismo numero"); 
                            }
                    }
                    System.out.println("fecha de nacimiento");
                    String fecha= lea.nextLine();
                    fecha= lea.nextLine();
                    boolean B=false;
                    int codes=0;
                        while (B==false){
                            B=true;
                           System.out.println("ingrese codigo de estudiante");
                            codes=lea.nextInt();
                            for (personas per : alum) {
                                if (codes == per.getId()) {
                                    B=false;
                                    break;
                                }
                            }
                            if (B==false) {
                                System.out.println("no puede haber 2 id con el mismo numero"); 
                            }
                    }
                    personas p=new personas(nom, fecha, iden);
                    alum.add(new pasajeros(codes,p.nom,p.fecha,p.id));
                }
                break;
                case 4:{
                    System.out.println("selecione el alumno a agregar clase");
                    for (int i = 0; i < alum.size(); i++) {
                        int t = i + 1;
                        System.out.println("alumno " + t + ":" + alum.get(i));
                    }
                    int posA = lea.nextInt();
                    posA--;
                    System.out.println("selecione la clase a agregar a el alumno");
                    for (int i = 0; i < clas.size(); i++) {
                        int t = i + 1;
                        System.out.println("clase " + t + ":" + clas.get(i));
                    }
                    ArrayList<clases> A = new ArrayList();
                    int poscla = lea.nextInt();
                    poscla--;
                    A.add(clas.get(poscla));
                     alum.get(posA).setclase(A);
                }
                break;
                case 5:{
                    System.out.println("ingrese nombre");
                    String nom= lea.nextLine();
                    nom= lea.nextLine();
                    boolean A=false;
                    int iden=0;
                        while (A==false){
                            A=true;
                            System.out.println("ingrese identidad");
                            iden=lea.nextInt();
                            for (personas per : transportista) {
                                if (iden == per.getId()) {
                                    A=false;
                                    break;
                                }
                            }
                            if (A==false) {
                                System.out.println("no puede haber 2 id con el mismo numero"); 
                            }
                    }
                    System.out.println("fecha de nacimiento");
                    String fecha= lea.nextLine();
                    fecha= lea.nextLine();
                    System.out.println("años de experiencia "); 
                    int aniosxp=lea.nextInt();
                    System.out.println("apodo tiene en su barrio");
                    String apodo=lea.nextLine();
                    apodo=lea.nextLine();
                    personas p=new personas(nom, fecha, iden);
                    transportista.add(new conductores(aniosxp , apodo, p.nom, p.fecha, p.id));
                }
                break;
                case 6:{
                    System.out.println("ingrese transporte a añadir\n"
                            + "1- taxi\n"
                            + "2- buses\n"
                            + "3- rapiditos\n"
                            + "4- mototaxis\n");
                    int ope =lea.nextInt();
                    
                    boolean A=false;
                    String placa="";
                        while (A==false){
                            A=true;
                            System.out.println("ingrese placa");
                            placa=lea.nextLine();
                            for (transportes tras : trans) {
                                String e =tras.getPlaca();
                                if (placa.equals(e)) {
                                    A=false;
                                    break;
                                }
                            }
                            if (A==false) {
                                System.out.println("no puede haber 2 placas con el mismo numero"); 
                            }
                    }
                    
                    placa=lea.nextLine();
                    System.out.println("ingrese color");
                    String col=lea.nextLine();
                    
                    switch (ope){
                        case 1:{
                            System.out.println("ingrese numero de taxi");
                            int taxnum=lea.nextInt();
                            transportes tra=new transportes(placa, col, col);
                            trans.add(new taxis(taxnum, tra.placa, tra.color, "",4));
                        }
                        break;
                        case 2:{
                            System.out.println("Ingrese un numero de sillas ");
                            int silla=lea.nextInt();
                            System.out.println("Ingrese capacidad de personas de pie");
                            int pie=lea.nextInt();
                            transportes tra=new transportes(placa, col, col);
                            trans.add(new buses(placa, col, "",pie,silla));
                            
                        }
                        break;
                        case 3:{
                            System.out.println("Ingrese un numero de sillas ");
                            int silla=lea.nextInt();
                            transportes tra=new transportes(placa, col, col);
                            trans.add(new rapiditos(tra.placa, tra.color, "",silla) );
                        }
                        break;
                        case 4:{
                            transportes tra=new transportes(placa, col, "");
                            trans.add(new mototaxis(tra.placa, tra.color, "",2));
                        }
                        break;
                        
                    }
                }
                break;
                case 7:{
                     System.out.println("Menú de Simulación");
        System.out.println("1 - Bus\n2 - Rapidito\n3 - Taxi\n4 - Mototaxi");
        System.out.print("Seleccione un transporte: ");
        int transporteNum = lea.nextInt();
        System.out.print("Ingrese la posición de ese transporte: ");
        int posicion = lea.nextInt();
        transportes transporte;
        /* Aquí seleccionaríamos el transporte según su posición en el arraylist
        switch(transporteNum){
            case 1:
                break;
        }*/
        
        int opcion;
        
        do{
            System.out.println("0. Salir\n" +
            "1. Subir Alunmo al transporte\n" +
            "2. Bajar alumno del transporte\n" +
            "3. Listar alumnos del transporte\n" +
            "4. Escoger transportista\n" +
            "5. Quitar transportista\n" +
            "6. Añadir ruta\n" +
            "7. Quitar ruta\n" +
            "8. Imprimir transporte\n" +
            "9. Comenzar");
            
            System.out.print("Seleccione una opción: ");
            opcion = lea.nextInt();
            switch (opcion){
                case 0:{
                    System.out.println("Gracias");}
                    break;
                case 1:{
                    System.out.print("Ingrese el ID del alumno que desea subir al transporte: ");
                                int id = lea.nextInt();
                                int item2 = 0;
                                
                                /*  for (int z = 0; z < personas.get(z).size(); z++) {
                                    int idAlumno2 = 0;
                                    if (personas.get(z) instanceof pasajeros) {
                                        idAlumno2 = ((pasajeros) personas.get(z)).getIdEstudiante();
                                    }
                                    if (id == idAlumno2) {
                                        item2 = z;
                                        z = personas.size();
                                    } else {
                                        item2 = 100000;
                                    }

                                }

                                if (item2 <= personas.size()) {
                                    if (personas.get(item2) instanceof pasajeros) {
                                        try {

                                            transportes.get(posicion).getAlumnos().add((pasajeros) personas.get(item2));
                                        } catch (Exception e) {
                                            System.out.println("La posicion del transporte es incorrecta.");
                                        }

                                    }
                                } else {
                                    System.out.println("No se encontro el ID del alumno");
                                }*/
                }
                    break;

                case 2:{
                    
                }break;
                case 3:{
                    System.out.println("Listar alumnos del transporte");
                    //for each del arraylist de alumnos
                    //dentro del for each:  alumnos.toString();
                }break;
                case 4:{
                    System.out.println("Escoger Transportista");
                } break;
                case 5:{
                    System.out.println("Quitar transportista");
                    
                }break;
                case 6:{
                }break;
                case 7:{
                }break;
                case 8:
                    //transportes.toString();
                    break;
                case 9:
                    System.out.println("Simulación");
                    break;
            }
            
        }while(opcion!=0 || opcion!=9);

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
                    for (int i = 0; i < alum.size(); i++) {
                        int t = i + 1;
                        System.out.println("alumno " + t + ":" + alum.get(i));
                    }
                }
                break;
                case 11:{
                    for (int i = 0; i < transportista.size(); i++) {
                        int t = i + 1;
                        System.out.println("transportista " + t + ":" + transportista.get(i));
                    }
                }
                break;
                case 12:{
                    for (int i = 0; i < trans.size(); i++) {
                        int t = i + 1;
                        System.out.println("transporte " + t + ":" + trans.get(i));
                    }
                }
                break;


            }
        } 
    }
}
