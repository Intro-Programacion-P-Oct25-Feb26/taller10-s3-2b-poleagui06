/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };

        int correctos = 0;
        boolean fallos;
        String reporte = "";

        for (int i = 0; i < sensores.length; i++) {

            fallos = false;

            for (int j = 0; j < sensores[i].length; j++) {

                if (sensores[i][j] == false) {
                    fallos = true;
                }

            }

            if (fallos == false) {
                correctos = correctos + 1;
            } else {
                reporte = String.format(
                        "%sLa zona %d presenta al menos un fallo\n",
                        reporte,
                        i + 1);
            }
        }

        reporte = String.format(
                "%s\nTotal de zonas que funcionan sin fallos: %d\n",
                reporte,
                correctos);

        System.out.printf("%s", reporte);
    }
}
