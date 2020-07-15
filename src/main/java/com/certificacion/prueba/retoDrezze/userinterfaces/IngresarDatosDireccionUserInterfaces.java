package com.certificacion.prueba.retoDrezze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatosDireccionUserInterfaces {

    public static final Target INGRESA_BOTON_DIRECCION = Target
            .the("Selecciona el boton, para ingresar a la pantalla de direcciones")
            .locatedBy("//*[@class= 'icon-building']");

    public static final Target INGRESA_BOTON_AGREGAR_DIRECCION = Target
            .the("Selecciona el boton, para ingresar al formulario ")
            .locatedBy("//*[@title='Add an address']");

    public static final Target INGRESA_DIRECCION1 = Target
            .the("Ingresa la el campo Direcciòn 1 ")
            .located(By.id("address1"));

    public static final Target INGRESA_DIRECCION2 = Target
            .the("Ingresa la el campo Direcciòn 1 ")
            .located(By.id("address2"));



}
