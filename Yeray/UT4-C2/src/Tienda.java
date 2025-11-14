public class Tienda {

    private String Empresa;
    private Producto producto;
    private Pedido ultimoPedidoRecoger;
    private Pedido ultimoPedidoDomicilio;

    public Tienda(String empresa, Producto producto, Pedido ultimoPedidoRecoger, Pedido ultimoPedidoDomicilio) {
        Empresa = empresa;
        this.producto = producto;
        this.ultimoPedidoRecoger = ultimoPedidoRecoger;
        this.ultimoPedidoDomicilio = ultimoPedidoDomicilio;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getUltimoPedidoRecoger() {
        return ultimoPedidoRecoger;
    }

    public void setUltimoPedidoRecoger(Pedido ultimoPedidoRecoger) {
        this.ultimoPedidoRecoger = ultimoPedidoRecoger;
    }

    public Pedido getUltimoPedidoDomicilio() {
        return ultimoPedidoDomicilio;
    }

    public void setUltimoPedidoDomicilio(Pedido ultimoPedidoDomicilio) {
        this.ultimoPedidoDomicilio = ultimoPedidoDomicilio;
    }
}
