package copiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4A {
    public static void main(String[] args) {
        // Creación de tabla que contenga 10 números
        int tablaEnteros[] = new int[10];
        // Creación de tabla para añadir números
        int tablaResultado[] = new int[0];

        // Variable que guarda el número actual
        int valor;

        int indiceBusqueda = 0;

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Bucle que hará que el usuario introduzca números en la tabla
        for (int i = 0; i < tablaEnteros.length; i++) {
            tablaEnteros[i] = key.nextInt();
        }

        valor = tablaEnteros[indiceBusqueda];

            for (int i = 0; i < tablaEnteros.length; i++) {
                if (valor == tablaEnteros[i]) {
                    tablaResultado = Arrays.copyOf(tablaResultado, tablaResultado.length+1);
                    tablaResultado[tablaResultado.length-1] = valor;
                    valor = tablaEnteros[indiceBusqueda+1];
                    i = 0;
                }
            }
        System.out.println(Arrays.toString(tablaResultado));

        // Cierre de escáner
        key.close();

    }
}
