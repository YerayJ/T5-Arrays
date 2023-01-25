package eliminacion;

import java.util.Arrays;

public class Ejercicio2 {

    static boolean esPrimo(int num) {
        boolean esPrimo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    public static void main(String[] args) {
        // Creación de tabla
        int tabla[] = new int[10];

        // Creación de variable que contiene la posición
        int posicion = 0;

        // Bucle para introducir datos en la tabla
        for (int i = 0; i < tabla.length; i++) {
            // Le da un valor aleatorio entre el 1 y el 100
            tabla[i] = (int) (Math.random()*100+1);
        }

        // Bucle que recorre la tabla
        while (posicion < tabla.length) {
            // Comprueba si los números son pares
            if (!esPrimo(tabla[posicion])) {
                // Copia el número siguiente de la tabla y lo pega un número antes para sobreescribir el número actual
                System.arraycopy(tabla, posicion + 1 , tabla, posicion, tabla.length - 1 - posicion);
                // Con este ArrayCopyOf elimina el último número de la tabla
                tabla = Arrays.copyOf(tabla, tabla.length-1);

            } else { // En el caso de que sea primo se le añade uno a la posición
                posicion++;
            }
        } // Termina el bucle

        // Muestra la tabla
        System.out.println(Arrays.toString(tabla));
    }
}
