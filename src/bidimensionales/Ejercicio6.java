package bidimensionales;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Creación de notas de 6*10
        int tabla[][] = new int[6][10];

        // Creación de arrays para guardar el máximo y el mínimo
        int maxTabla[] = new int[2];
        int minTabla[] = new int[2];

        // Creación de variable max y min
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Le introducimos valores
        // Primero recorre la fila hasta el valor total de la tabla
        for (int fila = 0; fila < tabla.length; fila++) {
            // En segundo lugar recorre las columnas de cada fila
            for (int col = 0; col < tabla[fila].length; col++) {
                // Rellena la posición con los siguientes valores
                tabla[fila][col] = (int) (Math.random() * 1000 + 1);

            }
        } // Fin de bucle

        // Primero recorre la fila hasta el valor total de la tabla
        for (int fila = 0; fila < tabla.length; fila++) {
            // En segundo lugar recorre las columnas de cada fila
            for (int col = 0; col < tabla[fila].length; col++) {
                // Calcula el máximo comparando el array con el valor del máximo
                if (tabla[fila][col] > max) {
                    // Le asigna la posición de la fila y la col y la guarda en la tabla max
                    maxTabla[0] = fila;
                    maxTabla[1] = col;
                    // Le da el valor de la tabla a max
                    max = tabla[fila][col];
                }
                // Calcula el mínimo comparando el array con el valor del máximo
                if (tabla[fila][col] < min) {
                    // Le asigna la posición de la fila y la col y la guarda en la tabla min
                    minTabla[0] = fila;
                    minTabla[1] = col;
                    // Le da el valor de la tabla a min
                    min = tabla[fila][col];
                }
            }
        } // Fin de bucle

        // Muestra la tabla
        Funciones.muestraBidimensional(tabla);

        // Muestra el máximo y mínimo
        System.out.println("Máximo");
        System.out.println(Arrays.toString(maxTabla));
        System.out.println("Mínimo");
        System.out.println(Arrays.toString(minTabla));

    }
}