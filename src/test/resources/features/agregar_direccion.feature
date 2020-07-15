#language: es
Característica: Prueba de agregar una direcciòn
  Como analista de calidad se desea validar el correcto
  funcionamiento de agregar una nueva direccciòn.


  Antecedentes: ingresar al sistema por primera vez
    Dado que Elvis esta en el portal
    Cuando el ingresa la información para ingresar
      | usuario                        | contrasena |
      | elmielesguarin@poligran.edu.co | Poli*2019  |


  Escenario: El Usuario desea registrar una nueva direcciòn
    Dado el Analista se encuentra en la pantalla de agregar direccion y digita los datos

      | direccion1                      | direccion2               | cuidad   | estado  | codigoPostal | pais          | numeroCasa | numeroCelular | informacionAdicional     | tituloDireccion      |
      | Santo domingo el pinar Casa 454 | Antigua Carretera Guarne | Medellin | Alabama | 90005        | United States | 3045410190 |               | Casa azul con una palma | Kilometro 7 Casa 454 |
    Entonces el deberia ver en el mensaje Kilometro 7 Casa 454