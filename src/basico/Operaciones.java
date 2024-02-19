/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author 1059356842
 */
public class Operaciones {
//declaro el arreglo 

    int numeros[] = new int[4];
//metodo

    void escribirDatosBasicos() {
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        System.out.println("arreglo escrito con datos estaticos");
    }

    void leer_1Arreglo() {
        System.out.println("Posicion 0=" + numeros[0]);
        System.out.println("Posicion 1=" + numeros[1]);
        System.out.println("Posicion 2=" + numeros[2]);
        System.out.println("Posicion 3=" + numeros[3]);
    }
    //metodo 2 para escribir
    void escribir_2(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=2*i;
        }
        System.out.println("Arreglo escrito con datos dinamicos");
    }
    void leer_3(){
        System.out.println("Leyendo el arreglo escrito de forma dinamica");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion "+i+"="+numeros[i]);
        }
    }
}
