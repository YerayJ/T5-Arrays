package copiainsercion;

import java.util.Arrays;

public class Ejercicio3 {
    // Función para saber si un número es primo
    static boolean esPrimo(int num){
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (num <= 1) {
            primo = false;
        }
        return primo;
    }
    public static void main(String[] args) {
        // Creación de tabla que contenga 20 números
        int tabla[] = new int[10];
        // Creación de tabla con el resultado
        int primo[] = new int[0];
        // Creación de tabla con el resultado
        int noPrimo[] = new int[0];

        // Bucle para generar números aleatorios
        for (int i = 0; i < tabla.length - 1; i++) {
            tabla[i] = (int) (Math.random() * 100 + 1);
            // Comprueba que el número sea primo con la función ya declarada anteriormente
            if (esPrimo(tabla[i])) {
                // Si lo es le añadimos a la tabla primo una posición más
                primo = Arrays.copyOf(primo, primo.length+1);
                // Y en la última posición de la nueva tabla le añadimos el número que hemos comprobado
                primo[primo.length-1] = tabla[i];
            } else {
                // Si no es primo le añadimos una posición a la tabla noPrimo
                noPrimo = Arrays.copyOf(noPrimo, noPrimo.length+1);
                // Y en la última posición de la nueva tabla le añadimos el número que hemos comprobado
                noPrimo[noPrimo.length-1] = tabla[i];
            }
        }
        // Convierte en una String la tabla y la imprime para ver el resultado del principio
        System.out.println(Arrays.toString(tabla));

        // Pega la tabla de es primo al principio de la tabla original
        System.arraycopy(primo, 0,tabla, 0, primo.length);
        // Y también pega los sobrantes que serían los no primos después de la longitud de la tabla primo
        System.arraycopy(noPrimo, 0,tabla, primo.length, noPrimo.length);

        // Imprime resultado final en String
        System.out.println(Arrays.toString(tabla));


    }
}
