public class Envio_urgente  extends Envio{
    public Envio_urgente(String ciudad, Repartidor repartidor, double peso) {
        super(ciudad, repartidor, peso);
    }

    public void  definirPrecio(){
        //8 euros por kilo
        super.setPrecio(getPeso() * 8);

    }
}
