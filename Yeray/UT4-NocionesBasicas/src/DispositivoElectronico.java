

public class DispositivoElectronico {

    private String nombre;
    private Fabricante fabricante;
    private float precioBase;
    private double consumo;


    public DispositivoElectronico(String nombre, Fabricante fabricante, float precioBase, double consumo) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.precioBase = precioBase;
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", fabricante=" + fabricante +
                ", precioBase=" + precioBase +
                ", consumo=" + consumo +
                '}';
    }

    public double introducirPreciokWh() {
        System.out.println("Introduce precio");
        double precio = Main.t.nextDouble();

        return precio;
    }

    public double calcularConsumoAnual() {

        return getConsumo() * introducirPreciokWh();
    }

    public double calcularPrecioFinal() {
        return calcularConsumoAnual() * (1.21);
    }
}
