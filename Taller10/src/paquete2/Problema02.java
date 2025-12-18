/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };

        int[] adultos = new int[edades.length];

        int menores = 0;
        String reporte = "";

        for (int i = 0; i < edades.length; i++) {

            adultos[i] = 0;

            for (int j = 0; j < edades[i].length; j++) {

                if (edades[i][j] < 18) {
                    menores = menores + 1;
                } else {
                    adultos[i] = adultos[i] + 1;
                }

            }
        }

        for (int i = 0; i < adultos.length; i++) {
            reporte = String.format(
                    "%sFamilia %d tiene %d adultos\n",
                    reporte,
                    i + 1,
                    adultos[i]);
        }

        reporte = String.format(
                "%s\nTotal de menores de edad: %d\n",
                reporte,
                menores);

        System.out.printf("%s", reporte);
    }
}
