package bidimensionales;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Creación de notas de 3*6
        int tabla[][] = new int[4][5];

        // Creación de variable auxiliar suma de las filas
        int sumaFila = 0;

        // Creación variable suma de filas
        int total = 0;

        // Creación de variable auxiliar suma de las filas
        int sumaCol = 0;

        // Le introducimos valores
        // Primero recorre la fila hasta el valor total de la tabla
        for (int fila = 0; fila < tabla.length; fila++) {
            // En segundo lugar recorre las columnas de cada fila
            for (int col = 0; col < tabla[fila].length; col++) {
                // Rellena la posición con los siguientes valores
                tabla[fila][col] = (int) (Math.random() * (999 - 100 + 1) + 100);
            }
        } // Fin de bucle

        for (int fila = 0; fila < tabla.length; fila++) {
            sumaFila = 0;
            for (int col = 0; col < tabla[fila].length; col++) {
                // Añadimos a la suma el valor de la tabla
                sumaFila += tabla[fila][col];
                // Añadimos todos los valores al total
                total += tabla[fila][col];
                // Imprime linea por línea
                System.out.print("\t" + tabla[fila][col]);
            }
            System.out.print(" " + sumaFila);
            System.out.println();
        }

        for (int col = 0; col < tabla.length; col++) {
            sumaCol = 0;
            for (int fila = 0; fila < tabla[col].length; fila++) {
                // Añadimos a la suma el valor de la tabla
                sumaCol += tabla[col][fila];

            }
            System.out.print("\t" + sumaCol);
        }


    }
}
