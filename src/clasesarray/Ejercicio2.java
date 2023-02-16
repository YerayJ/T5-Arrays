package clasesarray;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Creación de tabla
        int tabla[] = new int[55];

        // Creación de variable desde donde empieza el rango
        int desde = 0;
        // Creación de constante hasta donde termina el rango
        final int FINALRANGE = 10;

        // Bucle donde la condición es que la i sea menor que el rango total
        for (int i = 0; i < FINALRANGE; i++) {
            // Rellenamos la tabla en cada vuelta del bucle desde hasta desde más la variable i
            Arrays.fill(tabla, desde, desde + i, i);
            // Como nos tenemos que mover tantos espacios como el número sea, sumamos a desde la variable i
            desde += i;
        }
        // Convierte la tabla en String y la imprime
        System.out.println(Arrays.toString(tabla));
    }
}
