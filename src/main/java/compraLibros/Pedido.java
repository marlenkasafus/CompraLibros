package compraLibros;

public class Pedido {
    private String tipoCliente;
    private Integer cantidad;
    private String producto;

    public Pedido(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void agregarProducto(Integer cantidad, String producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int calcularCostoEnvio() {
        if (tipoCliente.equals("STANDARD") || cantidad <5 || !producto.equals("libros")) {
            return 100;
        }
        return 0;
    }
}
