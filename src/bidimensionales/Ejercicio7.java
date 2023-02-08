package bidimensionales;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Creación de tabla principal 4*4
        int tablaPrincipal[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // Creación de variable auxiliar
        int aux;

        // Muestra tabla Principal
        System.out.println("\tTabla Original");
        Funciones.muestraBidimensional(tablaPrincipal);

        for (int i = 0; i < tablaPrincipal.length; i++) {
            for (int j = i; j < tablaPrincipal[i].length; j++) {
                aux = tablaPrincipal[i][j];
                tablaPrincipal[i][j] = tablaPrincipal[j][i];
                tablaPrincipal[j][i] = aux;
            }
        } // Fin del bucle

        // Muestra la tabla final
        System.out.println("Tabla Final");
        Funciones.muestraBidimensional(tablaPrincipal);

    }
}
