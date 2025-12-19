public abstract class Envio {
    private String ciudad;
    private String direccion;
    private String nombre;
    private String apellido;
    private Repartidor repartidor;



    private double peso;


    private double precio;


    public Envio(String ciudad, Repartidor repartidor, double peso) {
        this.ciudad = ciudad;
        this.repartidor = repartidor;
        this.peso = peso;
        this.precio = 0;
    }


    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void  definirPrecio(){
        //4 euros por kilo
        setPrecio(getPeso() * 4);

    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPrecio() {
        return precio;
    }
}
