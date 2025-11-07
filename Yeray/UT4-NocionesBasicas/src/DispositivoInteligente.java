public class DispositivoInteligente extends DispositivoElectronico {

    String conectividad;
    String version;
    float suscripcion;

    public DispositivoInteligente(String nombre, Fabricante fabricante, float precioBase, double consumo, String conectividad, String version, float suscripcion) {
        super(nombre, fabricante, precioBase, consumo);
        this.conectividad = conectividad;
        this.version = version;
        this.suscripcion = suscripcion;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public float getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(float suscripcion) {
        this.suscripcion = suscripcion;
    }

    public double introducirAnnos() {
        System.out.println("Introduce años");
        double annos = Main.t.nextDouble();

        return annos;
    }

    public double calcularCosteServicios() {

        return getSuscripcion() * introducirPreciokWh();
    }

    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() + calcularCosteServicios();
    }

}
