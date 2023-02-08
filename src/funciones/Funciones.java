package funciones;

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

    public static int[] rellenaPares(int longitud,int fin) {
        // Tabla copia
        int[] tabla = new int[longitud];

        // Inicia un bucle que se ejecuta hasta la longitud de la tabla
        for (int fila = 0; fila < tabla.length; fila++) {
                // Genera un número aleatorio dentro del rango
                tabla[fila] = (int)(Math.random()*(fin-1)+1);
                // Comprueba que el número es impar
            if (tabla[fila] % 2 != 0) {
                // Si lo es se le suma uno para que sea par
                tabla[fila]++;
            }
        }
        // Devuelve tabla
        return tabla;
    }

} // Fin de clase
