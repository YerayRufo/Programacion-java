
import java.time.LocalTime;
import java.time.Duration;

public class Gimnasio {

    String nombre;
    int yoga;
    int pilates;
    int spinning;
    float totalAcumulado;
    int salaMaximoSpinning;
    int inscritosMaximoSpinning;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        this.yoga = 0;
        this.pilates = 0;
        this.spinning = 0;
        this.totalAcumulado = 0;
        this.salaMaximoSpinning = 0;
        this.inscritosMaximoSpinning = 0;
    }

    public int getSalaMaximoSpinning() {
        return this.salaMaximoSpinning;
    }

    public String devolverActividadMasInscritos() {
        if (yoga > pilates && yoga > spinning) {
            return "Yoga";
        } else if (pilates > yoga && pilates > spinning) {
            return "Pilates";
        } else {
            return "Spinning";
        }
    }

    public void tarificarClaseEnSala(int sala, char tipo, int horas, int minutos, int inscritos) {
        int minutosTotales = minutos + (horas * 60);
        double precioClase = 3 + (minutosTotales / 15) * 0.2;
        int minutosAbiertoElGimnasio = (20 * 60 + 30) - (10 * 60 + 30);
        int vecesOfertadasLaClase = minutosAbiertoElGimnasio / (minutosTotales + 10);
        if (tipo == 's') {
            this.spinning += inscritos;
            if (inscritos > this.inscritosMaximoSpinning) {
                this.inscritosMaximoSpinning = inscritos;
                this.salaMaximoSpinning = sala;
            }
        } else if (tipo == 'p') {
            this.pilates += inscritos;
        } else {
            this.yoga += inscritos;
        }
        this.totalAcumulado += (inscritos * precioClase);
        System.out.println("Gimnasio: "+this.nombre+"\nDuracion: ");
    }

    public String devolverNombreActividad(char letra) {
        if (letra == 'Y') {
            return "Yoga";
        } else if (letra == 'P') {
            return "Pilates";
        } else {
            return "Spinning";

        }
    }

}
