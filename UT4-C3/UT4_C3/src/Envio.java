public abstract class Envio {
    private String ciudad;
    private String direccion;
    private String nombre;
    private String apellido;
    private Repartidor repartidor;



    private float peso;


    private float precio;


    public Envio(String ciudad, String direccion, String nombre, String apellido, Repartidor repartidor, float peso, float precio) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.repartidor = repartidor;
        this.peso = peso;
        this.precio = precio;
    }


    public float getPeso() {
        return peso;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void  definirPrecio(){
        //4 euros por kilo
        setPrecio(getPeso() * 4);

    }
}
