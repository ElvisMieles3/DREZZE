package com.certificacion.prueba.retoDrezze.questions;

import com.certificacion.prueba.retoDrezze.userinterfaces.IngresarUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;



public class IngresarLoguin implements Question<String> {
	

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(WaitUntil.the((IngresarUserInterfaces.MENSAJE_RESPUESTA), WebElementStateMatchers.isVisible()));
        return Text.of(IngresarUserInterfaces.MENSAJE_RESPUESTA).viewedBy(actor).asString();
		
	}

	public static IngresarLoguin mensaje(){

		return new IngresarLoguin();
	}
	

}
