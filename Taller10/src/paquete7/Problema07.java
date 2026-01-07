/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author Pole
 */
public class Problema07 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] matrizX = new double[3][3];
        double[][] matrizA = new double[3][3];
        double[][] matrizB = new double[3][3];
        boolean seCumple = true;

  
        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int columna = 0; columna < matrizX[fila].length; columna++) {
                System.out.printf("Ingrese valor para [%d][%d]: ", fila, columna);
                matrizX[fila][columna] = entrada.nextDouble(); 
            }
        }

        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int columna = 0; columna < matrizX[fila].length; columna++) {
                double x = matrizX[fila][columna];
                matrizA[fila][columna] = Math.pow(x + 1, 2); 
            }
        }

        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int columna = 0; columna < matrizX[fila].length; columna++) {
                double x = matrizX[fila][columna];
                matrizB[fila][columna] = (x * x) + (2 * x) + 1;
            }
        }

        for (int fila = 0; fila < matrizX.length; fila++) {
            for (int columna = 0; columna < matrizX[fila].length; columna++) {
                if (matrizA[fila][columna] != matrizB[fila][columna]) {
                    seCumple = false;
                    break; 
                }
            }
        }

        System.out.println("\n--- Resultado del Análisis ---");
        if (seCumple) {
            System.out.println("La identidad algebraica se cumple en todos los elementos.");
        } else {
            System.out.println("La identidad algebraica no se cumple en algunos elementos.");
        }
    }
    
}
