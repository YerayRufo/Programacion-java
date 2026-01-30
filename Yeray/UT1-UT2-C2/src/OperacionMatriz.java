
public class OperacionMatriz {

    /**
     * Metodo que crea una matriz
     */
    public static int[][] crearMatrizCuadrada(int n) {

        /**
         * Se crea la matriz con n filas y n columnas
         */
        int[][] matriz = new int[n][n];
        int valor;

        /**
         * Bucle que recorre la matriz
         */
        for (int i = 0; i < matriz.length; i++) {


            for (int j = 0; j < matriz[i].length; j++) {

                /**
                 * Se genera un numero aleatorio entre 1 y 100 y se añade a cada casilla de la matriz
                 */
                valor = (int) (Math.random() * 100) + 1;

                matriz[i][j] = valor;
            }
        }

        return matriz;
    }
    public static int[][] invertirDiagonal(int[][] matriz){
        for (int i = 0; i <matriz.length/2 ; i++) {
            int auxiliar = matriz[i][i];
            matriz[i][i] = matriz[matriz.length -1-i][matriz.length-1-i];
            matriz[matriz.length -1-i][matriz.length-1-i] = auxiliar;
        }

        return matriz;
    }

    public static int[][] invertirOtraDiagonal(int[][] matriz){
        for (int i = 0; i < matriz.length / 2; i++) {
            int j = matriz.length - 1 - i;
            int auxiliar = matriz[i][j];
            matriz[i][j] = matriz[matriz.length - 1 - i][matriz.length - 1 - j];
            matriz[matriz.length - 1 - i][matriz.length - 1 - j] = auxiliar;
        }

        return matriz;
    }
    public static String mostrarMatriz(int[][] matriz){
        String matrizEscrita = "";
        for (int i = 0; i < matriz.length; i++) {


            for (int j = 0; j < matriz[i].length; j++) {

                /**
                 * Se genera un numero aleatorio entre 1 y 100 y se añade a cada casilla de la matriz
                 */


                 matrizEscrita += (String. valueOf(matriz[i][j]) +" ") ;
            }
            matrizEscrita += "\n";
        }
        return matrizEscrita;
    }
}
