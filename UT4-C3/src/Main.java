import java.util.Scanner;

class Main {

    Scanner t = new Scanner(System.in);
    Sistema s = new Sistema();

    public void Menu() {
        System.out.println("""
                ==========================================
                        FASTLINE LOGISTICS - MENÚ
                ==========================================
                
                1. Registrar un nuevo envío
                2. Mostrar envíos pendientes
                3. Asignar envío a un repartidor
                4. Consultar coste de un envío
                5. Marcar envío como entregado
                6. Ver información de entregas
                0. Salir
                
                Seleccione una opción:
                """);
        int opcion = t.nextInt();

        switch (opcion) {
            case 1 -> {
                // Registrar un nuevo envío
                s.huecoDisponibles();

                System.out.println("Seleccione hueco: ");
                int hueco = t.nextInt();
                eleccionModalidad();
                int modalidad = t.nextInt();
                System.out.println("Destino del envio: ");
                String destino = t.next();
                System.out.println("Peso del paquete: ");
                double pesoPaquete = t.nextDouble();
                s.registroEnvio(hueco, modalidad, destino, pesoPaquete);
                System.out.println("El envio ha sido registrado correctamente en la posicion " + hueco);
            }
            case 2 -> {
                // Mostrar envíos pendientes
                s.mostrarPendientes();

            }
            case 3 -> {
                // Asignar envío a un repartidor
                System.out.println("=== ASIGNAR ENVIO ===");
                System.out.println("Seleccione envio a asignar (1/2/3) : ");
                int asignacion = t.nextInt();

                if (s.getEnvios()[asignacion].getRepartidor() != null) {
                    System.out.println("Repartidores disponibles:");
                    for(int i = 0; i < s.getRepartidores().length; i++) {

                    }
                } else {
                    System.out.println("Envio ya asignado a un repartidor");
                }
                asignarRepartidor();
            }
            case 4 -> {
                // Consultar coste de un envío
                consultarCoste();
            }
            case 5 -> {
                // Marcar envío como entregado
                marcarEntregado();
            }
            case 6 -> {
                // Ver información de entregas
                verInformacionEntregas();
            }
            case 0 -> {
                System.out.println("Saliendo del sistema...");
                return; // o System.exit(0);
            }
            default -> {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

    }

    public void eleccionModalidad() {
        System.out.println("1. Estandar");
        System.out.println("2. Urgente");
        System.out.println("3. Internacional");
        System.out.println("Opcion: ");
    }

    public static void main(String[] args) {

    }
}