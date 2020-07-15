package com.certificacion.prueba.retoDrezze.tasks;


import com.certificacion.prueba.retoDrezze.models.DatosAgregarDireccion;
import com.certificacion.prueba.retoDrezze.userinterfaces.IngresarDatosDireccionUserInterfaces;
import com.certificacion.prueba.retoDrezze.userinterfaces.IngresarUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class AgregarDireccion implements Task {
	private DatosAgregarDireccion datosAgregarDireccion;

	public AgregarDireccion(DatosAgregarDireccion datosAgregarDireccion) {

		this.datosAgregarDireccion = datosAgregarDireccion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(IngresarDatosDireccionUserInterfaces.INGRESA_BOTON_DIRECCION));
		actor.attemptsTo(Click.on(IngresarDatosDireccionUserInterfaces.INGRESA_BOTON_AGREGAR_DIRECCION));
        actor.attemptsTo(Enter.theValue(datosAgregarDireccion.getDireccion1())
				.into(IngresarDatosDireccionUserInterfaces.INGRESA_DIRECCION1));
		actor.attemptsTo(Enter.theValue(datosAgregarDireccion.getDireccion2())
				.into(IngresarDatosDireccionUserInterfaces.INGRESA_DIRECCION2));


	}

	public static AgregarDireccion conDatos(DatosAgregarDireccion datosAgregarDireccion) {

		return new AgregarDireccion(datosAgregarDireccion);
	}
}
