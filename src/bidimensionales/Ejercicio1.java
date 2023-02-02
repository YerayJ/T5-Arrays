package bidimensionales;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creación de tabla con 25 posiciones
        int tabla[][] = new int[5][5];

        // Le introducimos valores
        // Primero recorre la fila hasta el valor total de la tabla
        for (int fila = 0; fila < tabla.length; fila++) {
            // En segundo lugar recorre las columnas de cada fila
            for (int col = 0; col < tabla[fila].length; col++) {
                // Rellena la posición con los siguientes valores
                tabla[fila][col] = 10 * fila + col;
            }
        } // Fin de bucle

        //Recorre la fila
        for (int fila = 0; fila < tabla.length; fila++) {
            // Recorre la columna teniendo en cuenta la longitud de la fila
            for (int col = 0; col < tabla[fila].length; col++) {
                // Imprime la tabla mediante tabuladores
                System.out.print("\t" + tabla[fila][col] + " ");
            }
            // Imprime un espacio
            System.out.println();

        } // Fin de bucle
    }
}
