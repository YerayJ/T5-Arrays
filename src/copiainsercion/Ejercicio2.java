package copiainsercion;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Creación de tabla que contenga 20 números
        int tabla[] = new int[20];
        // Tabla auxiliar de 20 números
        int resultado[] = new int[20];
        // Contador de la posición de números pares
        int pares = 0;
        // Contador de números impares que empieza por la parte de atrás de la tabla resultado
        int impares = resultado.length-1;

        // Bucle para generar números aleatorios
        for (int i = 0; i < tabla.length - 1; i++) {
            tabla[i] = (int) (Math.random() * 100 + 1);
        }
        // Bucle en el que comprueba si los números del array son pares o impares
        for (int i = 0; i < tabla.length - 1; i++) {
            // Comprueba si el número es par
            if ((tabla[i] % 2 == 0)) {
                // Le da el valor de la posicion i en la tabla y lo aplica a la posición de los pares en la nueva tabla
                resultado[pares] = tabla[i];
                // Suma al contador de los pares, para que avance hacia delante en la tabla
                pares++;
            } else {
                // Le da el valor de la posicion i en la tabla y lo aplica a la posición de los impares en la nueva tabla
                resultado[impares] = tabla[i];
                // Suma al contador de los impares, para que avance hacia delante en la tabla
                impares--;
            }
        }

        // Imprime resultado en String
        System.out.println(Arrays.toString(resultado));

    }
}
