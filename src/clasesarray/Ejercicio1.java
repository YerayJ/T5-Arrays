package clasesarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creación de dos variables que se piden al usuario
        int M, N;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide variables al usuario
        System.out.println("Deme el tamaño del array ");
        N = key.nextInt();
        System.out.println("Que valor quiere que contenga el array ");
        M = key.nextInt();

        // Creamos el array según el dato introducido por el usuario
        int array[] = new int[N];

        // Valor que se asigna al array
        Arrays.fill(array, M);

        // Se convierte el array en String para imprimirlo de manera más estética
        System.out.println(Arrays.toString(array));

        // Cerramos el escáner
        key.close();

    }
}