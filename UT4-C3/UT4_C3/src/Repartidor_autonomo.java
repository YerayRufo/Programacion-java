public class Repartidor_autonomo  extends Repartidor{



    private double comision;

    public Repartidor_autonomo(String nombre, String apellidos, boolean disponible, float precio) {
        super(nombre, apellidos, disponible, precio);
        //1.5€ por envio
        this.comision = 1.5;
    }
    public double getComision() {
        return comision;
    }
    public void precioRepartidor(){

        super.setPrecio(getComision()+super.getPrecio());
    }
}
