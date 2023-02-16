package copiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4B {
    public static void main(String[] args) {
        int tablaEnteros[] = new int[10];
        int tablaResultado[];
        int tablaTemp[] = new int[10];
        int size = 0;

        Scanner key = new Scanner(System.in);

        for (int i = 0; i < tablaEnteros.length; i++) {
            tablaEnteros[i] = key.nextInt();
        }


        for (int i = 0; i < tablaEnteros.length; i++) {
            int valor = tablaEnteros[i];
            if ((Arrays.binarySearch(tablaTemp, 0, size + 1, valor) < 0)) {
                tablaTemp[size] = valor;
                size++;
            }
        }
        tablaResultado = Arrays.copyOf(tablaTemp, size);

        System.out.println(Arrays.toString(tablaEnteros));
        System.out.println(Arrays.toString(tablaResultado));

        key.close();
    }
}