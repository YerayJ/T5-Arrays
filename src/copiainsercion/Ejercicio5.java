package copiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Creación de tabla que contenga 10 números
        int tablaEnteros[] = new int[10];
        // Creación de tabla que contenga los números pares
        int numPares[] = new int[0];
        // Creación de tabla que contenga los números impares
        int numImpares[] = new int[0];

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Bucle que mete los números del usuario en la tabla
        for (int i = 0; i < tablaEnteros.length; i++) {
            tablaEnteros[i] = key.nextInt();
        }

        // Bucle que comprueba si el numero es par o impar
        for (int i = 0; i < tablaEnteros.length; i++) {
            // Comprueba si el número es par
            if ((tablaEnteros[i] % 2 == 0)) {
                numPares = Arrays.copyOf(numPares, numPares.length+1);
                numPares[numPares.length-1] = tablaEnteros[i];
            } else {
                numImpares = Arrays.copyOf(numImpares, numImpares.length+1);
                numImpares[numImpares.length-1] = tablaEnteros[i];
            }
        }
        System.out.println(Arrays.toString(numPares));
        System.out.println(Arrays.toString(numImpares));

        // Cierre de escáner
        key.close();
    }
}
