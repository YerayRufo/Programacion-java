public abstract class Repartidor {

    private String nombre;
    private String apellidos;
    private boolean disponible;
    private double precio;

    public Repartidor(String nombre, String apellidos, boolean disponible, double precio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.disponible = disponible;
        this.precio = precio;
    }

    public  void precioRepartidor(){

    }

    public double getPrecio() {
        return precio;
    }

    public  void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
