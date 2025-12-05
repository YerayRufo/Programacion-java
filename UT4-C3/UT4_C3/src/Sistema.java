public class Sistema {


    private Envio[] envios;

    public Sistema() {
        // Array vacío con 3 posiciones
        envios = new Envio[3];
    }

    public void huecoDisponibles() {
        System.out.println("=== REGISTRO DE ENVIO ===");

        System.out.println("Huecos disponibles:");
        for (int i = 1; i < 4; i++) {
            if (envios[i - 1] == null) {
                System.out.println("[" + i + "] Envio " + i + " -> VACIO");
            } else {
                System.out.println("[" + i + "] Envio " + i + " -> OCUPADO");
            }
        }
    }

    public void eleccionModalidad() {
        System.out.println("1. Estandar");
        System.out.println("2. Urgente");
        System.out.println("3. Internacional");
        System.out.println("Opcion: ");
    }

    public void registroEnvio(int hueco, int modalidad, String destino, double pesoPaquete) {

        if (modalidad > 3) {
            System.out.println("Opcion no valida ");

        } else {
            switch (modalidad) {
                case (1):
                    envios[hueco - 1] = new Envio_estandar(destino, null, pesoPaquete);
                    envios[hueco - 1].definirPrecio();
                    break;
                case (2):
                    envios[hueco - 1] = new Envio_urgente(destino, null, pesoPaquete);
                    envios[hueco - 1].definirPrecio();
                    break;
                case (3):
                    envios[hueco - 1] = new Envio_internacional(destino, null, pesoPaquete);
                    envios[hueco - 1].definirPrecio();
                    break;
            }

        }

    }
}
