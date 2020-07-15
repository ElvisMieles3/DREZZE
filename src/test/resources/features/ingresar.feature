

Feature: yo como usuario del servicio
  Necesito ingresar los datos en el  portal
  Para ingresar en el sistema

  Scenario: ingresar al sistema por primera vez
    Given que Elvis esta en el portal
    When el ingresa la información para ingresar
      | usuario                        | contrasena |
      | elmielesguarin@poligran.edu.co | Poli*2019  |
    Then el usuario debe ver el nombre Elvis Miguel Mieles Guarin

