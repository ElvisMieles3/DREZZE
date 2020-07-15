package com.certificacion.prueba.retoDrezze.tasks;


import com.certificacion.prueba.retoDrezze.interation.WaitInteration;
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
		actor.attemptsTo(Enter.theValue(datosAgregarDireccion.getCuidad())
				.into(IngresarDatosDireccionUserInterfaces.INGRESA_CUIDAD));
		actor.attemptsTo(Click.on(IngresarDatosDireccionUserInterfaces.INGRESA_ESTADO
				.of(datosAgregarDireccion.getEstado())));
		actor.attemptsTo(Enter.theValue(datosAgregarDireccion.getCodigoPostal())
				.into(IngresarDatosDireccionUserInterfaces.INGRESA_CODIGO_POSTAL));
		actor.attemptsTo(Click.on(IngresarDatosDireccionUserInterfaces.INGRESA_PAIS
				.of(datosAgregarDireccion.getPais())));

		actor.attemptsTo(Enter.theValue(datosAgregarDireccion.getNumeroCasa())
				.into(IngresarDatosDireccionUserInterfaces.INGRESA_NUMERO_CASA));

		actor.attemptsTo(Enter.theValue(datosAgregarDireccion.getNumeroCelular())
				.into(IngresarDatosDireccionUserInterfaces.INGRESA_NUMERO_CELULAR));

		actor.attemptsTo(Enter.theValue(datosAgregarDireccion.getInformacionAdicional())
				.into(IngresarDatosDireccionUserInterfaces.INGRESA_INFORMACIÒN_ADDICIONAL));

		actor.attemptsTo(Enter.theValue(datosAgregarDireccion.getTituloDireccion())
				.into(IngresarDatosDireccionUserInterfaces.INGRESA_TITULO_DIRECCION));

		actor.attemptsTo(Click.on(IngresarDatosDireccionUserInterfaces.SELECCIONA_BOTON_GUARDAR));

	}

	public static AgregarDireccion conDatos(DatosAgregarDireccion datosAgregarDireccion) {

		return new AgregarDireccion(datosAgregarDireccion);
	}
}
