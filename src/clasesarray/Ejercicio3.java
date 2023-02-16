package clasesarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Creación de variable que se pedirá al usuario para el array
        int num;

        // Creación de tablas 1 y 2
        int tabla1[] = new int[10];
        int tabla2[] = new int[10];

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide números al usuario
        System.out.println("Deme 20 números: ");

        // Bucle donde guarda los datos del usuario y los inserta en la primera tabla
        for (int i = 0; i < tabla1.length; i++) {
            num = key.nextInt();
            tabla1[i] = num;
        }
        // Bucle donde guarda los datos del usuario y los inserta en la segunda< tabla
        for (int i = 0; i < tabla2.length; i++) {
            num = key.nextInt();
            tabla2[i] = num;
        }

        // Conversión de tabla a tipo String y se imprime
        System.out.println(Arrays.toString(tabla1));
        System.out.println(Arrays.toString(tabla2));

        //Cierre de escáner
        key.close();

    }


}
