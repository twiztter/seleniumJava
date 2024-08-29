package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void INavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to a {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When("I select Elegir Plan")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }

    @And("I|The user|The client) (select|selects) Introduccion al Testing")
    public void navigateToIntro() {
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.clickIntroduccionTestingLink();
    }

    @Then("I|The user|The client) can validate the options in the checkout page")
    public void validateCheckoutPland(){
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 13 productos","Academia: $176 / año • 13 productos","Free: Gratis • 3 productos");

        Assert.assertEquals(listaEsperada, lista);

    }

/* 1. assertEquals

Verifica que dos valores sean iguales.

  Assert.assertEquals(actualTitle, expectedTitle, "El título de la página no es el esperado.");

2. assertNotEquals

Verifica que dos valores no sean iguales.

   Assert.assertNotEquals(actualTitle, incorrectTitle, "El título de la página no debería ser este.");

3. assertTrue

Verifica que una condición sea verdadera.

  Assert.assertTrue(isElementPresent, "El elemento debería estar presente.");

4. assertFalse

Verifica que una condición sea falsa.

   Assert.assertFalse(isElementPresent, "El elemento no debería estar presente."); */
}
