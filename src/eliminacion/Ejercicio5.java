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

    public static void main(String[] args) {
        // Creación del número de la suerte
        int numSuerte;

        // Variables de posición aleatoria
        int random1, random2;

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

        // Se ejecutará mientras la longitud de la lista sea igual a 1
        while (lista.length == 1) {
            random1 = (int) (Math.random() * lista.length);
            random2 = (int) (Math.random() * lista.length);

            if (key == null) {
                
            }

        }

    }

}
