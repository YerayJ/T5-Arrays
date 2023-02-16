package copiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Creación de tabla que contenga 10 números
        int tabla[] = new int[10];
        // Variable que contiene la opción
        String opc= " ";
        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Le da valor aleatorios al array
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random()*10+1);
        }
        // Mientras la opción sea distinta de c se seguirá ejecutando
        while (!opc.equals("c")) {

            // Muestra menú
            System.out.println("Elige una opción:\n" +
                    "a. Mostrar valores \n" +
                    "b.Introducir valor \n" +
                    "c. Salir");
            // Pide valor al usuario
            opc = key.nextLine();

            // Switch con las opciones disponibles
            switch (opc) {
                case "a" -> {
                    System.out.println(Arrays.toString(tabla));
                }
                case "b" -> {
                    System.out.println("Introduzca 10 números: ");
                    for (int i = 0; i < tabla.length; i++) {
                        tabla[i] = key.nextInt();
                    }// Cierre bucle
                }
                case "c" -> {

                }
                default -> {
                    System.out.println("No existe esa opción");
                }
            } // Cierre switch
        }

        // Aviso de que acabó el programa
        System.out.println();
        System.out.println("Fin de programa");

        // Cierre escáner
        key.close();
    }
}
