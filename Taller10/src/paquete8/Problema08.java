/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

import java.util.Scanner;

/**
 *
 * @author Pole
 */
public class Problema08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        double[][] valorV = new double[2][3];
        String mensaje = "";
       
        for (int fila = 0; fila < dato1.length; fila++) {
            for (int columna = 0; columna < dato1[fila].length; columna++) {
                if (dato1[fila][columna] < dato2[fila][columna]) {
                    valorV[fila][columna] = dato1[fila][columna];
                } else {
                    valorV[fila][columna] = dato2[fila][columna];
                }

                mensaje += String.format("%.0f   ", valorV[fila][columna]);
            }
            mensaje = mensaje + "\n";
        }

        System.out.println(mensaje);
    }

}
