package eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    // Función que comprueba los números entrantes y los introduce en la tabla
    private static int[] compruebaNumeros(int[] tabla, int num, Scanner key) {
        // Comprueba que los números son mayor que 0
        while (num > 0) {
            // Variable que comprueba que si se ha encontrado un número repetido
            boolean encontrado = false;
            // Bucle que recorre los valores de la tabla
            for (int repetido : tabla) {
                // Si el valor de la tabla es igual al valor a buscar el numero encontrado pasará a ser true
                if (repetido == num) {
                    encontrado = true;
                    // Se sale del bucle actual
                    break;
                }
            } // Cierre de bucle foreach

            // Si la variable encontrado es igual a false, entonces añade a la posición de la tabla una posición más
            if (!encontrado) {
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                // Guarda el valor en la última posición de la tabla
                tabla[tabla.length - 1] = num;
            }
            // Vuelve a pedir el número
            num = key.nextInt();
        } // Cierre de bucle while
        return tabla;
    }

    private static int[] generaNumeroSuerte(int[] lista) {
        int random2;
        int random1;
        // Se ejecutará mientras la longitud de la lista sea igual a 1
        while (lista.length > 1) {

            // Variable de la media aritmética entre dos números
            int media = 0;

            // Genera los números aleatorios y comprueba que no sean iguales
            random1 = (int) (Math.random() * lista.length);
            do {
                random2 = (int) (Math.random() * lista.length);
            } while (random2 == random1);

            // Hace la media de los dos números
            media += (lista[random1] + lista[random2]) / 2;

            // Variable auxiliar para no perder el valor
            int aux = lista[random2];

            // Sobreescribe una posición a la izquierda todos los números en la tabla
            System.arraycopy(lista, random1 + 1, lista, random1, lista.length - random1 - 1);
            // Le quita a la tabla el último número
            lista = Arrays.copyOf(lista, lista.length - 1);

            // Encontrar nueva posición del random 2
            random2 = Arrays.binarySearch(lista, aux);
            // Sobreescribe una posición a la izquierda todos los números en la tabla
            System.arraycopy(lista, random2 + 1, lista, random2, lista.length - random2 - 1);

            // Mete en la última posición la media
            lista[lista.length - 1] = media;

            // Ordena la lista ordenada
            Arrays.sort(lista);
        } // Fin del bucle
        return lista;
    }

    public static void main(String[] args) {

        // Creación de lista de longitud 2
        int lista[] = new int[0];

        // Variable que se pide al usuario
        int num;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide un número base
        System.out.println("Deme sus números favoritos: ");
        num = key.nextInt();

        // Llama a la función para introducirle valores a la lista
        lista = compruebaNumeros(lista, num, key);

        // Ordena la lista
        Arrays.sort(lista);

        // Imprime el resultado
        System.out.println(Arrays.toString(lista));

        // Llama a la función que devuelve la lista
        lista = generaNumeroSuerte(lista);

        // Imprime resultado
        System.out.println("Tu número de la suerte es: ");
        System.out.println(Arrays.toString(lista));
    }

}
