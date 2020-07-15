package com.certificacion.prueba.retoDrezze.stepdefinitions;


import com.certificacion.prueba.retoDrezze.models.DatosIngreso;
import com.certificacion.prueba.retoDrezze.questions.IngresarLoguin;
import com.certificacion.prueba.retoDrezze.tasks.AbrirNavegador;
import com.certificacion.prueba.retoDrezze.tasks.IngresarDatosLoguin;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class IngresarStepdefinitions {


    @Managed
    private WebDriver miNavegador;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(miNavegador)));

        theActorCalled("Elvis");
    }

    @Given("^que (.*) esta en el portal$")
    public void queElvisEstaEnElPortal(Actor actor) {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.navegador());
    }


    @When("^el ingresa la información para ingresar$")
    public void elIngresaLaInformaciónParaIngresar(List<DatosIngreso> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatosLoguin.conDatos(datos.get(0)));
    }

    @Then("^el usuario debe ver el nombre (.*)$")
    public void elUsuarioDebeVerElNombre(String nombreUsuario) {
        theActorInTheSpotlight().should(seeThat(IngresarLoguin.mensaje(),
                org.hamcrest.Matchers.is(nombreUsuario)));
    }

}
