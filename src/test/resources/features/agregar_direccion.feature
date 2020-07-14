#language: es
Característica: Prueba de agregar una direcciòn
  Como analista de calidad se desea validar el correcto
  funcionamiento de agregar una nueva direccciòn.

  Antecedentes: Inicio sesión
    Dado que Elvis esta en el portal
    Cuando el ingresa la información para ingresar
      | usuario         | contrasena         |
      | usuarioLinkedin | contraseñaLinkedin |


  Escenario: El Usuario desea registrar una nueva direcciòn
    Dado el Analista se encuentra en la pantalla de agregar experiencia y digita los datos

      | direccion1 | direccion2 | cuidad | estado | codigoPostal | pais | numeroCasa | numeroCelular | informacionAdicional | tituloDireccion |
      |            |            |        |        |              |      |            |               |                      |                 |
    Entonces el deberia ver en el mensaje Kilometro 7 Casa 454