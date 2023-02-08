package bidimensionales;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creación de tabla de 3*6
        int tabla[][] = new int[3][6];

        // Primera fila
        tabla[0][1] = 30;
        tabla[0][2] = 2;
        tabla[0][5] = 5;

        // Segunda fila
        tabla[1][0] = 75;

        // Tercera fila
        tabla[2][2] = -2;
        tabla[2][3] = 9;
        tabla[2][5] = 11;

        // Muestra la tabla
        Funciones.muestraBidimensional(tabla);
    }
}
