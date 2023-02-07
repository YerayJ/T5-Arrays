package bidimensionales;

public class Funciones {

    // Función que muestra la tabla bidimensional
    static void muestraBidimensional(int[][] tabla) {
        //Recorre la fila
        for (int fila = 0; fila < tabla.length; fila++) {
            // Recorre la columna teniendo en cuenta la longitud de la fila
            for (int col = 0; col < tabla[fila].length; col++) {
                // Imprime la tabla mediante tabuladores
                System.out.print("\t" + tabla[fila][col] );
            }
            // Imprime un espacio
            System.out.println();

        } // Fin de bucle
    }

    // Función que muestra la tabla bidimensional
    static void muestraBidimensionalEj3(int[][] tabla) {
        //Recorre la fila
        for (int fila = 0; fila < tabla.length; fila++) {
            // Recorre la columna teniendo en cuenta la longitud de la fila
            for (int col = 0; col < tabla[fila].length; col++) {
                // Imprime la tabla mediante tabuladores
                System.out.print("\t" + tabla[fila][col] + " ");
            }
            // Imprime un espacio
            System.out.println("Alumno " + (fila + 1));

        } // Fin de bucle
    }

}


