package bidimensionales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Creación de notas de 4*5
        int notas[][] = new int[4][5];

        // Variable para guardar la nota
        int nota;

        // Variable para guardar la media
        int media = 0;

        // Variable para guardar el máximo
        int max = Integer.MIN_VALUE;

        // Variable para guardar el mínimo
        int min = Integer.MAX_VALUE;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Rellena la notas
        // Primero recorre la fila hasta el valor total de las notas
        for (int fila = 0; fila < notas.length; fila++) {
            // Separa las notas de cada alumno
            System.out.println("Deme las notas del alumno " + (fila+1));

            // En segundo lugar recorre las columnas de cada fila
            for (int col = 0; col < notas[fila].length; col++) {
                // Pide la nota
                System.out.println("Asignatura " + (col+1));
                nota = key.nextInt();

                // Rellena la posición con los siguientes valores.
                while (nota < 0 || nota > 10) {
                    nota = key.nextInt();
                } // Fin de while
                // Guarda la nota en la posición de la tabla
                notas[fila][col] = nota;
            }

        } // Fin de bucle

        // Muestra resultado
        Funciones.muestraBidimensionalEj3(notas);
        System.out.println();

        // Recorre la tabla
        for (int fila = 0; fila < notas.length; fila++) {
            // Por cada nueva fila reiniciamos la media
            media = 0;
            // Recorre las columnas
            for (int col = 0; col < notas[fila].length; col++) {
                // Suma cada posición a la media
                media += notas[fila][col];
                // Comprueba si el número es el máx
                if (notas[fila][col] > max) {
                   max = notas[fila][col];
                } // Comprueba si el número es el min
                if (notas[fila][col] < min) {
                    min = notas[fila][col];
                }
            }
            // Muestra resultados
            System.out.println("Alumno " + (fila+1) + "\n La media es: " + (media/notas[fila].length) +
                    " El máximo es: " + max + " El mínimo es: " + min);
        } // Fin de bucle

        // Cierre de escáner
        key.close();
    }
}
