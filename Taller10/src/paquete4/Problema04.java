/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matrizA = new int[3][2];
        int[][] matrizB = new int[3][2];

        boolean bandera = true;

        String reporte = "";

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Ingrese valor A[%d][%d]: ", i, j);
                matrizA[i][j] = entrada.nextInt();
            }
        }
    }
}
