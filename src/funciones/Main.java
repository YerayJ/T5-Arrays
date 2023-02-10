package funciones;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creación de tabla
        int[] tabla = {10, 1, 5, 8, 9, 2};

        // Creación de tabla bidimensional
        int[][] magicMatrix = {{8,1,6},{3,5,7},{4,9,2}};

        int[][] tabla90 = {{1,2,3},{4,5,6},{7,8,9}};


        // Ejercicio 1
        System.out.println();
        System.out.println("El resultado de la suma es: " + Funciones.sumaTabla(tabla));

        // Ejercicio 2
        System.out.println();
        System.out.println("El resultado del máximo es: " + Funciones.maxTabla(tabla));

        // Ejercicio 3
        System.out.println();
        System.out.println(Arrays.toString(Funciones.rellenaPares(10, 13)));

        // Ejercicio 4
        System.out.println();
        System.out.println("La posición del número es: " + Funciones.buscar(tabla, 10));

        // Ejercicio 5
        System.out.println();
        System.out.println("La tabla sin números repetidos es: " + Arrays.toString(Funciones.sinRepetidos(tabla)));

        // Ejercicio 6
        System.out.println();
        System.out.println("La tabla sin los máximos es: " + Arrays.toString(Funciones.eliminarMayores(tabla, 2)));

        // Ejercicio 7
        System.out.println();
        System.out.println("La posición del valor es: " + Arrays.toString(Funciones.buscarTodos(tabla, 1)));

        // Ejercicio 8
        System.out.println();
        System.out.println("La suma es: " + Arrays.toString(Funciones.suma(tabla, 3)));

        // Ejercicio 9
        System.out.println();
        System.out.println(Funciones.esMagica(magicMatrix)?"La tabla es mágica":"La tabla no es mágica");

        // Ejercicio 10
        System.out.println();
        System.out.println("Tabla Antes");
        bidimensionales.Funciones.muestraBidimensional((magicMatrix));
        System.out.println("Tabla después");
        bidimensionales.Funciones.muestraBidimensional(Funciones.gira90(tabla90));

    }
}
