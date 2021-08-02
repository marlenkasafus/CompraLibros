package compraLibros;

public class Pedido {
    private String tipoCliente;

    public Pedido(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void agregarProducto(Integer cantidad, String producto) {

    }

    public int calcularCostoEnvio() {
        if (tipoCliente.equals("STANDARD")) {
            return 100;
        }
        return 0;
    }
}
