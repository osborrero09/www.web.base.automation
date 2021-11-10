package stepsdefinition;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.EmpleoTask;
import ui.EmpleoUI;


public class EmpleoStep {

    //Se realiza el llamado de la anotación Before de Cucumber.api.java

    Actor Cliente;

    @Before
    public void prepararElEscenario() {
        OnStage.setTheStage(new OnlineCast());
        Cliente = Actor.named("CLIENTE");
        Cliente.can(BrowseTheWeb.with(driver));


    }

    @Managed
    WebDriver driver;


    @Given("Usuario abre la pagina de valid")
    public void usuario_abre_la_pagina_de_valid() {
          Cliente.attemptsTo(Open.browserOn().the(EmpleoUI.class));
          Cliente.attemptsTo(EmpleoTask.IngresarEmpleo());

    }

    @When("El Usuario esta en el home de Valid")
    public void el_Usuario_esta_en_el_home_de_Valid() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("El Usuario ingresa a la opcion de empleo")
    public void el_Usuario_ingresa_a_la_opcion_de_empleo() {
        // Write code here that turns the phrase above into concrete actions

    }


}
