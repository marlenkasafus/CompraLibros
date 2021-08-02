package steps;

import compraLibros.Pedido;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class EntregaGratuitaSteps {
    private Pedido pedido;
    private int costoEnvio;

    @Given("^el comprador es un cliente (.*)$")
    public void indicarTipoClienteQueRealizaElPedido(String tipoCliente) {
        pedido = new Pedido(tipoCliente);
    }

    @When("^realiza la compra de (.*) (.*)$")
    public void realizarLaCompraDeLibros(Integer cantidad, String producto) {
        pedido.agregarProducto(cantidad, producto);
        costoEnvio = pedido.calcularCostoEnvio();
    }

    @Then("^debe pagar (.*)$")
    public void debePagar(int valorPagar) {
        Assert.assertEquals(valorPagar, costoEnvio);
    }
}
