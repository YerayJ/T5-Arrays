package funciones;

import java.util.Arrays;

public class Funciones {
    public static int sumaTabla(int[] t) {
        // Tabla copia
        int[] tabla = t;
        // Variable para recoger la suma de todos los parámetros
        int suma = 0;
        // Inicia un bucle que se ejecuta hasta la longitud de la tabla
        for (int fila = 0; fila < tabla.length; fila++) suma += tabla[fila];

        // Devuelve tabla
        return suma;
    }

    public static int maxTabla(int[] t) {
        // Tabla copia
        int[] tabla = t;
        // Variable para recoger el máximo de todos los parámetros
        int max = Integer.MIN_VALUE;
        // Inicia un bucle que se ejecuta hasta la longitud de la tabla
        for (int fila = 0; fila < tabla.length; fila++) {
            if (tabla[fila] > max) {
                max = tabla[fila];
            }
        }
        // Devuelve tabla
        return max;
    }

    public static int[] rellenaPares(int longitud, int fin) {
        // Tabla copia
        int[] tabla = new int[longitud];

        // Inicia un bucle que se ejecuta hasta la longitud de la tabla
        for (int fila = 0; fila < tabla.length; fila++) {
            // Genera un número aleatorio dentro del rango
            tabla[fila] = (int) (Math.random() * (fin - 1) + 1);
            // Comprueba que el número es impar
            if (tabla[fila] % 2 != 0) {
                // Si lo es se le suma uno para que sea par
                tabla[fila]++;
            }
        }
        // Devuelve tabla
        return tabla;
    }

    public static int buscar(int[] t, int clave) {
        // Tabla copia
        int[] tabla = t;

        // Índice búsqueda que muestra la posición
        int indiceBusqueda = 0;

        // Inicia un bucle que se ejecuta hasta la longitud de la tabla
        while (indiceBusqueda < tabla.length && clave != tabla[indiceBusqueda]) {
            indiceBusqueda++;
        }
        // Si el indice es mayor igual a la longitud de la tabla significa que se ha salido de la tabla, por lo que
        // no se ha encontrado la posición
        if (indiceBusqueda >= tabla.length) {
            // Le asignamos menos 1
            indiceBusqueda = -1;
        }
        // Devuelve la posición
        return indiceBusqueda;
    }

    public static int[] sinRepetidos(int[] t) {

        return t;
    }

    public static int[] eliminarMayores(int[] t, int valor) {
        // Tabla auxiliar
        int tabla[] = new int[0];

        // Recorre la tabla
        for (int i = 0; i < t.length; i++) {
            // Comprueba que el número actual de la tabla es menor que el valor
            if (t[i] <= valor) {
                // Añade una posición a la tabla
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                //
                tabla[tabla.length - 1] = t[i];
            }
        }

        return tabla;
    }

} // Fin de clase
