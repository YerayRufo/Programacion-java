public class Repartidor_contratado extends Repartidor {


    private double salario;

    public Repartidor_contratado(String nombre, String apellidos, boolean disponible, float precio) {
        super(nombre, apellidos, disponible, precio);
        this.salario = 1.5;
    }

    public double getSalario() {
        return salario;
    }

    public void precioRepartidor() {

        super.setPrecio(getSalario() + super.getPrecio());
    }

}
