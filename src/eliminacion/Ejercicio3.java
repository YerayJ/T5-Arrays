package eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Creación de tabla
        int tabla[] = new int[10];

        // Creación de variable opción
        String opc = " ";

        // Creación de variable valor que se pedirá al usuario
        int valor;

        // Creación de variable que contiene la posición
        int posicion = 0;

        // Escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Bucle para introducir datos en la tabla
        for (int i = 0; i < tabla.length; i++) {
            // Le da un valor aleatorio entre el 1 y el 100
            tabla[i] = (int) (Math.random() * 100 + 1);
        } // Fin de bucle

        // Mientras la opción sea distinta de c se seguirá ejecutando
        while (!opc.equals("c")) {

            // Muestra menú
            System.out.println("Elige una opción:\n" +
                    "a. Mostrar valores \n" +
                    "b.Eliminar valor \n" +
                    "c. Salir");
            // Pide valor al usuario
            opc = key.next();

            // Switch con las opciones disponibles
            switch (opc) {
                case "a" -> {
                    System.out.println(Arrays.toString(tabla));
                }
                case "b" -> {
                    System.out.println("Deme que valor quiere borrar: ");
                    valor = key.nextInt();
                    // Bucle for que busca el número
                    while (posicion < tabla.length) {
                        // Comprueba que el valor de la tabla es igual al de la variable
                        if (tabla[posicion] == valor) {
                            // Sobreescribe una posición a la izquierda todos los números en la tabla
                            System.arraycopy(tabla, posicion + 1, tabla, posicion, tabla.length - posicion - 1);
                            // Le quita a la tabla el último número
                            tabla = Arrays.copyOf(tabla, tabla.length - 1);

                        } else { // Si no encuentra el valor le suma uno a la posición
                            posicion++;
                        }
                    } // Cierre de bucle
                    System.out.println(Arrays.toString(tabla));
                }
                case "c" -> {

                }
                default -> {
                    System.out.println("No existe esa opción");
                }
            } // Cierre switch
        } // Cierre del bucle

    }

}
