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
        // Si el índice es mayor igual a la longitud de la tabla significa que se ha salido de la tabla, por lo que
        // no se ha encontrado la posición
        if (indiceBusqueda >= tabla.length) {
            // Le asignamos menos 1
            indiceBusqueda = -1;
        }
        // Devuelve la posición
        return indiceBusqueda;
    }

    public static int[] sinRepetidos(int[] t) {
        // Tabla auxiliar
        int tabla[] = new int[0];
        // Tabla copia
        int tablaCopia[] = Arrays.copyOf(t, t.length);

        // Variable posición
        int aux;

        // Recorre la tabla
        for (int i = 0; i < tablaCopia.length; i++) {
            // Ordena la tabla
            Arrays.sort(tablaCopia);
            // Busca en la tabla nueva si existe ese número
            aux = Arrays.binarySearch(tabla, tablaCopia[i]);
            // Comprueba si ha encontrado la posición
            if (aux < 0) {
                // Añade una posición a la tabla
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                // El valor se le añade a la última posición de la tabla
                tabla[tabla.length - 1] = tablaCopia[i];
            }

        } // Fin de bucle
        return tabla;
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
                // El valor se le añade a la última posición de la tabla
                tabla[tabla.length - 1] = t[i];
            }
        }
        // Devuelve la tabla
        return tabla;
    }

    public static int[] buscarTodos(int[] t, int valor) {
        // Tabla auxiliar
        int tabla[] = new int[0];

        // Busca valor en la tabla
        for (int i = 0; i < t.length; i++) {
            if (valor == t[i]) {
                // Añade una posición a la tabla
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                // El valor se le añade a la última posición de la tabla
                tabla[tabla.length - 1] = i;
            }
        } // Fin del bucle

        // Devuelve la tabla
        return tabla;
    }

    public static int[] suma(int[] t, int numElementos) {
        // Tabla auxiliar
        int suma[] = new int[0];
        // Variable auxiliar
        int aux;

        // Busca valor en la tabla
        for (int i = 0; i <= t.length - numElementos; i++) {
            // Reinicia la variable a 0
            aux = 0;
            // Añade una posición al array
            suma = Arrays.copyOf(suma, suma.length + 1);
            for (int j = 0; j < numElementos; j++) {
                // El aux será la suma y cogerá el valor de la posición actual más el rango al que llega.
                aux += t[i + j];
            }
            // Mete la suma en la última posición
            suma[suma.length - 1] = aux;
        } // Fin del bucle

        // Devuelve la tabla
        return suma;
    }

    public static boolean esMagica(int tabla[][]) {
        // Variable booleana dice si es magico
        boolean esMagica = true;
        // Variable suma de filas
        int sumaFilas = 0;
        // Variable auxiliar suma
        int sumaActual;

        // Le da valor a la sumaFilas
        for (int i = 0; i < tabla[0].length; i++) {
            sumaFilas += tabla[0][i];
        }
        // Recorre las filas para comprobar si es igual la suma de las filas
        for (int fila = 0; fila < tabla.length; fila++) {
            sumaActual = 0;
            for (int col = 0; col < tabla[fila].length; col++) {
                sumaActual += tabla[fila][col];
            }
            if (sumaActual != sumaFilas) {
                esMagica = false;
            }
        } // Fin de bucle

        //
        if (esMagica) {
            // Empieza revisando la suma de las columnas
            for (int col = 0; col < tabla[0].length; col++) {
                sumaActual = 0;
                for (int fila = 0; fila < tabla.length; fila++) {
                    sumaActual += tabla[col][fila];
                }
                if (sumaActual != sumaFilas) {
                    esMagica = false;
                }
            }// Fin de bucle
        } // Fin de la condición

        return esMagica;
    }

    public static int[][] gira90(int tablainicio[][]){
        // Tabla auxiliar
        int tabla90[][] = new int[tablainicio[0].length][tablainicio[0].length];

        // Recorremos la tabla
        for (int i = 0; i < tablainicio.length; i++) {
            // Recorre las columnas
            for (int j = 0; j < tablainicio[i].length; j++) {
                // A la hora de colocar las posiciones en la tabla en la tabla de 90 grados
                // las columnas serán la j, e iremos recorriendo al revés las columnas para añadir los valores.
                tabla90[j][tablainicio.length - i - 1] = tablainicio[i][j];
            }
        }
        // Devuelve la tabla
        return tabla90;
    }

} // Fin de clase
