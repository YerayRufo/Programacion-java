public class Envio_internacional  extends Envio{
    public Envio_internacional(String ciudad, Repartidor repartidor, double peso) {
        super(ciudad, repartidor, peso);
    }

    public void  definirPrecio(){
        //15 euros por kilo
        super.setPrecio(getPeso() * 15);

    }
    @Override
    public String toString() {
        return "Internacional";
    }
}
