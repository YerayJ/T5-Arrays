package copiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creación de variable auxiliar.
        int cifra;
        // Creación de tabla de longitud 15
        int tabla[] = new int[15];

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        //Pedimos números por teclado dentro de un bucle que recorre la tabla
               for (int i = 0; i < tabla.length; i++) {
                  tabla[i] = key.nextInt();
             }
        // Guardamos el último valor de la tabla en una variable
        cifra = tabla[tabla.length-1];

        // Recorremos la tabla de manera decreciente
        for (int i = tabla.length - 1; i > 0; i--) {
            // Le asignamos el valor anterior a cada posición
            tabla[i] = tabla[i - 1];
        }

        // Le damos al primer valor el último valor
        tabla[0] = cifra;

        // Mostramos el resultado
        System.out.println(Arrays.toString(tabla));

        // Cierre de escáner
        key.close();
    }
}
