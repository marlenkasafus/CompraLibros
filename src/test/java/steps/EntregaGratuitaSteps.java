package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EntregaGratuitaSteps {

    @Given("^el comprador es un cliente (.*)$")
    public void indicarTipoClienteQueRealizaElPedido(String tipoCliente) {

    }

    @When("^realiza la compra de (.*) (.*)$")
    public void agregaProductosAlPedido(Integer cantidad, String producto) {

    }

    @Then("^debe pagar (.*)$")
    public void debePagar(int valorPagar) {

    }
}
