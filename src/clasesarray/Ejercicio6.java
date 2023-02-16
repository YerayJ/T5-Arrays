package clasesarray;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Creación de la tabla
        int tabla[] = new int[1000];

        // Creación de variable que se pedirá al usuario y valor que se buscará dentro de la tabla
        int n;

        // Contador que cuenta el número de veces que existe el n en el array
        int contador = 0;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Bucle donde le da valor a la tabla
        for (int i = 0; i < tabla.length; i++) {
            // Varía la posición de la tabla según la i y le asigna un valor aleatorio dentro del rango
            tabla[i] = (int) (Math.random() * 100);
        }
        // Pide valor al usuario
        System.out.println("Deme un número cualquiera de tipo entero: ");
        n = key.nextInt();

        // Bucle en el que se hace una búsqueda secuencial
        // Mientras no se encuentre el valor y no se llegue al final de la tabla se incrementa
        // el indiceBusqueda
        for (int indiceBusqueda = 0; indiceBusqueda < tabla.length; indiceBusqueda++) {
            // Si el valor del usuario es igual al número de la posición de la tabla se le suma uno al contador
            if (n == tabla[indiceBusqueda]) {
                contador++;
            }
        }
        // Muestra al usuario el resultado si el contador es distinto de 0
        if (contador != 0) {
            System.out.println("El número se repite " + contador + " veces");
        } else { // Si no muestra que ese número no existe en la tabla
            System.out.println("El número no existe");
        }
        // Cierre de escáner
        key.close();

    }
}
