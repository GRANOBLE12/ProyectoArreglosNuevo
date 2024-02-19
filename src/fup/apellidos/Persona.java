/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fup.apellidos;

import java.util.Scanner;

/**
 *
 * @author 1059356842
 */
public class Persona {
    String apellidos[]=new String[4];
    Scanner in =new Scanner (System.in);
    
    void registrarApellidos(){
        System.out.println("REHISTRANDO APELLIDOS");
        String dato=null;
        for (int i = 0; i < apellidos.length; i++) {
            System.out.println("Ingrese el apellido");
            dato=in.nextLine();
            
            apellidos[i]=dato;
        }
    }
    void listar(){
        System.out.println("LISTADO APELLIDOS");
        for (int i = 0; i < apellidos.length; i++) {
            //use print sin salto de linea y -- para separar
            System.out.print(apellidos[i]+"--");
        }
    }
    void buscarApellido(){
        System.out.println("BUSCAR PO APELLIDO");
        System.out.println("Apellido a buscar: ");
        String datoBuscar=in.next();
        
        boolean bandera=false;
        for (int i = 0; i < apellidos.length; i++) {
            //comparo
            if(datoBuscar.equals(apellidos[i])){
                bandera =true;
            }            
        }
        //reviso la bndera
        if(bandera==true)
            System.out.println("Encontrado!!");
        else
            System.out.println("No encontrado!!");
        
    }
}
