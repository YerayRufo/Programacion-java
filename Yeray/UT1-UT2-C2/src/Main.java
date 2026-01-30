import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la matriz: ");
        int n = sc.nextInt();

        int[][] matriz = OperacionMatriz.crearMatrizCuadrada(n);

        System.out.println("Matriz creada de tamaño: "
                + matriz.length + "x" + matriz[0].length);

        System.out.println("Matriz: \n"
                + OperacionMatriz.mostrarMatriz(matriz));
        OperacionMatriz.invertirDiagonal(matriz);

        System.out.println("Matriz invertida la diagonal: \n"
                + OperacionMatriz.mostrarMatriz(matriz));
    }
}
