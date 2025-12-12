public class Sistema {




    private Envio[] envios;
    private Repartidor[] repartidores;


    public Sistema() {
        // Array vacío con 3 posiciones
        envios = new Envio[3];
        repartidores = new Repartidor[5];
        crearRepartidores();

    }
    private void crearRepartidores() {
        // 3 autónomos
        repartidores[0] = new Repartidor_autonomo("Juan", "Pérez", true, 10f);
        repartidores[1] = new Repartidor_autonomo("Ana", "García", true, 12f);
        repartidores[2] = new Repartidor_autonomo("Luis", "Martínez", false, 8f);

        // 2 contratados
        repartidores[3] = new Repartidor_contratado("Marta", "López", true, 15f);
        repartidores[4] = new Repartidor_contratado("Carlos", "Fernández", false, 9f);
    }
    public Repartidor[] getRepartidores() {
        return repartidores;
    }

    public void setRepartidores(Repartidor[] repartidores) {
        this.repartidores = repartidores;
    }

    public Envio[] getEnvios() {
        return envios;
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
    public void mostrarPendientes(){
        System.out.println("=== ENVIOS PENDIENTES ===");

        // Foreach
        int contador =1;
        int pendientes =0;
        for (Envio e : envios) {
            System.out.println(contador+".");
            if (e == null) {
                System.out.println(" [VACIO]");
            } else {
                pendientes++;
                System.out.print(" [" + e.toString());
                System.out.print("] Envio a " + e.getCiudad());
                if (e.getRepartidor() == null) {
                    System.out.print(" - Sin asignar");
                    System.out.print(" - Asignado a: " + e.getRepartidor().getNombre());
                }
            }
        }
        System.out.println("Total pendientes: " + pendientes);
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
