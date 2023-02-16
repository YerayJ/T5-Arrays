package clasesarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Variable de jugadores disponibles
        int jugadores = 8;
        int num;

        // Creación de tabla de jugadores
        int tabla[] = new int[jugadores];

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Bucle for que se ejecuta mientras sea menor a la longitud del array
        for (int i = 0; i < tabla.length; i++) {
            // Pide número al usuario
            num = key.nextInt();
            // Comprueba si está dentro del rango
            if (num >= 1000 && num <= 2800) {
                // Le asigna el valor de num a la posición de la tabla que varía según la i
                tabla[i] = num;
            // Sino resta a la variable i uno para que vuelva al estado anterior
            } else {
                i--;
            }

        }
        // Ordena la tabla de manera ascendente
        Arrays.sort(tabla);

        // Imprime texto para indicar que empieza la lista
        System.out.println("Tu lista es: ");

        // Bucle que va de manera descendente y muestra directamente la posición de la tabla según la i
        for (int i = tabla.length - 1; i >= 0; i--) {
            System.out.println(tabla[i]);
        }

        // Cierre de escáner
        key.close();

    }
}
