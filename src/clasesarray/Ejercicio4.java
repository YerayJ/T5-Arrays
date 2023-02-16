package clasesarray;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creación de tabla de longitud 30
        int tabla[] = new int[30];

        // Creación de bucle for
        for (int i = 0; i < tabla.length; i++) {
            // Cada posición varía según la i y se le da como valor un valor aleatorio entre 0 y 9)
            tabla[i] = (int) (Math.random() * 10);
        }
        // Ordena el array con sort
        Arrays.sort(tabla);

        // Imprime por pantalla
        System.out.println(Arrays.toString(tabla));

    }
}
