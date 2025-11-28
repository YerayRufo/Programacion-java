public abstract class Repartidor {

    private String nombre;
    private String apellidos;
    private boolean disponible;
    private float precio;

    public Repartidor(String nombre, String apellidos, boolean disponible, float precio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.disponible = disponible;
        this.precio = precio;
    }

    public static void precioRepartidor(){

    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
