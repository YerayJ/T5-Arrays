package copiainsercion;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Creación de tabla que contenga 100 números
        int tabla[] = new int[100];
        // Creación de tabla que contenga los números pares
        int inverso[] = new int[100];

        // Se introducen los números según la longitud
        for (int i = 0; i < tabla.length; i++) {
            // EL valor de la tabla será i+1
            tabla[i] = i + 1;

        } // Recorremos la tabla inverso
        for (int i = 0; i < inverso.length; i++) {
            // Le damos a la posición de inverso el valor de tabla 99 -i
            inverso[i] = tabla[99 - i];
        }
        // Imprimimos la tabla inversa
        System.out.println(Arrays.toString(inverso));

    }
}
