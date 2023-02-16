package clasesarray;

import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Creación de dos tablas de longitud 6
        int apuesta[] = new int[6];
        int ganador[] = {1, 43, 7, 40, 28, 19};

        // Contador del número de aciertos
        int aciertos = 0;

        // Genera números aleatorios entre 1 y 49 en la primera tabla y se ejecuta antes de llegar
        // al final de la tabla
        for (int i = 0; i < apuesta.length; i++) {
            // Según la posición de la tabla genera un número aleatorio entre 1 y 49
            apuesta[i] = (int) (Math.random()*50+1);
        }
        // En este bucle compara las posiciones de las dos tablas para saber si hay aciertos
        for (int i = 0; i < apuesta.length; i++) {
            // Comparamos las posiciones de las tablas y si son iguales se le suma a aciertos uno
            if (apuesta[i] == ganador[i]) {
                aciertos++;
            }
        }
        // Imprimimos la apuesta
        System.out.println(Arrays.toString(apuesta));
        // Imprimimos el número de aciertos
        if (aciertos != ganador.length) {
            System.out.println("El número de aciertos es " + aciertos);
        } else {
            System.out.println("¡HAS GANADO!");
        }
    }
}
