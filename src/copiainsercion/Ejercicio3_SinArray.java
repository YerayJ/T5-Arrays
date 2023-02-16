package copiainsercion;

import java.util.Arrays;

public class Ejercicio3_SinArray {
    // Función para saber si un número es primo
    static boolean esPrimo(int num){
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
    public static void main(String[] args) {
        // Creación de tabla que contenga 20 números
        int tabla[] = new int[10];
        // Creación de tabla con el resultado
        int resultado[] = new int[10];
        // Contador de la posición de números primos
        int contadorPrimos = 0;
        // Contador de la posición de números no primos
        int contadorNoPrimos = tabla.length-1;



        // Bucle para generar números aleatorios
        for (int i = 0; i < tabla.length - 1; i++) {
            tabla[i] = (int) (Math.random() * 100 + 1);
        }
        // Bucle en el que comprueba si los números del array son pares o impares
        for (int i = 0; i < tabla.length - 1; i++) {
            // Comprueba si el número es par
            if ((esPrimo(tabla[i]))) {
                // Le da el valor de la posición i en la tabla y lo aplica a la posición de los pares en la nueva tabla
                resultado[contadorPrimos] = tabla[i];
                // Suma al contador de los pares, para que avance hacia delante en la tabla
                contadorPrimos++;
            } else {
                // Le da el valor de la posicion i en la tabla y lo aplica a la posición de los impares en la nueva tabla
                resultado[contadorNoPrimos] = tabla[i];
                // Suma al contador de los impares, para que avance hacia delante en la tabla
                contadorNoPrimos--;
            }
        }

        // Imprime resultado en String
        System.out.println(Arrays.toString(resultado));


    }
}
