public class Repartidor_autonomo  extends Repartidor{



    private float comision;

    public Repartidor_autonomo(String nombre, String apellidos, boolean disponible, float precio) {
        super(nombre, apellidos, disponible, precio);
        //1.5€ por envio
        this.comision = 1,5;
    }
    public float getComision() {
        return comision;
    }
    public static void precioRepartidor(){
        setPrecio(getComision()+getPrecio());
    }
}
