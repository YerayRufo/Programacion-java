public class Envio_urgente  extends Envio{
    public Envio_urgente(String ciudad, String direccion, String nombre, String apellido, Repartidor repartidor, float peso, float precio) {
        super(ciudad, direccion, nombre, apellido, repartidor, peso, precio);
    }
    public void  definirPrecio(){
        //8 euros por kilo
        setPrecio(getPeso() * 8);

    }
}
