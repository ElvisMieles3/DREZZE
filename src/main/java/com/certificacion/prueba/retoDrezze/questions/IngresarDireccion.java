package com.certificacion.prueba.retoDrezze.questions;

import com.certificacion.prueba.retoDrezze.userinterfaces.IngresarDatosDireccionUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class IngresarDireccion implements Question<String> {

	private String descripcion;

	public IngresarDireccion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(WaitUntil.the((IngresarDatosDireccionUserInterfaces.MENSAJE_RESPUESTA_DIRECCION.of(descripcion)),
				WebElementStateMatchers.isVisible()));
		return Text.of(IngresarDatosDireccionUserInterfaces.MENSAJE_RESPUESTA_DIRECCION.of(descripcion)).viewedBy(actor).asString();

	}

	public static IngresarDireccion mensaje(String tituloCargo) {
		return new IngresarDireccion(tituloCargo);
	}

}
