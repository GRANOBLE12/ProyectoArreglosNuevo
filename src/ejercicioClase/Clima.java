/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioClase;

import java.util.Scanner;

/**
 *
 * @author 1059356842
 */
//metodo para guardar las temperaturas de lunes a viernes
public class Clima {

    double temperaturas[] = new double[5];
    Scanner in = new Scanner(System.in);

    void guardarTemperaturas() {
        double datoRecibido;
        //pido la temperatura
        System.out.println("Temperaturas lunes a viernes");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("digite latemperatura");
            datoRecibido = in.nextDouble();

            //la gardo en el arreglo
            temperaturas[i] = datoRecibido;
        }
        System.out.println("Datos registrados exitosamente");
    }

    //metodo para ller el arreglo
    void leer_1Temperaturas() {
        System.out.println("Leyendo las temperaturas (Lunes/.../viernes");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i] + "/");

        }
    }

    //metodo para hallar el promedio
    void promediar() {
        //debo usar un acomulador
        double suma = 0;
        double promedio;
        System.out.println("Promedio de las temperaturas de Lun a Vie");
        for (int i = 0; i < temperaturas.length; i++) {
            suma = suma + temperaturas[i];

        }
        //hallo el promedio
        promedio = suma / 5;
        System.out.println("El promedio es " + promedio);
    }

    void verTemperaturasMayores() {
        System.out.println("Temperaturas mayores a 22°C");
        for (int i = 0; i < temperaturas.length; i++) {
            //comparo
            if (temperaturas[i] > 22) {
                System.out.print(temperaturas[i] + "/");
            }
        }
    }

    //menu
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                           \n**************MENU DE OPCIONES**************
                           *****GESTION DE TEMPERATURAS (LUN-VIE)******
                           
                           1. Guardar temperaturas
                           2. leer Datos
                           3. Promedio
                           4. temperaturas mayores a 22°C
                           5. salir
                           Opcion:
                           """);
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    this.guardarTemperaturas();
                    break;
                case 2:
                    this.leer_1Temperaturas();
                    break;
                case 3:
                    this.promediar();
                    break;
                case 4:
                    this.verTemperaturasMayores();
                    break; 
            }
        } while (opcion > 0 && opcion < 5);

    }
}
