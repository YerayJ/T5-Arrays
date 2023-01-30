package eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Creación del número de la suerte
        int numSuerte;

        // Variables de posición aleatoria

        // Creación de tabla de longitud 2
        int tabla[] = new int[0];

        int num = 0;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide un número base
        num = key.nextInt();

        // Pide números al usuario
        while (num > 0) {
            boolean encontrado = false;

            for (int repetido : tabla) {
                if (repetido == num) {
                    encontrado = true;
                    break;
                } else if (encontrado == false) {
                    tabla = Arrays.copyOf(tabla, tabla.length + 1);
                    tabla[tabla.length - 1] = num;
                } 


            }
            num = key.nextInt();

        } // Cierre de bucle

        System.out.println(Arrays.toString(tabla));
    }


}
