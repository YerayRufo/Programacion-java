public class Flota {

    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador actual;
    private int barcos;
    private int contador;

    public Flota(Jugador jugador1, Jugador jugador2, Jugador actual, int barcos) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.actual = actual;
        this.barcos = barcos;
    }

    private void turno() {
        if (contador % 2 == 0) {
            actual = jugador2;
        } else {
            actual = jugador1;
        }
    }

    public void jugar() {
        while (jugador1.getAciertos() != barcos && jugador2.getAciertos() != barcos) {
            System.out.println("Introducir fila");
            int fila = Main.sc.nextInt();
            System.out.println("Introducir columna");
            boolean acierto;
            int columna = Main.sc.nextInt();
            actual.disparar(fila, columna);
            actual.visualizar();
            if (acierto) {
                System.out.println("Hundido");
                if (actual.getAciertos()== barcos){
                    System.out.println(actual + " ha ganado");
                }
            } else {
                System.out.println("Agua");
            }
        }
        contador++;
        turno();
    }
}
