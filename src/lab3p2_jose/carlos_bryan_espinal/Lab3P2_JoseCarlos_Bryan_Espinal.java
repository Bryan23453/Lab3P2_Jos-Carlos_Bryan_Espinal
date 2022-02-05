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
        ArrayList<String> pasajeros = new ArrayList();
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
                     int opcion;
        do{
            System.out.println("0. Salir\n" +
            "1. Subir Alunmo al transporte\n" +
            "2. Listar alumnos del transporte\n" +
            "3. Escoger transportista\n" +
            "4. Añadir ruta\n" +
            "5. Imprimir transporte\n" +
            "6. Destruya EL transporte");
            System.out.print("Seleccione una opción: ");
             opcion = lea.nextInt();
            switch (opcion){
                case 0:{
                    System.out.println("Gracias");}
                    break;
                case 1:{
                    if (alum.isEmpty()) {
                        System.out.println(" No hay alumnos registradas ");
                    }else{
                        System.out.println("selecione el alumno a subir al autobus");
                        for (int i = 0; i < alum.size(); i++) {
                            int t = i + 1;
                            System.out.println("alumno " + t + ":" + alum.get(i));
                        }
                        int ops = lea.nextInt();
                        ops--;
                        pasajeros.add(alum.get(ops).getNom());
                        trans.get(ops).setPasajeros(pasajeros);
                    }  
                               
                }
                    break;

                case 2:{
                    
                    
                }break;
                case 3:{
                    int transs=0;
                    if (transportista.isEmpty()) {
                        System.out.println(" No hay transportistas registrados ");
                    }else{
                        System.out.println("seleccione trasnportista a asignar");
                        for (int i = 0; i < transportista.size(); i++) {
                            int t = i + 1;
                            System.out.println("transportista " + t + ":" + transportista.get(i));
                        }
                    }
                    
                    
                     if (trans.isEmpty()) {
                        System.out.println(" No hay transportes registrados ");
                    }else{
                        System.out.println("ingrese transporte a asignar transportista");
                        for (int i = 0; i < trans.size(); i++) {
                            int t = i + 1;
                            System.out.println("transporte " + t + ":" + trans.get(i));
                        }
                    }
                     int transport=lea.nextInt();
                    transport--;
                    trans.get(transs).setConductores(transportista.get(transport).getNom());
                }break;
                case 4:{
                    System.out.println("Escoger Transportista");
                } break;
                case 5:{
                    for (int i = 0; i < trans.size(); i++) {
                        int t = i + 1;
                        System.out.println("transporte " + t + ":" + trans.get(i));
                    }
                    
                }break;
                case 6:{
                    
                }break;
                
            }
            
        }while(opcion!=0 );

                }
             
            
                break;
                case 8:{
                    if (clas.isEmpty()) {
                        System.out.println(" No hay clases registradas ");
                    }else{
                        for (int i = 0; i < clas.size(); i++) {
                            int t = i + 1;
                            System.out.println("clase " + t + ":" + clas.get(i));
                        }
                    }
                }
                break;
                case 9:{

                }
                break;
                case 10:{
                    if (alum.isEmpty()) {
                        System.out.println(" No hay alumnos registradas ");
                    }else{
                        for (int i = 0; i < alum.size(); i++) {
                            int t = i + 1;
                            System.out.println("alumno " + t + ":" + alum.get(i));
                        }
                    }
                }
                break;
                case 11:{
                    if (transportista.isEmpty()) {
                        System.out.println(" No hay transportistas registrados ");
                    }else{
                        for (int i = 0; i < transportista.size(); i++) {
                            int t = i + 1;
                            System.out.println("transportista " + t + ":" + transportista.get(i));
                        }
                    }
                }
                break;
                case 12:{
                    if (trans.isEmpty()) {
                        System.out.println(" No hay transportes registrados ");
                    }else{
                        for (int i = 0; i < trans.size(); i++) {
                            int t = i + 1;
                            System.out.println("transporte " + t + ":" + trans.get(i));
                        }
                    }
                }
                break;


            }
        } 
    }
}
