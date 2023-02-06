package bidimensionales;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Creación de notas de 3*6
        int tabla[][] = new int[4][5];

        // Creación variable suma de filas
        int total = 0;

        // Creación de variable auxiliar suma
        int suma = 0;

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
            suma = 0;
            for (int col = 0; col < tabla[fila].length; col++) {
                // Añadimos a la suma el valor de la tabla
                suma += tabla[fila][col];
                // Añadimos todos los valores al total
                total += tabla[fila][col];
                // Imprime linea por línea
                System.out.print("\t" + " " + tabla[fila][col]);
            }
            // Por último imprime la suma de cada fila al final
            System.out.print(" " + suma);
            System.out.println();
        }
        // Inicia un bucle que serán las columnas hasta la longitud de la posición 0, que en este caso es 4
        for (int col = 0; col < tabla[0].length; col++) {
            // Inicializa la variable suma a 0
            suma = 0;
            // Comprueba todas las filas
            for (int fila = 0; fila < tabla.length; fila++) {
                // Añadimos a la suma el valor de la tabla
                suma += tabla[fila][col];
            }
            // Imprime la suma
            System.out.print("\t" + suma);
        }
        // Imprime el total de todo
        System.out.print(" " + total);
    }
}
