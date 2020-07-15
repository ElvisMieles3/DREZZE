package com.certificacion.prueba.retoDrezze.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/agregar_direccion.feature"
        , glue = "com.certificacion.prueba.retoDrezze.stepdefinitions"
        , snippets = SnippetType.CAMELCASE)
public class AgregarDireccionRunner {
}
