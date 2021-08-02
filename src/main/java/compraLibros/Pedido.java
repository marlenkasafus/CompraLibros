package compraLibros;

public class Pedido {
    private String tipoCliente;
    private Integer cantidad;

    public Pedido(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void agregarProducto(Integer cantidad, String producto) {
        this.cantidad = cantidad;
    }

    public int calcularCostoEnvio() {
        if (tipoCliente.equals("STANDARD") || cantidad < 5) {
            return 100;
        }
        return 0;
    }
}
