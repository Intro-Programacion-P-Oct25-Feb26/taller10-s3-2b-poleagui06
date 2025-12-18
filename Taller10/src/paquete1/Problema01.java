/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};

        int[] diasAsistidos = new int[4];

        int contador;
        String reporte = "";
        String mensaje = "";

        for (int i = 0; i < asistencia.length; i++) {

            contador = 0;

            for (int j = 0; j < asistencia[i].length; j++) {

                if (asistencia[i][j] == true) {
                    contador = contador + 1;
                }

            }

            diasAsistidos[i] = contador;
        }

        for (int i = 0; i < estudiantes.length; i++) {

            if (diasAsistidos[i] == 5) {
                mensaje = "Cumple asistencia completa";
            } else {
                mensaje = "No cumple asistencia completa";
            }

            reporte = String.format(
                    "%sEstudiante: %s\n"
                    + "Días asistidos: %d\n"
                    + "Estado: %s\n\n",
                    reporte,
                    estudiantes[i],
                    diasAsistidos[i],
                    mensaje);
        }

        System.out.printf("%s", reporte);
    }
}
