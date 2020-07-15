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
            .the("Ingresa  el campo Direcciòn 1 ")
            .located(By.id("address1"));

    public static final Target INGRESA_DIRECCION2 = Target
            .the("Ingresa  el campo Direcciòn 2 ")
            .located(By.id("address2"));

    public static final Target INGRESA_CUIDAD = Target
            .the("Ingresa  el campo Cuidad ")
            .located(By.id("city"));

    public static final Target INGRESA_ESTADO = Target
            .the("Ingresa  el campo Estado ")
            .locatedBy("//select[@id='id_state']//option[.='{0}']");


    public static final Target INGRESA_CODIGO_POSTAL = Target
            .the("Ingresa  el campo codigo postal ")
            .located(By.id("postcode"));

    public static final Target INGRESA_PAIS = Target
            .the("Ingresa  el campo Pais ")
            .locatedBy("//select[@id='id_country']//option[.='{0}']");

    public static final Target INGRESA_NUMERO_CASA = Target
            .the("Ingresa  el campo numero telefonico de la casa ")
            .located(By.id("phone"));

    public static final Target INGRESA_NUMERO_CELULAR = Target
            .the("Ingresa  el campo numero telefonico del celular ")
            .located(By.id("phone_mobile"));

    public static final Target INGRESA_INFORMACIÒN_ADDICIONAL = Target
            .the("Ingresa  el campo informaciòn adicional de la direccion ")
            .located(By.id("other"));

    public static final Target INGRESA_TITULO_DIRECCION= Target
            .the("Ingresa  el Titulo de la cirrecion ")
            .located(By.id("alias"));

    public static final Target SELECCIONA_BOTON_GUARDAR= Target
            .the("Guarda la informaciòn ingresada")
            .located(By.id("submitAddress"));



}
