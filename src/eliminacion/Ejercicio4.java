package eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creación de tabla
        int tabla[] = new int[20];

        // Variable num para pedirla al usuario
        int num;

        // Creación de variable que contiene la posición
        int posicion = 0;

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Bucle para introducir datos en la tabla
        for (int i = 0; i < tabla.length; i++) {
            // Le da un valor aleatorio entre el 1 y el 100
            tabla[i] = (int) (Math.random() * 10 );
        } // Fin de bucle

        // Imprime valor de la tabla actual
        System.out.println("El valor de la tabla actual es: ");
        System.out.println(Arrays.toString(tabla));

        // Pide valor al usuario
        System.out.println("Deme un valor: ");
        num = key.nextInt();

        // Bucle que recorre la tabla
        while (posicion < tabla.length) {
            // Comprueba que el valor de la tabla es igual al de la variable
            if (tabla[posicion] > num ) {
                // Sobreescribe una posición a la izquierda todos los números en la tabla
                System.arraycopy(tabla, posicion + 1, tabla, posicion, tabla.length - posicion - 1);
                // Le quita a la tabla el último número
                tabla = Arrays.copyOf(tabla, tabla.length - 1);
            } else { // Añade una posición si el número es menor
                posicion++;
            }
        } // Cierre del bucle
        System.out.println(Arrays.toString(tabla));

        // Cierre de escáner
        key.close();

    }
}
