import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Tablero t1 = new Tablero();
        Tablero t2 = new Tablero();

        System.out.println("Delimita las filas del tablero: ");
        int a = sc.nextInt();
        System.out.println("Delimita las columnas del tablero: ");
        int b = sc.nextInt();
        t1.crearTablero(a, b);
        t2.crearTablero(a, b);

        System.out.println("Numero de barcos por jugador: ");
        int barcos = sc.nextInt();
        System.out.println("Jugador1 introduce las coordenadas para tus barcos");
        for (int i = 0; i < (barcos*2); i++) {
            System.out.println("Fila para barco numero " + (i + 1));
            int f = sc.nextInt();
            System.out.println("Columna para barco numero " + (i + 1));
            int c = sc.nextInt();
            if (t1[f][c] == null && f>=0 && f<=a && f>=0 && f<=b ) {
                System.out.println("Barco añadido");
                if (i > barcos) {
                    if (i== barcos+1){
                        System.out.println("Jugador2 introduce las coordenadas para tus barcos");
                    }
                    t1.colocarBarco(f,c);
                }else t2.colocarBarco(f,c);


            }
            else {
                System.out.println("Hueco ya ocupado");
            }
        }
    }
}
