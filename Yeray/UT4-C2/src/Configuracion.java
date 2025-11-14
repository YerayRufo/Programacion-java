public class Configuracion {
    public int IVA = 21;
    public double costeTransporte = 6.00;
    public String nombreTienda = "TecnoAstur Store ";

    public Configuracion(int IVA, double costeTransporte, String nombreTienda) {
        this.IVA = IVA;
        this.costeTransporte = costeTransporte;
        this.nombreTienda = nombreTienda;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public double getCosteTransporte() {
        return costeTransporte;
    }

    public void setCosteTransporte(double costeTransporte) {
        this.costeTransporte = costeTransporte;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }


}
