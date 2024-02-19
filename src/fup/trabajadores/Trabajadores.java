/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fup.trabajadores;

import java.util.Scanner;

/**
 *
 * @author 1059356842
 */
public class Trabajadores {

    int cedula[] = new int[5];
    Scanner in = new Scanner(System.in);

    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               /n**********Menú  De Opciones*********
                               1.Registrar Cedulas
                               2.Leer Cedulas
                               3.Buscar Cedulas
                               4.Salir
                               Opcion:""");
            opcion = in.nextInt();
            switch(opcion){
                case 1:
                    this.registrar();
                    break;
                case 2:
                    this.listar();
                    break;
                case 3:
                    this.buscarcedula();
                break;
            }
        }while(opcion>0 && opcion <4);
    }

    void registrar() {
        int datoRecibido = 0;
        for (int i = 0; i < cedula.length; i++) {
            System.out.println("Digite el numero de cedula");
            datoRecibido = in.nextInt();
            cedula[i] = datoRecibido;
        }
    }

    void listar() {
        System.out.println("Leyendo las cedulas registradas");
        for (int i = 0; i < cedula.length; i++) {
            System.out.println(cedula[i] + "/");

        }

    }

    void buscarcedula() {
        int datoEncontrado=0;
        int bandera=0;
        System.out.println("Digite el numero de cedula a buscar");
        datoEncontrado=in.nextInt();
        for (int i = 0; i < cedula.length; i++) {
            if(datoEncontrado==cedula[i]){
            System.out.println("La cedula "+datoEncontrado+" ya esta regitrada");
            bandera=1;
            }
        }
        if(bandera==0)
            System.out.println("la cedula "+datoEncontrado+" no esta registrada");
        

    }

}
