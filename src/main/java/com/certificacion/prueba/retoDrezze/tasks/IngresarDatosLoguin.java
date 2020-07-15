package com.certificacion.prueba.retoDrezze.tasks;
import com.certificacion.prueba.retoDrezze.models.*;

import com.certificacion.prueba.retoDrezze.userinterfaces.IngresarUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class IngresarDatosLoguin implements Task {

	 private DatosIngreso datosIngreso;

	    public IngresarDatosLoguin(DatosIngreso datosIngreso) {

	        this.datosIngreso = datosIngreso;
	    }

	    @Override
	    public <T extends Actor> void performAs(T actor) {
	    	
	        actor.attemptsTo(Click.on(IngresarUserInterfaces.INGRESA_BOTON_LOGUIN));
	       actor.attemptsTo(Enter.theValue(datosIngreso.getUsuario()).into(IngresarUserInterfaces.INGRESA_EMAIL));
	       actor.attemptsTo(Enter.theValue(datosIngreso.getContrasena()).into(IngresarUserInterfaces.INGRESA_CONTRASENA));
	        actor.attemptsTo(Click.on(IngresarUserInterfaces.INGRESA_BOTON_DE_INGRESAR));
	    }

	public static IngresarDatosLoguin conDatos(DatosIngreso datosIngreso){
		return new IngresarDatosLoguin(datosIngreso);
	}
	    
}
