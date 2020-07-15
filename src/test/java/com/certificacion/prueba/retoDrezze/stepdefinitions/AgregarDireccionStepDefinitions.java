package com.certificacion.prueba.retoDrezze.stepdefinitions;

import com.certificacion.prueba.retoDrezze.models.DatosAgregarDireccion;
import com.certificacion.prueba.retoDrezze.questions.IngresarDireccion;
import com.certificacion.prueba.retoDrezze.tasks.AgregarDireccion;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarDireccionStepDefinitions {

    @Dado("^el Analista se encuentra en la pantalla de agregar direccion y digita los datos$")
    public void elAnalistaSeEncuentraEnLaPantallaDeAgregarExperienciaYDigitaLosDatos(List<DatosAgregarDireccion> datosAgregarDireccion) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarDireccion.conDatos(datosAgregarDireccion.get(0)));
    }

    @Entonces("^el deberia ver en el mensaje (.*)$")
    public void elDeberiaVerEnElMensajeKilometroCasa(String tituloCargo) {
        theActorInTheSpotlight().should(seeThat(IngresarDireccion.mensaje(tituloCargo),
                org.hamcrest.Matchers.is(tituloCargo)));
    }

}
