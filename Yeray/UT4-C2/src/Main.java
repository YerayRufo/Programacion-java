//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(
                "========= MENÚ TIENDA =========\n" +
                        "1. Ver / Modificar datos de empresa\n" +
                        "2. Ver / Modificar producto y precio\n" +
                        "3. Crear pedido para RECOGER en tienda\n" +
                        "4. Crear pedido a DOMICILIO\n" +
                        "5. Ver el último pedido para RECOGER y el último para DOMICILIO\n" +
                        "6. Ver estadísticas de ventas\n" +
                        "7. Configuración (IVA, coste transporte, nombre visible de la tienda…)\n" +
                        "8. Salir\n" +
                        "==============================="
        );

        System.out.println("Opción: " );
        int opcion=0;
        opcion = Entrada.introducirOpcion();
        switch (opcion){
            case 1:
                System.out.println("2) Ver / Modificar datos de empresa\n");

                System.out.println("--- DATOS DE EMPRESA ---");
                System.out.println("Nombre comercial:    " + @nombreEmpresa);
                System.out.println("CIF/NIF:             " + @cif);
                System.out.println("Dirección:           " + @direccion + "\n");

                System.out.println("¿Desea modificar algún dato? (S/N): " + @respuestaModificar);
                System.out.println("Seleccione campo (1=Nombre, 2=CIF/NIF, 3=Dirección, 0=Cancelar): " + @campoSeleccionado + "\n");

                System.out.println("Nuevo " + @campoTexto + ": " + @nuevoValor);
                System.out.println("✓ Actualizado.\n");

                System.out.println("--- DATOS DE EMPRESA ---");
                System.out.println("Nombre comercial:    " + @nombreEmpresaActualizado);
                System.out.println("CIF/NIF:             " + @cifActualizado);
                System.out.println("Dirección:           " + @direccionActualizada);
                break;
            case 2:
                System.out.println("3) Ver / Modificar producto y precio\n");

                System.out.println("--- PRODUCTO ÚNICO ---");
                System.out.println("Nombre:    " + @nombreProducto);
                System.out.println("Precio:    " + @precioProducto + " €\n");

                System.out.println("¿Desea cambiar (1=Nombre, 2=Precio, 0=Cancelar)? " + @opcionCambiar + "\n");

                System.out.println("Nuevo " + @campoProducto + " (€): " + @nuevoValorProducto);
                System.out.println("✓ Precio actualizado.\n");

                System.out.println("--- PRODUCTO ÚNICO ---");
                System.out.println("Nombre:    " + @nombreProductoActualizado);
                System.out.println("Precio:    " + @precioProductoActualizado + " €");
                break;
            case 3:
                System.out.println("--- NUEVO PEDIDO: RECOGER EN TIENDA ---");
                System.out.println("Nombre del cliente: " + nombreCliente);
                System.out.println("NIF (opcional): " + nifCliente);
                System.out.println("Unidades a comprar: " + unidades);
                System.out.println();
                System.out.println("Resumen (RECOGER):");
                System.out.println("Producto: Pack Starter");
                System.out.println("Precio unitario: " + precioUnitario + " €");
                System.out.println("Unidades: " + unidades);
                System.out.println("Base imponible: " + baseImponible + " €");
                System.out.println("IVA (21%): " + iva + " €");
                System.out.println("Transporte: " + transporte + " €");
                System.out.println("TOTAL: " + total + " €");
                System.out.println();
                System.out.println("¿Desea mostrar la FACTURA? (S/N): S");
                System.out.println();
                System.out.println("========== FACTURA ==========");
                System.out.println("EMPRESA:");
                System.out.println("  " + empresa + " | CIF: " + cifEmpresa);
                System.out.println("  C/ " + direccionEmpresa);
                System.out.println();
                System.out.println("CLIENTE:");
                System.out.println("  " + nombreCliente + " | NIF: " + nifCliente);
                System.out.println();
                System.out.println("DETALLE:");
                System.out.println("  Pack Starter x " + unidades + " -> " + precioUnitario + " € c/u");
                System.out.println();
                System.out.println("  Base imponible: " + baseImponible + " €");
                System.out.println("  IVA 21%: " + iva + " €");
                System.out.println("  Transporte: " + transporte + " €");
                System.out.println();
                System.out.println("TOTAL: " + total + " €");
                System.out.println("✓ Precio RECOGER guardado como 'Ultimo pedido para RECOGER'.\n");





        }

    }
}