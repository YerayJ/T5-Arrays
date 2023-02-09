package funciones;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creación de tabla
        int[] tabla = {1, 2, 3, 4, 5, 6, 1, 3};

        // Ejercicio 1
        System.out.println("El resultado de la suma es: " + Funciones.sumaTabla(tabla));

        // Ejercicio 2
        System.out.println("El resultado del máximo es: " + Funciones.maxTabla(tabla));

        // Ejercicio 3
        System.out.println(Arrays.toString(Funciones.rellenaPares(10,13)));

        // Ejercicio 4
        System.out.println("La posición del número es: " + Funciones.buscar(tabla,10));

        // Ejercicio 5
        System.out.println("La tabla sin números repetidos es: " + Arrays.toString(Funciones.sinRepetidos(tabla)));

        // Ejercicio 6
        System.out.println("La tabla sin los máximos es: " + Arrays.toString(Funciones.eliminarMayores(tabla,2)));

        // Ejercicio 7
        System.out.println("La posición del valor es: " + Arrays.toString(Funciones.buscarTodos(tabla,1)));

    }
}
