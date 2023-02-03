package bidimensionales;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creación de notas de 3*6
        int notas[][] = new int[3][6];

        // Primera fila
        notas[0][1] = 30;
        notas[0][2] = 2;
        notas[0][5] = 5;

        // Segunda fila
        notas[1][0] = 75;

        // Tercera fila
        notas[2][2] = -2;
        notas[2][3] = 9;
        notas[2][5] = 11;

        // Muestra la tabla
        Funciones.muestraBidimensional(notas);
    }
}
