public class Jugador {
    private String nombre;
    private Tablero barcos;
    private Tablero disparos;
    private int aciertos;

    public Jugador(String nombre, Tablero barcos, Tablero disparos, int aciertos) {
        this.nombre = nombre;
        this.barcos = barcos;
        this.disparos = disparos;
        this.aciertos = aciertos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tablero getBarcos() {
        return barcos;
    }

    public void setBarcos(Tablero barcos) {
        this.barcos = barcos;
    }

    public Tablero getDisparos() {
        return disparos;
    }

    public void setDisparos(Tablero disparos) {
        this.disparos = disparos;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
}
