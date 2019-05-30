/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Scanner;

/**
 *
 * @author jecueva1997
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        // declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        // Declaramos una variable booleana
        boolean bandera = true;
        double cantidad = 0;
        // Se declara una cadena para la comparación
        String x;
        // Declaramos un arreglo
        int[] notas = new int[6];
        // Detallamos los rangos
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", 
            "19.1-20", "20.1-adelante"};
        // Utilizamos una estructura repetitiva
        while (bandera == true) {
            // Pedimos el ingreso de la nota
            System.out.printf("Ingrese la nota\n");
            cantidad = entrada.nextDouble();
            // NOs basomos en ;as comparaciones de los rangos
            if (cantidad >= 0 && cantidad <= 8) {
                notas[0] = notas[0] + 1;
            } else {
                if (cantidad >= 8.1 && cantidad <= 12) {
                    notas[1] = notas[1] + 1;
                } else {
                    if (cantidad >= 12.1 && cantidad <= 16) {
                        notas[2] = notas[2] + 1;
                    } else {
                        if (cantidad >= 16.1 && cantidad <= 19) {
                            notas[3] = notas[3] + 1;
                        } else {
                            if (cantidad >= 19.1 && cantidad <= 20) {
                                notas[4] = notas[4] + 1;
                            } else {
                                notas[5] = notas[5] + 1;
                            }
                        }
                    }
                }
            }
            // Se procede a limpiar el bufer
            entrada.nextLine();
            // Se le pide al usuario si desea seguir ingresando valores
            System.out.printf("Ingrese la palabra 'si', si desea seguir "
                    + "ingresando notas\n");
            x = entrada.nextLine();
            // Se utiliza unaa condicion
            if (x.equals("si")) {
                bandera = true;
            } else {
                bandera = false;
            }
        }
        System.out.println("Notas ingresadas\nRangos");
        // Utilizacion del ciclo repetitivo for
        for (int i = 0; i < notas.length; i++) {
            // Impresion de los rangos con las notas
            System.out.printf("%s = %d\n", rangos[i], notas[i]);
        }
    }
}
