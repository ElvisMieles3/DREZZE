package com.certificacion.prueba.retoDrezze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarUserInterfaces {

    public static final Target INGRESA_BOTON_LOGUIN = Target
            .the("Selecciona el boton de ingresar")
            .locatedBy("//a[@class='login']");

    public static final Target INGRESA_EMAIL = Target
            .the("Digita el correo")
            .located(By.id("email"));

    public static final Target INGRESA_CONTRASENA = Target
            .the("Digita el contraseña")
            .located(By.id("passwd"));

    public static final Target INGRESA_BOTON_DE_INGRESAR = Target
            .the("Selecciona el boton para ingresa")
            .locatedBy("//i[@class='icon-lock left']");

    public static final  Target MENSAJE_RESPUESTA = Target
            .the("Valida el nombre del usuario")
            .locatedBy("//*[text() = 'Elvis Miguel Mieles Guarin']");



}
