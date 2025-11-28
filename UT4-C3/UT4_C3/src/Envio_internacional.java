public class Envio_internacional  extends Envio{
    public Envio_internacional(String ciudad, String direccion, String nombre, String apellido, Repartidor repartidor, float peso, float precio) {
        super(ciudad, direccion, nombre, apellido, repartidor, peso, precio);
    }

    public void  definirPrecio(){
        //15 euros por kilo
        setPrecio(getPeso() * 15);

    }
}
